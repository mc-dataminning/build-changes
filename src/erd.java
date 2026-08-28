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

public class erd extends ers {
   private static final Map<ale, erd.c> b = Stream.of(erd.a.a, erd.d.b, erd.e.b).collect(Collectors.toMap(erd.c::a, Function.identity()));
   private static final Codec<erd.c> c = ale.a.comapFlatMap($$0 -> {
      erd.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, erd.c::a);
   private static final MapCodec<erd.b> d = ayf.a("formula", "parameters", c, erd.b::a, erd.c::b);
   public static final MapCodec<erd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(lp.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, erd::new)
   );
   private final ji<czy> e;
   private final erd.b f;

   private erd(List<etq> $$0, ji<czy> $$1, erd.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eru<erd> b() {
      return erv.x;
   }

   @Override
   public Set<esz<?>> a() {
      return ImmutableSet.of(etc.i);
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      cun $$2 = $$1.c(etc.i);
      if ($$2 != null) {
         int $$3 = czz.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.I(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static ers.a<?> a(czy $$0, float $$1, int $$2) {
      return a($$3 -> new erd($$3, $$0.m(), new erd.a($$2, $$1)));
   }

   public static ers.a<?> a(czy $$0) {
      return a($$1 -> new erd($$1, $$0.m(), new erd.d()));
   }

   public static ers.a<?> b(czy $$0) {
      return a($$1 -> new erd($$1, $$0.m(), new erd.e(1)));
   }

   public static ers.a<?> a(czy $$0, int $$1) {
      return a($$2 -> new erd($$2, $$0.m(), new erd.e($$1)));
   }

   static record a(int b, float c) implements erd.b {
      private static final Codec<erd.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(erd.a::b), Codec.FLOAT.fieldOf("probability").forGetter(erd.a::c)).apply($$0, erd.a::new)
      );
      public static final erd.c a = new erd.c(new ale("binomial_with_bonus_count"), d);

      @Override
      public int a(azf $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public erd.c a() {
         return a;
      }
   }

   interface b {
      int a(azf var1, int var2, int var3);

      erd.c a();
   }

   static record c(ale a, Codec<? extends erd.b> b) {
   }

   static record d() implements erd.b {
      public static final Codec<erd.d> a = Codec.unit(erd.d::new);
      public static final erd.c b = new erd.c(new ale("ore_drops"), a);

      @Override
      public int a(azf $$0, int $$1, int $$2) {
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
      public erd.c a() {
         return b;
      }
   }

   static record e(int c) implements erd.b {
      public static final Codec<erd.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(erd.e::b)).apply($$0, erd.e::new)
      );
      public static final erd.c b = new erd.c(new ale("uniform_bonus_count"), a);

      @Override
      public int a(azf $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public erd.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
