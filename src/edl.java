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

public class edl extends edx {
   private static final Map<aeu, edl.c> b = Stream.of(edl.a.a, edl.d.b, edl.e.b).collect(Collectors.toMap(edl.c::a, Function.identity()));
   static final Codec<edl.c> c = aeu.a.comapFlatMap($$0 -> {
      edl.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, edl.c::a);
   private static final MapCodec<edl.b> d = new MapCodec<edl.b>() {
      private static final String a = "formula";
      private static final String b = "parameters";

      public <T> Stream<T> keys(DynamicOps<T> $$0) {
         return Stream.of((T[])(new Object[]{$$0.createString("formula"), $$0.createString("parameters")}));
      }

      public <T> DataResult<edl.b> decode(DynamicOps<T> $$0, MapLike<T> $$1) {
         T $$2 = (T)$$1.get("formula");
         return $$2 == null ? DataResult.error(() -> "Missing type for formula in: " + $$1) : edl.c.decode($$0, $$2).flatMap($$2x -> {
            T $$3 = Objects.requireNonNullElseGet((T)$$1.get("parameters"), $$0::emptyMap);
            return ((edl.c)$$2x.getFirst()).b().decode($$0, $$3).map(Pair::getFirst);
         });
      }

      public <T> RecordBuilder<T> a(edl.b $$0, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
         edl.c $$3 = $$0.a();
         $$2.add("formula", edl.c.encodeStart($$1, $$3));
         DataResult<T> $$4 = this.a($$3.b(), $$0, $$1);
         if ($$4.result().isEmpty() || !Objects.equals($$4.result().get(), $$1.emptyMap())) {
            $$2.add("parameters", $$4);
         }

         return $$2;
      }

      private <T, F extends edl.b> DataResult<T> a(Codec<F> $$0, edl.b $$1, DynamicOps<T> $$2) {
         return $$0.encodeStart($$2, $$1);
      }
   };
   public static final Codec<edl> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(jd.g.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, edl::new)
   );
   private final hg<cnj> e;
   private final edl.b f;

   private edl(List<efk> $$0, hg<cnj> $$1, edl.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public edz b() {
      return eea.r;
   }

   @Override
   public Set<eet<?>> a() {
      return ImmutableSet.of(eew.i);
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      cja $$2 = $$1.c(eew.i);
      if ($$2 != null) {
         int $$3 = cnl.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static edx.a<?> a(cnj $$0, float $$1, int $$2) {
      return a($$3 -> new edl($$3, $$0.j(), new edl.a($$2, $$1)));
   }

   public static edx.a<?> a(cnj $$0) {
      return a($$1 -> new edl($$1, $$0.j(), new edl.d()));
   }

   public static edx.a<?> b(cnj $$0) {
      return a($$1 -> new edl($$1, $$0.j(), new edl.e(1)));
   }

   public static edx.a<?> a(cnj $$0, int $$1) {
      return a($$2 -> new edl($$2, $$0.j(), new edl.e($$1)));
   }

   static record a(int b, float c) implements edl.b {
      private static final Codec<edl.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(edl.a::b), Codec.FLOAT.fieldOf("probability").forGetter(edl.a::c)).apply($$0, edl.a::new)
      );
      public static final edl.c a = new edl.c(new aeu("binomial_with_bonus_count"), d);

      @Override
      public int a(arx $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public edl.c a() {
         return a;
      }
   }

   interface b {
      int a(arx var1, int var2, int var3);

      edl.c a();
   }

   static record c(aeu a, Codec<? extends edl.b> b) {
   }

   static record d() implements edl.b {
      public static final Codec<edl.d> a = Codec.unit(edl.d::new);
      public static final edl.c b = new edl.c(new aeu("ore_drops"), a);

      @Override
      public int a(arx $$0, int $$1, int $$2) {
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
      public edl.c a() {
         return b;
      }
   }

   static record e(int c) implements edl.b {
      public static final Codec<edl.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(edl.e::b)).apply($$0, edl.e::new)
      );
      public static final edl.c b = new edl.c(new aeu("uniform_bonus_count"), a);

      @Override
      public int a(arx $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public edl.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
