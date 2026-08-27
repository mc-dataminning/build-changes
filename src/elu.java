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

public class elu extends emg {
   private static final Map<ajh, elu.c> b = Stream.of(elu.a.a, elu.d.b, elu.e.b).collect(Collectors.toMap(elu.c::a, Function.identity()));
   private static final Codec<elu.c> c = ajh.a.comapFlatMap($$0 -> {
      elu.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, elu.c::a);
   private static final MapCodec<elu.b> d = awe.a("formula", "parameters", c, elu.b::a, elu.c::b);
   public static final Codec<elu> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(ki.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, elu::new)
   );
   private final il<cuu> e;
   private final elu.b f;

   private elu(List<ent> $$0, il<cuu> $$1, elu.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public emi b() {
      return emj.r;
   }

   @Override
   public Set<enc<?>> a() {
      return ImmutableSet.of(enf.i);
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      cqk $$2 = $$1.c(enf.i);
      if ($$2 != null) {
         int $$3 = cuv.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static emg.a<?> a(cuu $$0, float $$1, int $$2) {
      return a($$3 -> new elu($$3, $$0.k(), new elu.a($$2, $$1)));
   }

   public static emg.a<?> a(cuu $$0) {
      return a($$1 -> new elu($$1, $$0.k(), new elu.d()));
   }

   public static emg.a<?> b(cuu $$0) {
      return a($$1 -> new elu($$1, $$0.k(), new elu.e(1)));
   }

   public static emg.a<?> a(cuu $$0, int $$1) {
      return a($$2 -> new elu($$2, $$0.k(), new elu.e($$1)));
   }

   static record a(int b, float c) implements elu.b {
      private static final Codec<elu.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(elu.a::b), Codec.FLOAT.fieldOf("probability").forGetter(elu.a::c)).apply($$0, elu.a::new)
      );
      public static final elu.c a = new elu.c(new ajh("binomial_with_bonus_count"), d);

      @Override
      public int a(axd $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public elu.c a() {
         return a;
      }
   }

   interface b {
      int a(axd var1, int var2, int var3);

      elu.c a();
   }

   static record c(ajh a, Codec<? extends elu.b> b) {
   }

   static record d() implements elu.b {
      public static final Codec<elu.d> a = Codec.unit(elu.d::new);
      public static final elu.c b = new elu.c(new ajh("ore_drops"), a);

      @Override
      public int a(axd $$0, int $$1, int $$2) {
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
      public elu.c a() {
         return b;
      }
   }

   static record e(int c) implements elu.b {
      public static final Codec<elu.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(elu.e::b)).apply($$0, elu.e::new)
      );
      public static final elu.c b = new elu.c(new ajh("uniform_bonus_count"), a);

      @Override
      public int a(axd $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public elu.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
