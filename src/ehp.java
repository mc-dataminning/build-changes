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

public class ehp extends eib {
   private static final Map<ahd, ehp.c> b = Stream.of(ehp.a.a, ehp.d.b, ehp.e.b).collect(Collectors.toMap(ehp.c::a, Function.identity()));
   private static final Codec<ehp.c> c = ahd.a.comapFlatMap($$0 -> {
      ehp.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, ehp.c::a);
   private static final MapCodec<ehp.b> d = atq.a("formula", "parameters", c, ehp.b::a, ehp.c::b);
   public static final Codec<ehp> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(kd.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, ehp::new)
   );
   private final ih<crc> e;
   private final ehp.b f;

   private ehp(List<ejo> $$0, ih<crc> $$1, ehp.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eid b() {
      return eie.r;
   }

   @Override
   public Set<eix<?>> a() {
      return ImmutableSet.of(eja.i);
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      cmr $$2 = $$1.c(eja.i);
      if ($$2 != null) {
         int $$3 = cre.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static eib.a<?> a(crc $$0, float $$1, int $$2) {
      return a($$3 -> new ehp($$3, $$0.j(), new ehp.a($$2, $$1)));
   }

   public static eib.a<?> a(crc $$0) {
      return a($$1 -> new ehp($$1, $$0.j(), new ehp.d()));
   }

   public static eib.a<?> b(crc $$0) {
      return a($$1 -> new ehp($$1, $$0.j(), new ehp.e(1)));
   }

   public static eib.a<?> a(crc $$0, int $$1) {
      return a($$2 -> new ehp($$2, $$0.j(), new ehp.e($$1)));
   }

   static record a(int b, float c) implements ehp.b {
      private static final Codec<ehp.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(ehp.a::b), Codec.FLOAT.fieldOf("probability").forGetter(ehp.a::c)).apply($$0, ehp.a::new)
      );
      public static final ehp.c a = new ehp.c(new ahd("binomial_with_bonus_count"), d);

      @Override
      public int a(aup $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public ehp.c a() {
         return a;
      }
   }

   interface b {
      int a(aup var1, int var2, int var3);

      ehp.c a();
   }

   static record c(ahd a, Codec<? extends ehp.b> b) {
   }

   static record d() implements ehp.b {
      public static final Codec<ehp.d> a = Codec.unit(ehp.d::new);
      public static final ehp.c b = new ehp.c(new ahd("ore_drops"), a);

      @Override
      public int a(aup $$0, int $$1, int $$2) {
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
      public ehp.c a() {
         return b;
      }
   }

   static record e(int c) implements ehp.b {
      public static final Codec<ehp.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(ehp.e::b)).apply($$0, ehp.e::new)
      );
      public static final ehp.c b = new ehp.c(new ahd("uniform_bonus_count"), a);

      @Override
      public int a(aup $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public ehp.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
