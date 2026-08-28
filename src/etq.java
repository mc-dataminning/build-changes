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

public class etq extends eug {
   private static final Map<alb, etq.c> b = Stream.of(etq.a.a, etq.d.b, etq.e.b).collect(Collectors.toMap(etq.c::a, Function.identity()));
   private static final Codec<etq.c> c = alb.a.comapFlatMap($$0 -> {
      etq.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, etq.c::a);
   private static final MapCodec<etq.b> d = ayl.a("formula", "parameters", c, etq.b::a, etq.c::b);
   public static final MapCodec<etq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(daw.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, etq::new)
   );
   private final jn<daw> e;
   private final etq.b f;

   private etq(List<ewe> $$0, jn<daw> $$1, etq.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eui<etq> b() {
      return euj.x;
   }

   @Override
   public Set<evm<?>> a() {
      return ImmutableSet.of(evp.i);
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      cvl $$2 = $$1.c(evp.i);
      if ($$2 != null) {
         int $$3 = day.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.J(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static eug.a<?> a(jn<daw> $$0, float $$1, int $$2) {
      return a($$3 -> new etq($$3, $$0, new etq.a($$2, $$1)));
   }

   public static eug.a<?> a(jn<daw> $$0) {
      return a($$1 -> new etq($$1, $$0, new etq.d()));
   }

   public static eug.a<?> b(jn<daw> $$0) {
      return a($$1 -> new etq($$1, $$0, new etq.e(1)));
   }

   public static eug.a<?> a(jn<daw> $$0, int $$1) {
      return a($$2 -> new etq($$2, $$0, new etq.e($$1)));
   }

   static record a(int b, float c) implements etq.b {
      private static final Codec<etq.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(etq.a::b), Codec.FLOAT.fieldOf("probability").forGetter(etq.a::c)).apply($$0, etq.a::new)
      );
      public static final etq.c a = new etq.c(alb.b("binomial_with_bonus_count"), d);

      @Override
      public int a(azk $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public etq.c a() {
         return a;
      }
   }

   interface b {
      int a(azk var1, int var2, int var3);

      etq.c a();
   }

   static record c(alb a, Codec<? extends etq.b> b) {
   }

   static record d() implements etq.b {
      public static final Codec<etq.d> a = Codec.unit(etq.d::new);
      public static final etq.c b = new etq.c(alb.b("ore_drops"), a);

      @Override
      public int a(azk $$0, int $$1, int $$2) {
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
      public etq.c a() {
         return b;
      }
   }

   static record e(int c) implements etq.b {
      public static final Codec<etq.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(etq.e::b)).apply($$0, etq.e::new)
      );
      public static final etq.c b = new etq.c(alb.b("uniform_bonus_count"), a);

      @Override
      public int a(azk $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public etq.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
