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

public class ere extends ert {
   private static final Map<ale, ere.c> b = Stream.of(ere.a.a, ere.d.b, ere.e.b).collect(Collectors.toMap(ere.c::a, Function.identity()));
   private static final Codec<ere.c> c = ale.a.comapFlatMap($$0 -> {
      ere.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, ere.c::a);
   private static final MapCodec<ere.b> d = ayg.a("formula", "parameters", c, ere.b::a, ere.c::b);
   public static final MapCodec<ere> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(lp.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, ere::new)
   );
   private final ji<czz> e;
   private final ere.b f;

   private ere(List<etr> $$0, ji<czz> $$1, ere.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public erv<ere> b() {
      return erw.x;
   }

   @Override
   public Set<eta<?>> a() {
      return ImmutableSet.of(etd.i);
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      cuo $$2 = $$1.c(etd.i);
      if ($$2 != null) {
         int $$3 = daa.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.I(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static ert.a<?> a(czz $$0, float $$1, int $$2) {
      return a($$3 -> new ere($$3, $$0.m(), new ere.a($$2, $$1)));
   }

   public static ert.a<?> a(czz $$0) {
      return a($$1 -> new ere($$1, $$0.m(), new ere.d()));
   }

   public static ert.a<?> b(czz $$0) {
      return a($$1 -> new ere($$1, $$0.m(), new ere.e(1)));
   }

   public static ert.a<?> a(czz $$0, int $$1) {
      return a($$2 -> new ere($$2, $$0.m(), new ere.e($$1)));
   }

   static record a(int b, float c) implements ere.b {
      private static final Codec<ere.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(ere.a::b), Codec.FLOAT.fieldOf("probability").forGetter(ere.a::c)).apply($$0, ere.a::new)
      );
      public static final ere.c a = new ere.c(new ale("binomial_with_bonus_count"), d);

      @Override
      public int a(azg $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public ere.c a() {
         return a;
      }
   }

   interface b {
      int a(azg var1, int var2, int var3);

      ere.c a();
   }

   static record c(ale a, Codec<? extends ere.b> b) {
   }

   static record d() implements ere.b {
      public static final Codec<ere.d> a = Codec.unit(ere.d::new);
      public static final ere.c b = new ere.c(new ale("ore_drops"), a);

      @Override
      public int a(azg $$0, int $$1, int $$2) {
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
      public ere.c a() {
         return b;
      }
   }

   static record e(int c) implements ere.b {
      public static final Codec<ere.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(ere.e::b)).apply($$0, ere.e::new)
      );
      public static final ere.c b = new ere.c(new ale("uniform_bonus_count"), a);

      @Override
      public int a(azg $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public ere.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
