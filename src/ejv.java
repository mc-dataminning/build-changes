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

public class ejv extends ekh {
   private static final Map<aiy, ejv.c> b = Stream.of(ejv.a.a, ejv.d.b, ejv.e.b).collect(Collectors.toMap(ejv.c::a, Function.identity()));
   private static final Codec<ejv.c> c = aiy.a.comapFlatMap($$0 -> {
      ejv.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, ejv.c::a);
   private static final MapCodec<ejv.b> d = avp.a("formula", "parameters", c, ejv.b::a, ejv.c::b);
   public static final Codec<ejv> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(kf.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, ejv::new)
   );
   private final ij<cti> e;
   private final ejv.b f;

   private ejv(List<elu> $$0, ij<cti> $$1, ejv.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public ekj b() {
      return ekk.r;
   }

   @Override
   public Set<eld<?>> a() {
      return ImmutableSet.of(elg.i);
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      coz $$2 = $$1.c(elg.i);
      if ($$2 != null) {
         int $$3 = ctj.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static ekh.a<?> a(cti $$0, float $$1, int $$2) {
      return a($$3 -> new ejv($$3, $$0.k(), new ejv.a($$2, $$1)));
   }

   public static ekh.a<?> a(cti $$0) {
      return a($$1 -> new ejv($$1, $$0.k(), new ejv.d()));
   }

   public static ekh.a<?> b(cti $$0) {
      return a($$1 -> new ejv($$1, $$0.k(), new ejv.e(1)));
   }

   public static ekh.a<?> a(cti $$0, int $$1) {
      return a($$2 -> new ejv($$2, $$0.k(), new ejv.e($$1)));
   }

   static record a(int b, float c) implements ejv.b {
      private static final Codec<ejv.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(ejv.a::b), Codec.FLOAT.fieldOf("probability").forGetter(ejv.a::c)).apply($$0, ejv.a::new)
      );
      public static final ejv.c a = new ejv.c(new aiy("binomial_with_bonus_count"), d);

      @Override
      public int a(awo $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public ejv.c a() {
         return a;
      }
   }

   interface b {
      int a(awo var1, int var2, int var3);

      ejv.c a();
   }

   static record c(aiy a, Codec<? extends ejv.b> b) {
   }

   static record d() implements ejv.b {
      public static final Codec<ejv.d> a = Codec.unit(ejv.d::new);
      public static final ejv.c b = new ejv.c(new aiy("ore_drops"), a);

      @Override
      public int a(awo $$0, int $$1, int $$2) {
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
      public ejv.c a() {
         return b;
      }
   }

   static record e(int c) implements ejv.b {
      public static final Codec<ejv.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(ejv.e::b)).apply($$0, ejv.e::new)
      );
      public static final ejv.c b = new ejv.c(new aiy("uniform_bonus_count"), a);

      @Override
      public int a(awo $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public ejv.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
