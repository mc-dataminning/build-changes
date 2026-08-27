import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eky extends elk {
   private static final Map<ajc, eky.c> b = Stream.of(eky.a.a, eky.d.b, eky.e.b).collect(Collectors.toMap(eky.c::a, Function.identity()));
   private static final Codec<eky.c> c = ajc.a.comapFlatMap($$0 -> {
      eky.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, eky.c::a);
   private static final MapCodec<eky.b> d = avu.a("formula", "parameters", c, eky.b::a, eky.c::b);
   public static final Codec<eky> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(kh.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, eky::new)
   );
   private final il<ctz> e;
   private final eky.b f;

   private eky(List<emx> $$0, il<ctz> $$1, eky.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public elm b() {
      return eln.r;
   }

   @Override
   public Set<emg<?>> a() {
      return ImmutableSet.of(emj.i);
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      cpq $$2 = $$1.c(emj.i);
      if ($$2 != null) {
         int $$3 = cua.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static elk.a<?> a(ctz $$0, float $$1, int $$2) {
      return a($$3 -> new eky($$3, $$0.k(), new eky.a($$2, $$1)));
   }

   public static elk.a<?> a(ctz $$0) {
      return a($$1 -> new eky($$1, $$0.k(), new eky.d()));
   }

   public static elk.a<?> b(ctz $$0) {
      return a($$1 -> new eky($$1, $$0.k(), new eky.e(1)));
   }

   public static elk.a<?> a(ctz $$0, int $$1) {
      return a($$2 -> new eky($$2, $$0.k(), new eky.e($$1)));
   }

   static record a(int b, float c) implements eky.b {
      private static final Codec<eky.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(eky.a::b), Codec.FLOAT.fieldOf("probability").forGetter(eky.a::c)).apply($$0, eky.a::new)
      );
      public static final eky.c a = new eky.c(new ajc("binomial_with_bonus_count"), d);

      @Override
      public int a(awt $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public eky.c a() {
         return a;
      }
   }

   interface b {
      int a(awt var1, int var2, int var3);

      eky.c a();
   }

   static record c(ajc a, Codec<? extends eky.b> b) {
   }

   static record d() implements eky.b {
      public static final Codec<eky.d> a = Codec.unit(eky.d::new);
      public static final eky.c b = new eky.c(new ajc("ore_drops"), a);

      @Override
      public int a(awt $$0, int $$1, int $$2) {
         if ($$2 > 0) {
            int $$3 = $$0.a($$2 + 2) - 1;
            if ($$3 < 0) {
               $$3 = 0;
            }

            return $$1 * ($$3 + 1);
         } else {
            return $$1;
         }
      }

      @Override
      public eky.c a() {
         return b;
      }
   }

   static record e(int c) implements eky.b {
      public static final Codec<eky.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(eky.e::b)).apply($$0, eky.e::new)
      );
      public static final eky.c b = new eky.c(new ajc("uniform_bonus_count"), a);

      @Override
      public int a(awt $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public eky.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
