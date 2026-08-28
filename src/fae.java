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

public class fae extends fau {
   private static final Map<alg, fae.c> b = Stream.of(fae.a.a, fae.d.b, fae.e.b).collect(Collectors.toMap(fae.c::a, Function.identity()));
   private static final Codec<fae.c> c = alg.a.comapFlatMap($$0 -> {
      fae.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, fae.c::a);
   private static final MapCodec<fae.b> d = ayu.a("formula", "parameters", c, fae.b::a, fae.c::b);
   public static final MapCodec<fae> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dfq.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, fae::new)
   );
   private final je<dfq> e;
   private final fae.b f;

   private fae(List<fcq> $$0, je<dfq> $$1, fae.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public faw<fae> b() {
      return fax.x;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcb.i);
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      czd $$2 = $$1.c(fcb.i);
      if ($$2 != null) {
         int $$3 = dfs.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static fau.a<?> a(je<dfq> $$0, float $$1, int $$2) {
      return a($$3 -> new fae($$3, $$0, new fae.a($$2, $$1)));
   }

   public static fau.a<?> a(je<dfq> $$0) {
      return a($$1 -> new fae($$1, $$0, new fae.d()));
   }

   public static fau.a<?> b(je<dfq> $$0) {
      return a($$1 -> new fae($$1, $$0, new fae.e(1)));
   }

   public static fau.a<?> a(je<dfq> $$0, int $$1) {
      return a($$2 -> new fae($$2, $$0, new fae.e($$1)));
   }

   static record a(int b, float c) implements fae.b {
      private static final Codec<fae.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(fae.a::b), Codec.FLOAT.fieldOf("probability").forGetter(fae.a::c)).apply($$0, fae.a::new)
      );
      public static final fae.c a = new fae.c(alg.b("binomial_with_bonus_count"), d);

      @Override
      public int a(azv $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public fae.c a() {
         return a;
      }
   }

   interface b {
      int a(azv var1, int var2, int var3);

      fae.c a();
   }

   static record c(alg a, Codec<? extends fae.b> b) {
   }

   static record d() implements fae.b {
      public static final Codec<fae.d> a = Codec.unit(fae.d::new);
      public static final fae.c b = new fae.c(alg.b("ore_drops"), a);

      @Override
      public int a(azv $$0, int $$1, int $$2) {
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
      public fae.c a() {
         return b;
      }
   }

   static record e(int c) implements fae.b {
      public static final Codec<fae.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(fae.e::b)).apply($$0, fae.e::new)
      );
      public static final fae.c b = new fae.c(alg.b("uniform_bonus_count"), a);

      @Override
      public int a(azv $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public fae.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
