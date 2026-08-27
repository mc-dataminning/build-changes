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

public class efx extends egj {
   private static final Map<agi, efx.c> b = Stream.of(efx.a.a, efx.d.b, efx.e.b).collect(Collectors.toMap(efx.c::a, Function.identity()));
   static final Codec<efx.c> c = agi.a.comapFlatMap($$0 -> {
      efx.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, efx.c::a);
   private static final MapCodec<efx.b> d = new MapCodec<efx.b>() {
      private static final String a = "formula";
      private static final String b = "parameters";

      public <T> Stream<T> keys(DynamicOps<T> $$0) {
         return Stream.of((T[])(new Object[]{$$0.createString("formula"), $$0.createString("parameters")}));
      }

      public <T> DataResult<efx.b> decode(DynamicOps<T> $$0, MapLike<T> $$1) {
         T $$2 = (T)$$1.get("formula");
         return $$2 == null ? DataResult.error(() -> "Missing type for formula in: " + $$1) : efx.c.decode($$0, $$2).flatMap($$2x -> {
            T $$3 = Objects.requireNonNullElseGet((T)$$1.get("parameters"), $$0::emptyMap);
            return ((efx.c)$$2x.getFirst()).b().decode($$0, $$3).map(Pair::getFirst);
         });
      }

      public <T> RecordBuilder<T> a(efx.b $$0, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
         efx.c $$3 = $$0.a();
         $$2.add("formula", efx.c.encodeStart($$1, $$3));
         DataResult<T> $$4 = this.a($$3.b(), $$0, $$1);
         if ($$4.result().isEmpty() || !Objects.equals($$4.result().get(), $$1.emptyMap())) {
            $$2.add("parameters", $$4);
         }

         return $$2;
      }

      private <T, F extends efx.b> DataResult<T> a(Codec<F> $$0, efx.b $$1, DynamicOps<T> $$2) {
         return $$0.encodeStart($$2, $$1);
      }
   };
   public static final Codec<efx> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(jy.g.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, efx::new)
   );
   private final ib<cpu> e;
   private final efx.b f;

   private efx(List<ehw> $$0, ib<cpu> $$1, efx.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public egl b() {
      return egm.r;
   }

   @Override
   public Set<ehf<?>> a() {
      return ImmutableSet.of(ehi.i);
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      clj $$2 = $$1.c(ehi.i);
      if ($$2 != null) {
         int $$3 = cpw.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static egj.a<?> a(cpu $$0, float $$1, int $$2) {
      return a($$3 -> new efx($$3, $$0.j(), new efx.a($$2, $$1)));
   }

   public static egj.a<?> a(cpu $$0) {
      return a($$1 -> new efx($$1, $$0.j(), new efx.d()));
   }

   public static egj.a<?> b(cpu $$0) {
      return a($$1 -> new efx($$1, $$0.j(), new efx.e(1)));
   }

   public static egj.a<?> a(cpu $$0, int $$1) {
      return a($$2 -> new efx($$2, $$0.j(), new efx.e($$1)));
   }

   static record a(int b, float c) implements efx.b {
      private static final Codec<efx.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(efx.a::b), Codec.FLOAT.fieldOf("probability").forGetter(efx.a::c)).apply($$0, efx.a::new)
      );
      public static final efx.c a = new efx.c(new agi("binomial_with_bonus_count"), d);

      @Override
      public int a(ats $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public efx.c a() {
         return a;
      }
   }

   interface b {
      int a(ats var1, int var2, int var3);

      efx.c a();
   }

   static record c(agi a, Codec<? extends efx.b> b) {
   }

   static record d() implements efx.b {
      public static final Codec<efx.d> a = Codec.unit(efx.d::new);
      public static final efx.c b = new efx.c(new agi("ore_drops"), a);

      @Override
      public int a(ats $$0, int $$1, int $$2) {
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
      public efx.c a() {
         return b;
      }
   }

   static record e(int c) implements efx.b {
      public static final Codec<efx.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(efx.e::b)).apply($$0, efx.e::new)
      );
      public static final efx.c b = new efx.c(new agi("uniform_bonus_count"), a);

      @Override
      public int a(ats $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public efx.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
