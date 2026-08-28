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

public class erh extends erw {
   private static final Map<alf, erh.c> b = Stream.of(erh.a.a, erh.d.b, erh.e.b).collect(Collectors.toMap(erh.c::a, Function.identity()));
   private static final Codec<erh.c> c = alf.a.comapFlatMap($$0 -> {
      erh.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, erh.c::a);
   private static final MapCodec<erh.b> d = ayh.a("formula", "parameters", c, erh.b::a, erh.c::b);
   public static final MapCodec<erh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(lp.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, erh::new)
   );
   private final ji<dac> e;
   private final erh.b f;

   private erh(List<etu> $$0, ji<dac> $$1, erh.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public ery<erh> b() {
      return erz.x;
   }

   @Override
   public Set<etd<?>> a() {
      return ImmutableSet.of(etg.i);
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      cur $$2 = $$1.c(etg.i);
      if ($$2 != null) {
         int $$3 = dad.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.I(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static erw.a<?> a(dac $$0, float $$1, int $$2) {
      return a($$3 -> new erh($$3, $$0.m(), new erh.a($$2, $$1)));
   }

   public static erw.a<?> a(dac $$0) {
      return a($$1 -> new erh($$1, $$0.m(), new erh.d()));
   }

   public static erw.a<?> b(dac $$0) {
      return a($$1 -> new erh($$1, $$0.m(), new erh.e(1)));
   }

   public static erw.a<?> a(dac $$0, int $$1) {
      return a($$2 -> new erh($$2, $$0.m(), new erh.e($$1)));
   }

   static record a(int b, float c) implements erh.b {
      private static final Codec<erh.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(erh.a::b), Codec.FLOAT.fieldOf("probability").forGetter(erh.a::c)).apply($$0, erh.a::new)
      );
      public static final erh.c a = new erh.c(new alf("binomial_with_bonus_count"), d);

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
      public erh.c a() {
         return a;
      }
   }

   interface b {
      int a(azh var1, int var2, int var3);

      erh.c a();
   }

   static record c(alf a, Codec<? extends erh.b> b) {
   }

   static record d() implements erh.b {
      public static final Codec<erh.d> a = Codec.unit(erh.d::new);
      public static final erh.c b = new erh.c(new alf("ore_drops"), a);

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
      public erh.c a() {
         return b;
      }
   }

   static record e(int c) implements erh.b {
      public static final Codec<erh.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(erh.e::b)).apply($$0, erh.e::new)
      );
      public static final erh.c b = new erh.c(new alf("uniform_bonus_count"), a);

      @Override
      public int a(azh $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public erh.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
