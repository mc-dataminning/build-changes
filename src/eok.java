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

public class eok extends eox {
   private static final Map<ajv, eok.c> b = Stream.of(eok.a.a, eok.d.b, eok.e.b).collect(Collectors.toMap(eok.c::a, Function.identity()));
   private static final Codec<eok.c> c = ajv.a.comapFlatMap($$0 -> {
      eok.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, eok.c::a);
   private static final MapCodec<eok.b> d = awu.a("formula", "parameters", c, eok.b::a, eok.c::b);
   public static final Codec<eok> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(kt.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, eok::new)
   );
   private final in<cwz> e;
   private final eok.b f;

   private eok(List<eql> $$0, in<cwz> $$1, eok.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eoz b() {
      return epa.s;
   }

   @Override
   public Set<epu<?>> a() {
      return ImmutableSet.of(epx.i);
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      crs $$2 = $$1.c(epx.i);
      if ($$2 != null) {
         int $$3 = cxa.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.G(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static eox.a<?> a(cwz $$0, float $$1, int $$2) {
      return a($$3 -> new eok($$3, $$0.k(), new eok.a($$2, $$1)));
   }

   public static eox.a<?> a(cwz $$0) {
      return a($$1 -> new eok($$1, $$0.k(), new eok.d()));
   }

   public static eox.a<?> b(cwz $$0) {
      return a($$1 -> new eok($$1, $$0.k(), new eok.e(1)));
   }

   public static eox.a<?> a(cwz $$0, int $$1) {
      return a($$2 -> new eok($$2, $$0.k(), new eok.e($$1)));
   }

   static record a(int b, float c) implements eok.b {
      private static final Codec<eok.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(eok.a::b), Codec.FLOAT.fieldOf("probability").forGetter(eok.a::c)).apply($$0, eok.a::new)
      );
      public static final eok.c a = new eok.c(new ajv("binomial_with_bonus_count"), d);

      @Override
      public int a(axt $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public eok.c a() {
         return a;
      }
   }

   interface b {
      int a(axt var1, int var2, int var3);

      eok.c a();
   }

   static record c(ajv a, Codec<? extends eok.b> b) {
   }

   static record d() implements eok.b {
      public static final Codec<eok.d> a = Codec.unit(eok.d::new);
      public static final eok.c b = new eok.c(new ajv("ore_drops"), a);

      @Override
      public int a(axt $$0, int $$1, int $$2) {
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
      public eok.c a() {
         return b;
      }
   }

   static record e(int c) implements eok.b {
      public static final Codec<eok.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(eok.e::b)).apply($$0, eok.e::new)
      );
      public static final eok.c b = new eok.c(new ajv("uniform_bonus_count"), a);

      @Override
      public int a(axt $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public eok.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
