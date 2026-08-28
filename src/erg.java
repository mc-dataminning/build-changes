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

public class erg extends erv {
   private static final Map<alf, erg.c> b = Stream.of(erg.a.a, erg.d.b, erg.e.b).collect(Collectors.toMap(erg.c::a, Function.identity()));
   private static final Codec<erg.c> c = alf.a.comapFlatMap($$0 -> {
      erg.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, erg.c::a);
   private static final MapCodec<erg.b> d = ayh.a("formula", "parameters", c, erg.b::a, erg.c::b);
   public static final MapCodec<erg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(lp.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, erg::new)
   );
   private final ji<dab> e;
   private final erg.b f;

   private erg(List<ett> $$0, ji<dab> $$1, erg.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public erx<erg> b() {
      return ery.x;
   }

   @Override
   public Set<etc<?>> a() {
      return ImmutableSet.of(etf.i);
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      cuq $$2 = $$1.c(etf.i);
      if ($$2 != null) {
         int $$3 = dac.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.I(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static erv.a<?> a(dab $$0, float $$1, int $$2) {
      return a($$3 -> new erg($$3, $$0.m(), new erg.a($$2, $$1)));
   }

   public static erv.a<?> a(dab $$0) {
      return a($$1 -> new erg($$1, $$0.m(), new erg.d()));
   }

   public static erv.a<?> b(dab $$0) {
      return a($$1 -> new erg($$1, $$0.m(), new erg.e(1)));
   }

   public static erv.a<?> a(dab $$0, int $$1) {
      return a($$2 -> new erg($$2, $$0.m(), new erg.e($$1)));
   }

   static record a(int b, float c) implements erg.b {
      private static final Codec<erg.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(erg.a::b), Codec.FLOAT.fieldOf("probability").forGetter(erg.a::c)).apply($$0, erg.a::new)
      );
      public static final erg.c a = new erg.c(new alf("binomial_with_bonus_count"), d);

      @Override
      public int a(azh $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public erg.c a() {
         return a;
      }
   }

   interface b {
      int a(azh var1, int var2, int var3);

      erg.c a();
   }

   static record c(alf a, Codec<? extends erg.b> b) {
   }

   static record d() implements erg.b {
      public static final Codec<erg.d> a = Codec.unit(erg.d::new);
      public static final erg.c b = new erg.c(new alf("ore_drops"), a);

      @Override
      public int a(azh $$0, int $$1, int $$2) {
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
      public erg.c a() {
         return b;
      }
   }

   static record e(int c) implements erg.b {
      public static final Codec<erg.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(erg.e::b)).apply($$0, erg.e::new)
      );
      public static final erg.c b = new erg.c(new alf("uniform_bonus_count"), a);

      @Override
      public int a(azh $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public erg.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
