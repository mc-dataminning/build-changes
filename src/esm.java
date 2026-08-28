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

public class esm extends etc {
   private static final Map<akr, esm.c> b = Stream.of(esm.a.a, esm.d.b, esm.e.b).collect(Collectors.toMap(esm.c::a, Function.identity()));
   private static final Codec<esm.c> c = akr.a.comapFlatMap($$0 -> {
      esm.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, esm.c::a);
   private static final MapCodec<esm.b> d = axw.a("formula", "parameters", c, esm.b::a, esm.c::b);
   public static final MapCodec<esm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dac.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, esm::new)
   );
   private final jm<dac> e;
   private final esm.b f;

   private esm(List<eva> $$0, jm<dac> $$1, esm.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public ete<esm> b() {
      return etf.x;
   }

   @Override
   public Set<eui<?>> a() {
      return ImmutableSet.of(eul.i);
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      cuq $$2 = $$1.c(eul.i);
      if ($$2 != null) {
         int $$3 = dae.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.H(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static etc.a<?> a(jm<dac> $$0, float $$1, int $$2) {
      return a($$3 -> new esm($$3, $$0, new esm.a($$2, $$1)));
   }

   public static etc.a<?> a(jm<dac> $$0) {
      return a($$1 -> new esm($$1, $$0, new esm.d()));
   }

   public static etc.a<?> b(jm<dac> $$0) {
      return a($$1 -> new esm($$1, $$0, new esm.e(1)));
   }

   public static etc.a<?> a(jm<dac> $$0, int $$1) {
      return a($$2 -> new esm($$2, $$0, new esm.e($$1)));
   }

   static record a(int b, float c) implements esm.b {
      private static final Codec<esm.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(esm.a::b), Codec.FLOAT.fieldOf("probability").forGetter(esm.a::c)).apply($$0, esm.a::new)
      );
      public static final esm.c a = new esm.c(akr.b("binomial_with_bonus_count"), d);

      @Override
      public int a(ayw $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public esm.c a() {
         return a;
      }
   }

   interface b {
      int a(ayw var1, int var2, int var3);

      esm.c a();
   }

   static record c(akr a, Codec<? extends esm.b> b) {
   }

   static record d() implements esm.b {
      public static final Codec<esm.d> a = Codec.unit(esm.d::new);
      public static final esm.c b = new esm.c(akr.b("ore_drops"), a);

      @Override
      public int a(ayw $$0, int $$1, int $$2) {
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
      public esm.c a() {
         return b;
      }
   }

   static record e(int c) implements esm.b {
      public static final Codec<esm.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(esm.e::b)).apply($$0, esm.e::new)
      );
      public static final esm.c b = new esm.c(akr.b("uniform_bonus_count"), a);

      @Override
      public int a(ayw $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public esm.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
