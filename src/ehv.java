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

public class ehv extends eih {
   private static final Map<ahg, ehv.c> b = Stream.of(ehv.a.a, ehv.d.b, ehv.e.b).collect(Collectors.toMap(ehv.c::a, Function.identity()));
   private static final Codec<ehv.c> c = ahg.a.comapFlatMap($$0 -> {
      ehv.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, ehv.c::a);
   private static final MapCodec<ehv.b> d = atv.a("formula", "parameters", c, ehv.b::a, ehv.c::b);
   public static final Codec<ehv> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(kd.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, ehv::new)
   );
   private final ih<cri> e;
   private final ehv.b f;

   private ehv(List<eju> $$0, ih<cri> $$1, ehv.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eij b() {
      return eik.r;
   }

   @Override
   public Set<ejd<?>> a() {
      return ImmutableSet.of(ejg.i);
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      cmx $$2 = $$1.c(ejg.i);
      if ($$2 != null) {
         int $$3 = crk.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static eih.a<?> a(cri $$0, float $$1, int $$2) {
      return a($$3 -> new ehv($$3, $$0.j(), new ehv.a($$2, $$1)));
   }

   public static eih.a<?> a(cri $$0) {
      return a($$1 -> new ehv($$1, $$0.j(), new ehv.d()));
   }

   public static eih.a<?> b(cri $$0) {
      return a($$1 -> new ehv($$1, $$0.j(), new ehv.e(1)));
   }

   public static eih.a<?> a(cri $$0, int $$1) {
      return a($$2 -> new ehv($$2, $$0.j(), new ehv.e($$1)));
   }

   static record a(int b, float c) implements ehv.b {
      private static final Codec<ehv.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(ehv.a::b), Codec.FLOAT.fieldOf("probability").forGetter(ehv.a::c)).apply($$0, ehv.a::new)
      );
      public static final ehv.c a = new ehv.c(new ahg("binomial_with_bonus_count"), d);

      @Override
      public int a(auu $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public ehv.c a() {
         return a;
      }
   }

   interface b {
      int a(auu var1, int var2, int var3);

      ehv.c a();
   }

   static record c(ahg a, Codec<? extends ehv.b> b) {
   }

   static record d() implements ehv.b {
      public static final Codec<ehv.d> a = Codec.unit(ehv.d::new);
      public static final ehv.c b = new ehv.c(new ahg("ore_drops"), a);

      @Override
      public int a(auu $$0, int $$1, int $$2) {
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
      public ehv.c a() {
         return b;
      }
   }

   static record e(int c) implements ehv.b {
      public static final Codec<ehv.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(ehv.e::b)).apply($$0, ehv.e::new)
      );
      public static final ehv.c b = new ehv.c(new ahg("uniform_bonus_count"), a);

      @Override
      public int a(auu $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public ehv.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
