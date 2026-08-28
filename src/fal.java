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

public class fal extends fbb {
   private static final Map<alg, fal.c> b = Stream.of(fal.a.a, fal.d.b, fal.e.b).collect(Collectors.toMap(fal.c::a, Function.identity()));
   private static final Codec<fal.c> c = alg.a.comapFlatMap($$0 -> {
      fal.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, fal.c::a);
   private static final MapCodec<fal.b> d = ayu.a("formula", "parameters", c, fal.b::a, fal.c::b);
   public static final MapCodec<fal> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dfx.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, fal::new)
   );
   private final jf<dfx> e;
   private final fal.b f;

   private fal(List<fcx> $$0, jf<dfx> $$1, fal.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public fbd<fal> b() {
      return fbe.x;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fci.i);
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      czk $$2 = $$1.c(fci.i);
      if ($$2 != null) {
         int $$3 = dfz.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static fbb.a<?> a(jf<dfx> $$0, float $$1, int $$2) {
      return a($$3 -> new fal($$3, $$0, new fal.a($$2, $$1)));
   }

   public static fbb.a<?> a(jf<dfx> $$0) {
      return a($$1 -> new fal($$1, $$0, new fal.d()));
   }

   public static fbb.a<?> b(jf<dfx> $$0) {
      return a($$1 -> new fal($$1, $$0, new fal.e(1)));
   }

   public static fbb.a<?> a(jf<dfx> $$0, int $$1) {
      return a($$2 -> new fal($$2, $$0, new fal.e($$1)));
   }

   static record a(int b, float c) implements fal.b {
      private static final Codec<fal.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(fal.a::b), Codec.FLOAT.fieldOf("probability").forGetter(fal.a::c)).apply($$0, fal.a::new)
      );
      public static final fal.c a = new fal.c(alg.b("binomial_with_bonus_count"), d);

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
      public fal.c a() {
         return a;
      }
   }

   interface b {
      int a(azv var1, int var2, int var3);

      fal.c a();
   }

   static record c(alg a, Codec<? extends fal.b> b) {
   }

   static record d() implements fal.b {
      public static final Codec<fal.d> a = Codec.unit(fal.d::new);
      public static final fal.c b = new fal.c(alg.b("ore_drops"), a);

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
      public fal.c a() {
         return b;
      }
   }

   static record e(int c) implements fal.b {
      public static final Codec<fal.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(fal.e::b)).apply($$0, fal.e::new)
      );
      public static final fal.c b = new fal.c(alg.b("uniform_bonus_count"), a);

      @Override
      public int a(azv $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public fal.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
