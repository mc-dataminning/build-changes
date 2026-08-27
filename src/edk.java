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

public class edk extends edw {
   private static final Map<aez, edk.c> b = Stream.of(edk.a.a, edk.d.b, edk.e.b).collect(Collectors.toMap(edk.c::a, Function.identity()));
   static final Codec<edk.c> c = aez.a.comapFlatMap($$0 -> {
      edk.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, edk.c::a);
   private static final MapCodec<edk.b> d = new MapCodec<edk.b>() {
      private static final String a = "formula";
      private static final String b = "parameters";

      public <T> Stream<T> keys(DynamicOps<T> $$0) {
         return Stream.of((T[])(new Object[]{$$0.createString("formula"), $$0.createString("parameters")}));
      }

      public <T> DataResult<edk.b> decode(DynamicOps<T> $$0, MapLike<T> $$1) {
         T $$2 = (T)$$1.get("formula");
         return $$2 == null ? DataResult.error(() -> "Missing type for formula in: " + $$1) : edk.c.decode($$0, $$2).flatMap($$2x -> {
            T $$3 = Objects.requireNonNullElseGet((T)$$1.get("parameters"), $$0::emptyMap);
            return ((edk.c)$$2x.getFirst()).b().decode($$0, $$3).map(Pair::getFirst);
         });
      }

      public <T> RecordBuilder<T> a(edk.b $$0, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
         edk.c $$3 = $$0.a();
         $$2.add("formula", edk.c.encodeStart($$1, $$3));
         DataResult<T> $$4 = this.a($$3.b(), $$0, $$1);
         if ($$4.result().isEmpty() || !Objects.equals($$4.result().get(), $$1.emptyMap())) {
            $$2.add("parameters", $$4);
         }

         return $$2;
      }

      private <T, F extends edk.b> DataResult<T> a(Codec<F> $$0, edk.b $$1, DynamicOps<T> $$2) {
         return $$0.encodeStart($$2, $$1);
      }
   };
   public static final Codec<edk> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(jb.g.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, edk::new)
   );
   private final he<cnu> e;
   private final edk.b f;

   private edk(List<efj> $$0, he<cnu> $$1, edk.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public edy b() {
      return edz.r;
   }

   @Override
   public Set<ees<?>> a() {
      return ImmutableSet.of(eev.i);
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      cjl $$2 = $$1.c(eev.i);
      if ($$2 != null) {
         int $$3 = cnw.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static edw.a<?> a(cnu $$0, float $$1, int $$2) {
      return a($$3 -> new edk($$3, $$0.j(), new edk.a($$2, $$1)));
   }

   public static edw.a<?> a(cnu $$0) {
      return a($$1 -> new edk($$1, $$0.j(), new edk.d()));
   }

   public static edw.a<?> b(cnu $$0) {
      return a($$1 -> new edk($$1, $$0.j(), new edk.e(1)));
   }

   public static edw.a<?> a(cnu $$0, int $$1) {
      return a($$2 -> new edk($$2, $$0.j(), new edk.e($$1)));
   }

   static record a(int b, float c) implements edk.b {
      private static final Codec<edk.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(edk.a::b), Codec.FLOAT.fieldOf("probability").forGetter(edk.a::c)).apply($$0, edk.a::new)
      );
      public static final edk.c a = new edk.c(new aez("binomial_with_bonus_count"), d);

      @Override
      public int a(ash $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public edk.c a() {
         return a;
      }
   }

   interface b {
      int a(ash var1, int var2, int var3);

      edk.c a();
   }

   static record c(aez a, Codec<? extends edk.b> b) {
   }

   static record d() implements edk.b {
      public static final Codec<edk.d> a = Codec.unit(edk.d::new);
      public static final edk.c b = new edk.c(new aez("ore_drops"), a);

      @Override
      public int a(ash $$0, int $$1, int $$2) {
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
      public edk.c a() {
         return b;
      }
   }

   static record e(int c) implements edk.b {
      public static final Codec<edk.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(edk.e::b)).apply($$0, edk.e::new)
      );
      public static final edk.c b = new edk.c(new aez("uniform_bonus_count"), a);

      @Override
      public int a(ash $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public edk.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
