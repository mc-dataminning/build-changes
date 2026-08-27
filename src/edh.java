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

public class edh extends edt {
   private static final Map<aer, edh.c> b = Stream.of(edh.a.a, edh.d.b, edh.e.b).collect(Collectors.toMap(edh.c::a, Function.identity()));
   static final Codec<edh.c> c = aer.a.comapFlatMap($$0 -> {
      edh.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, edh.c::a);
   private static final MapCodec<edh.b> d = new MapCodec<edh.b>() {
      private static final String a = "formula";
      private static final String b = "parameters";

      public <T> Stream<T> keys(DynamicOps<T> $$0) {
         return Stream.of((T[])(new Object[]{$$0.createString("formula"), $$0.createString("parameters")}));
      }

      public <T> DataResult<edh.b> decode(DynamicOps<T> $$0, MapLike<T> $$1) {
         T $$2 = (T)$$1.get("formula");
         return $$2 == null ? DataResult.error(() -> "Missing type for formula in: " + $$1) : edh.c.decode($$0, $$2).flatMap($$2x -> {
            T $$3 = Objects.requireNonNullElseGet((T)$$1.get("parameters"), $$0::emptyMap);
            return ((edh.c)$$2x.getFirst()).b().decode($$0, $$3).map(Pair::getFirst);
         });
      }

      public <T> RecordBuilder<T> a(edh.b $$0, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
         edh.c $$3 = $$0.a();
         $$2.add("formula", edh.c.encodeStart($$1, $$3));
         DataResult<T> $$4 = this.a($$3.b(), $$0, $$1);
         if ($$4.result().isEmpty() || !Objects.equals($$4.result().get(), $$1.emptyMap())) {
            $$2.add("parameters", $$4);
         }

         return $$2;
      }

      private <T, F extends edh.b> DataResult<T> a(Codec<F> $$0, edh.b $$1, DynamicOps<T> $$2) {
         return $$0.encodeStart($$2, $$1);
      }
   };
   public static final Codec<edh> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(jb.g.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, edh::new)
   );
   private final he<cnf> e;
   private final edh.b f;

   private edh(List<efg> $$0, he<cnf> $$1, edh.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public edv b() {
      return edw.r;
   }

   @Override
   public Set<eep<?>> a() {
      return ImmutableSet.of(ees.i);
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      ciy $$2 = $$1.c(ees.i);
      if ($$2 != null) {
         int $$3 = cnh.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static edt.a<?> a(cnf $$0, float $$1, int $$2) {
      return a($$3 -> new edh($$3, $$0.j(), new edh.a($$2, $$1)));
   }

   public static edt.a<?> a(cnf $$0) {
      return a($$1 -> new edh($$1, $$0.j(), new edh.d()));
   }

   public static edt.a<?> b(cnf $$0) {
      return a($$1 -> new edh($$1, $$0.j(), new edh.e(1)));
   }

   public static edt.a<?> a(cnf $$0, int $$1) {
      return a($$2 -> new edh($$2, $$0.j(), new edh.e($$1)));
   }

   static record a(int b, float c) implements edh.b {
      private static final Codec<edh.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(edh.a::b), Codec.FLOAT.fieldOf("probability").forGetter(edh.a::c)).apply($$0, edh.a::new)
      );
      public static final edh.c a = new edh.c(new aer("binomial_with_bonus_count"), d);

      @Override
      public int a(aru $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public edh.c a() {
         return a;
      }
   }

   interface b {
      int a(aru var1, int var2, int var3);

      edh.c a();
   }

   static record c(aer a, Codec<? extends edh.b> b) {
   }

   static record d() implements edh.b {
      public static final Codec<edh.d> a = Codec.unit(edh.d::new);
      public static final edh.c b = new edh.c(new aer("ore_drops"), a);

      @Override
      public int a(aru $$0, int $$1, int $$2) {
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
      public edh.c a() {
         return b;
      }
   }

   static record e(int c) implements edh.b {
      public static final Codec<edh.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(edh.e::b)).apply($$0, edh.e::new)
      );
      public static final edh.c b = new edh.c(new aer("uniform_bonus_count"), a);

      @Override
      public int a(aru $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public edh.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
