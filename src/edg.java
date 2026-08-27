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

public class edg extends eds {
   private static final Map<aer, edg.c> b = Stream.of(edg.a.a, edg.d.b, edg.e.b).collect(Collectors.toMap(edg.c::a, Function.identity()));
   static final Codec<edg.c> c = aer.a.comapFlatMap($$0 -> {
      edg.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, edg.c::a);
   private static final MapCodec<edg.b> d = new MapCodec<edg.b>() {
      private static final String a = "formula";
      private static final String b = "parameters";

      public <T> Stream<T> keys(DynamicOps<T> $$0) {
         return Stream.of((T[])(new Object[]{$$0.createString("formula"), $$0.createString("parameters")}));
      }

      public <T> DataResult<edg.b> decode(DynamicOps<T> $$0, MapLike<T> $$1) {
         T $$2 = (T)$$1.get("formula");
         return $$2 == null ? DataResult.error(() -> "Missing type for formula in: " + $$1) : edg.c.decode($$0, $$2).flatMap($$2x -> {
            T $$3 = Objects.requireNonNullElseGet((T)$$1.get("parameters"), $$0::emptyMap);
            return ((edg.c)$$2x.getFirst()).b().decode($$0, $$3).map(Pair::getFirst);
         });
      }

      public <T> RecordBuilder<T> a(edg.b $$0, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
         edg.c $$3 = $$0.a();
         $$2.add("formula", edg.c.encodeStart($$1, $$3));
         DataResult<T> $$4 = this.a($$3.b(), $$0, $$1);
         if ($$4.result().isEmpty() || !Objects.equals($$4.result().get(), $$1.emptyMap())) {
            $$2.add("parameters", $$4);
         }

         return $$2;
      }

      private <T, F extends edg.b> DataResult<T> a(Codec<F> $$0, edg.b $$1, DynamicOps<T> $$2) {
         return $$0.encodeStart($$2, $$1);
      }
   };
   public static final Codec<edg> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(jb.g.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, edg::new)
   );
   private final he<cne> e;
   private final edg.b f;

   private edg(List<eff> $$0, he<cne> $$1, edg.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public edu b() {
      return edv.r;
   }

   @Override
   public Set<eeo<?>> a() {
      return ImmutableSet.of(eer.i);
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      cix $$2 = $$1.c(eer.i);
      if ($$2 != null) {
         int $$3 = cng.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static eds.a<?> a(cne $$0, float $$1, int $$2) {
      return a($$3 -> new edg($$3, $$0.j(), new edg.a($$2, $$1)));
   }

   public static eds.a<?> a(cne $$0) {
      return a($$1 -> new edg($$1, $$0.j(), new edg.d()));
   }

   public static eds.a<?> b(cne $$0) {
      return a($$1 -> new edg($$1, $$0.j(), new edg.e(1)));
   }

   public static eds.a<?> a(cne $$0, int $$1) {
      return a($$2 -> new edg($$2, $$0.j(), new edg.e($$1)));
   }

   static record a(int b, float c) implements edg.b {
      private static final Codec<edg.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(edg.a::b), Codec.FLOAT.fieldOf("probability").forGetter(edg.a::c)).apply($$0, edg.a::new)
      );
      public static final edg.c a = new edg.c(new aer("binomial_with_bonus_count"), d);

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
      public edg.c a() {
         return a;
      }
   }

   interface b {
      int a(aru var1, int var2, int var3);

      edg.c a();
   }

   static record c(aer a, Codec<? extends edg.b> b) {
   }

   static record d() implements edg.b {
      public static final Codec<edg.d> a = Codec.unit(edg.d::new);
      public static final edg.c b = new edg.c(new aer("ore_drops"), a);

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
      public edg.c a() {
         return b;
      }
   }

   static record e(int c) implements edg.b {
      public static final Codec<edg.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(edg.e::b)).apply($$0, edg.e::new)
      );
      public static final edg.c b = new edg.c(new aer("uniform_bonus_count"), a);

      @Override
      public int a(aru $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public edg.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
