import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eds extends eee {
   private static final Map<aey, eds.c> b = Stream.of(eds.a.a, eds.d.b, eds.e.b).collect(Collectors.toMap(eds.c::a, Function.identity()));
   static final Codec<eds.c> c = aey.a.comapFlatMap($$0 -> {
      eds.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, eds.c::a);
   private static final MapCodec<eds.b> d = new MapCodec<eds.b>() {
      private static final String a = "formula";
      private static final String b = "parameters";

      public <T> Stream<T> keys(DynamicOps<T> $$0) {
         return Stream.of((T[])(new Object[]{$$0.createString("formula"), $$0.createString("parameters")}));
      }

      public <T> DataResult<eds.b> decode(DynamicOps<T> $$0, MapLike<T> $$1) {
         T $$2 = (T)$$1.get("formula");
         return $$2 == null ? DataResult.error(() -> "Missing type for formula in: " + $$1) : eds.c.decode($$0, $$2).flatMap($$2x -> {
            T $$3 = Objects.requireNonNullElseGet((T)$$1.get("parameters"), $$0::emptyMap);
            return ((eds.c)$$2x.getFirst()).b().decode($$0, $$3).map(Pair::getFirst);
         });
      }

      public <T> RecordBuilder<T> a(eds.b $$0, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
         eds.c $$3 = $$0.a();
         $$2.add("formula", eds.c.encodeStart($$1, $$3));
         DataResult<T> $$4 = this.a($$3.b(), $$0, $$1);
         if ($$4.result().isEmpty() || !Objects.equals($$4.result().get(), $$1.emptyMap())) {
            $$2.add("parameters", $$4);
         }

         return $$2;
      }

      private <T, F extends eds.b> DataResult<T> a(Codec<F> $$0, eds.b $$1, DynamicOps<T> $$2) {
         return $$0.encodeStart($$2, $$1);
      }
   };
   public static final Codec<eds> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(jd.g.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, eds::new)
   );
   private final hg<cnq> e;
   private final eds.b f;

   private eds(List<efr> $$0, hg<cnq> $$1, eds.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eeg b() {
      return eeh.r;
   }

   @Override
   public Set<efa<?>> a() {
      return ImmutableSet.of(efd.i);
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      cjh $$2 = $$1.c(efd.i);
      if ($$2 != null) {
         int $$3 = cns.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static eee.a<?> a(cnq $$0, float $$1, int $$2) {
      return a($$3 -> new eds($$3, $$0.j(), new eds.a($$2, $$1)));
   }

   public static eee.a<?> a(cnq $$0) {
      return a($$1 -> new eds($$1, $$0.j(), new eds.d()));
   }

   public static eee.a<?> b(cnq $$0) {
      return a($$1 -> new eds($$1, $$0.j(), new eds.e(1)));
   }

   public static eee.a<?> a(cnq $$0, int $$1) {
      return a($$2 -> new eds($$2, $$0.j(), new eds.e($$1)));
   }

   static record a(int b, float c) implements eds.b {
      private static final Codec<eds.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(eds.a::b), Codec.FLOAT.fieldOf("probability").forGetter(eds.a::c)).apply($$0, eds.a::new)
      );
      public static final eds.c a = new eds.c(new aey("binomial_with_bonus_count"), d);

      @Override
      public int a(ase $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public eds.c a() {
         return a;
      }
   }

   interface b {
      int a(ase var1, int var2, int var3);

      eds.c a();
   }

   static record c(aey a, Codec<? extends eds.b> b) {
   }

   static record d() implements eds.b {
      public static final Codec<eds.d> a = Codec.unit(eds.d::new);
      public static final eds.c b = new eds.c(new aey("ore_drops"), a);

      @Override
      public int a(ase $$0, int $$1, int $$2) {
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
      public eds.c a() {
         return b;
      }
   }

   static record e(int c) implements eds.b {
      public static final Codec<eds.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(eds.e::b)).apply($$0, eds.e::new)
      );
      public static final eds.c b = new eds.c(new aey("uniform_bonus_count"), a);

      @Override
      public int a(ase $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public eds.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
