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

public class eei extends eeu {
   private static final Map<afw, eei.c> b = Stream.of(eei.a.a, eei.d.b, eei.e.b).collect(Collectors.toMap(eei.c::a, Function.identity()));
   static final Codec<eei.c> c = afw.a.comapFlatMap($$0 -> {
      eei.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, eei.c::a);
   private static final MapCodec<eei.b> d = new MapCodec<eei.b>() {
      private static final String a = "formula";
      private static final String b = "parameters";

      public <T> Stream<T> keys(DynamicOps<T> $$0) {
         return Stream.of((T[])(new Object[]{$$0.createString("formula"), $$0.createString("parameters")}));
      }

      public <T> DataResult<eei.b> decode(DynamicOps<T> $$0, MapLike<T> $$1) {
         T $$2 = (T)$$1.get("formula");
         return $$2 == null ? DataResult.error(() -> "Missing type for formula in: " + $$1) : eei.c.decode($$0, $$2).flatMap($$2x -> {
            T $$3 = Objects.requireNonNullElseGet((T)$$1.get("parameters"), $$0::emptyMap);
            return ((eei.c)$$2x.getFirst()).b().decode($$0, $$3).map(Pair::getFirst);
         });
      }

      public <T> RecordBuilder<T> a(eei.b $$0, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
         eei.c $$3 = $$0.a();
         $$2.add("formula", eei.c.encodeStart($$1, $$3));
         DataResult<T> $$4 = this.a($$3.b(), $$0, $$1);
         if ($$4.result().isEmpty() || !Objects.equals($$4.result().get(), $$1.emptyMap())) {
            $$2.add("parameters", $$4);
         }

         return $$2;
      }

      private <T, F extends eei.b> DataResult<T> a(Codec<F> $$0, eei.b $$1, DynamicOps<T> $$2) {
         return $$0.encodeStart($$2, $$1);
      }
   };
   public static final Codec<eei> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(jy.g.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, eei::new)
   );
   private final ib<cot> e;
   private final eei.b f;

   private eei(List<egh> $$0, ib<cot> $$1, eei.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eew b() {
      return eex.r;
   }

   @Override
   public Set<efq<?>> a() {
      return ImmutableSet.of(eft.i);
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      ckj $$2 = $$1.c(eft.i);
      if ($$2 != null) {
         int $$3 = cov.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static eeu.a<?> a(cot $$0, float $$1, int $$2) {
      return a($$3 -> new eei($$3, $$0.j(), new eei.a($$2, $$1)));
   }

   public static eeu.a<?> a(cot $$0) {
      return a($$1 -> new eei($$1, $$0.j(), new eei.d()));
   }

   public static eeu.a<?> b(cot $$0) {
      return a($$1 -> new eei($$1, $$0.j(), new eei.e(1)));
   }

   public static eeu.a<?> a(cot $$0, int $$1) {
      return a($$2 -> new eei($$2, $$0.j(), new eei.e($$1)));
   }

   static record a(int b, float c) implements eei.b {
      private static final Codec<eei.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(eei.a::b), Codec.FLOAT.fieldOf("probability").forGetter(eei.a::c)).apply($$0, eei.a::new)
      );
      public static final eei.c a = new eei.c(new afw("binomial_with_bonus_count"), d);

      @Override
      public int a(ate $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public eei.c a() {
         return a;
      }
   }

   interface b {
      int a(ate var1, int var2, int var3);

      eei.c a();
   }

   static record c(afw a, Codec<? extends eei.b> b) {
   }

   static record d() implements eei.b {
      public static final Codec<eei.d> a = Codec.unit(eei.d::new);
      public static final eei.c b = new eei.c(new afw("ore_drops"), a);

      @Override
      public int a(ate $$0, int $$1, int $$2) {
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
      public eei.c a() {
         return b;
      }
   }

   static record e(int c) implements eei.b {
      public static final Codec<eei.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(eei.e::b)).apply($$0, eei.e::new)
      );
      public static final eei.c b = new eei.c(new afw("uniform_bonus_count"), a);

      @Override
      public int a(ate $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public eei.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
