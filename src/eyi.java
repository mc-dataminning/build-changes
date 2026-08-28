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

public class eyi extends eyy {
   private static final Map<ald, eyi.c> b = Stream.of(eyi.a.a, eyi.d.b, eyi.e.b).collect(Collectors.toMap(eyi.c::a, Function.identity()));
   private static final Codec<eyi.c> c = ald.a.comapFlatMap($$0 -> {
      eyi.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, eyi.c::a);
   private static final MapCodec<eyi.b> d = ays.a("formula", "parameters", c, eyi.b::a, eyi.c::b);
   public static final MapCodec<eyi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(deh.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, eyi::new)
   );
   private final js<deh> e;
   private final eyi.b f;

   private eyi(List<fau> $$0, js<deh> $$1, eyi.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eza<eyi> b() {
      return ezb.x;
   }

   @Override
   public Set<bat<?>> a() {
      return Set.of(faf.i);
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      cxy $$2 = $$1.c(faf.i);
      if ($$2 != null) {
         int $$3 = dej.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static eyy.a<?> a(js<deh> $$0, float $$1, int $$2) {
      return a($$3 -> new eyi($$3, $$0, new eyi.a($$2, $$1)));
   }

   public static eyy.a<?> a(js<deh> $$0) {
      return a($$1 -> new eyi($$1, $$0, new eyi.d()));
   }

   public static eyy.a<?> b(js<deh> $$0) {
      return a($$1 -> new eyi($$1, $$0, new eyi.e(1)));
   }

   public static eyy.a<?> a(js<deh> $$0, int $$1) {
      return a($$2 -> new eyi($$2, $$0, new eyi.e($$1)));
   }

   static record a(int b, float c) implements eyi.b {
      private static final Codec<eyi.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(eyi.a::b), Codec.FLOAT.fieldOf("probability").forGetter(eyi.a::c)).apply($$0, eyi.a::new)
      );
      public static final eyi.c a = new eyi.c(ald.b("binomial_with_bonus_count"), d);

      @Override
      public int a(azs $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public eyi.c a() {
         return a;
      }
   }

   interface b {
      int a(azs var1, int var2, int var3);

      eyi.c a();
   }

   static record c(ald a, Codec<? extends eyi.b> b) {
   }

   static record d() implements eyi.b {
      public static final Codec<eyi.d> a = Codec.unit(eyi.d::new);
      public static final eyi.c b = new eyi.c(ald.b("ore_drops"), a);

      @Override
      public int a(azs $$0, int $$1, int $$2) {
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
      public eyi.c a() {
         return b;
      }
   }

   static record e(int c) implements eyi.b {
      public static final Codec<eyi.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(eyi.e::b)).apply($$0, eyi.e::new)
      );
      public static final eyi.c b = new eyi.c(ald.b("uniform_bonus_count"), a);

      @Override
      public int a(azs $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public eyi.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
