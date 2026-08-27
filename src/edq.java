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

public class edq extends eec {
   private static final Map<aew, edq.c> b = Stream.of(edq.a.a, edq.d.b, edq.e.b).collect(Collectors.toMap(edq.c::a, Function.identity()));
   static final Codec<edq.c> c = aew.a.comapFlatMap($$0 -> {
      edq.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, edq.c::a);
   private static final MapCodec<edq.b> d = new MapCodec<edq.b>() {
      private static final String a = "formula";
      private static final String b = "parameters";

      public <T> Stream<T> keys(DynamicOps<T> $$0) {
         return Stream.of((T[])(new Object[]{$$0.createString("formula"), $$0.createString("parameters")}));
      }

      public <T> DataResult<edq.b> decode(DynamicOps<T> $$0, MapLike<T> $$1) {
         T $$2 = (T)$$1.get("formula");
         return $$2 == null ? DataResult.error(() -> "Missing type for formula in: " + $$1) : edq.c.decode($$0, $$2).flatMap($$2x -> {
            T $$3 = Objects.requireNonNullElseGet((T)$$1.get("parameters"), $$0::emptyMap);
            return ((edq.c)$$2x.getFirst()).b().decode($$0, $$3).map(Pair::getFirst);
         });
      }

      public <T> RecordBuilder<T> a(edq.b $$0, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
         edq.c $$3 = $$0.a();
         $$2.add("formula", edq.c.encodeStart($$1, $$3));
         DataResult<T> $$4 = this.a($$3.b(), $$0, $$1);
         if ($$4.result().isEmpty() || !Objects.equals($$4.result().get(), $$1.emptyMap())) {
            $$2.add("parameters", $$4);
         }

         return $$2;
      }

      private <T, F extends edq.b> DataResult<T> a(Codec<F> $$0, edq.b $$1, DynamicOps<T> $$2) {
         return $$0.encodeStart($$2, $$1);
      }
   };
   public static final Codec<edq> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(jb.g.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, edq::new)
   );
   private final he<cno> e;
   private final edq.b f;

   private edq(List<efp> $$0, he<cno> $$1, edq.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eee b() {
      return eef.r;
   }

   @Override
   public Set<eey<?>> a() {
      return ImmutableSet.of(efb.i);
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      cjf $$2 = $$1.c(efb.i);
      if ($$2 != null) {
         int $$3 = cnq.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static eec.a<?> a(cno $$0, float $$1, int $$2) {
      return a($$3 -> new edq($$3, $$0.j(), new edq.a($$2, $$1)));
   }

   public static eec.a<?> a(cno $$0) {
      return a($$1 -> new edq($$1, $$0.j(), new edq.d()));
   }

   public static eec.a<?> b(cno $$0) {
      return a($$1 -> new edq($$1, $$0.j(), new edq.e(1)));
   }

   public static eec.a<?> a(cno $$0, int $$1) {
      return a($$2 -> new edq($$2, $$0.j(), new edq.e($$1)));
   }

   static record a(int b, float c) implements edq.b {
      private static final Codec<edq.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(edq.a::b), Codec.FLOAT.fieldOf("probability").forGetter(edq.a::c)).apply($$0, edq.a::new)
      );
      public static final edq.c a = new edq.c(new aew("binomial_with_bonus_count"), d);

      @Override
      public int a(asc $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public edq.c a() {
         return a;
      }
   }

   interface b {
      int a(asc var1, int var2, int var3);

      edq.c a();
   }

   static record c(aew a, Codec<? extends edq.b> b) {
   }

   static record d() implements edq.b {
      public static final Codec<edq.d> a = Codec.unit(edq.d::new);
      public static final edq.c b = new edq.c(new aew("ore_drops"), a);

      @Override
      public int a(asc $$0, int $$1, int $$2) {
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
      public edq.c a() {
         return b;
      }
   }

   static record e(int c) implements edq.b {
      public static final Codec<edq.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(edq.e::b)).apply($$0, edq.e::new)
      );
      public static final edq.c b = new edq.c(new aew("uniform_bonus_count"), a);

      @Override
      public int a(asc $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public edq.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
