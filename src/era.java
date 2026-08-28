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

public class era extends erp {
   private static final Map<alb, era.c> b = Stream.of(era.a.a, era.d.b, era.e.b).collect(Collectors.toMap(era.c::a, Function.identity()));
   private static final Codec<era.c> c = alb.a.comapFlatMap($$0 -> {
      era.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, era.c::a);
   private static final MapCodec<era.b> d = ayc.a("formula", "parameters", c, era.b::a, era.c::b);
   public static final MapCodec<era> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(lp.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, era::new)
   );
   private final ji<czv> e;
   private final era.b f;

   private era(List<etn> $$0, ji<czv> $$1, era.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public err<era> b() {
      return ers.x;
   }

   @Override
   public Set<esw<?>> a() {
      return ImmutableSet.of(esz.i);
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      cuk $$2 = $$1.c(esz.i);
      if ($$2 != null) {
         int $$3 = czw.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.I(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static erp.a<?> a(czv $$0, float $$1, int $$2) {
      return a($$3 -> new era($$3, $$0.m(), new era.a($$2, $$1)));
   }

   public static erp.a<?> a(czv $$0) {
      return a($$1 -> new era($$1, $$0.m(), new era.d()));
   }

   public static erp.a<?> b(czv $$0) {
      return a($$1 -> new era($$1, $$0.m(), new era.e(1)));
   }

   public static erp.a<?> a(czv $$0, int $$1) {
      return a($$2 -> new era($$2, $$0.m(), new era.e($$1)));
   }

   static record a(int b, float c) implements era.b {
      private static final Codec<era.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(era.a::b), Codec.FLOAT.fieldOf("probability").forGetter(era.a::c)).apply($$0, era.a::new)
      );
      public static final era.c a = new era.c(new alb("binomial_with_bonus_count"), d);

      @Override
      public int a(azc $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public era.c a() {
         return a;
      }
   }

   interface b {
      int a(azc var1, int var2, int var3);

      era.c a();
   }

   static record c(alb a, Codec<? extends era.b> b) {
   }

   static record d() implements era.b {
      public static final Codec<era.d> a = Codec.unit(era.d::new);
      public static final era.c b = new era.c(new alb("ore_drops"), a);

      @Override
      public int a(azc $$0, int $$1, int $$2) {
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
      public era.c a() {
         return b;
      }
   }

   static record e(int c) implements era.b {
      public static final Codec<era.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(era.e::b)).apply($$0, era.e::new)
      );
      public static final era.c b = new era.c(new alb("uniform_bonus_count"), a);

      @Override
      public int a(azc $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public era.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
