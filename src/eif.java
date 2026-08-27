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

public class eif extends eir {
   private static final Map<ahh, eif.c> b = Stream.of(eif.a.a, eif.d.b, eif.e.b).collect(Collectors.toMap(eif.c::a, Function.identity()));
   private static final Codec<eif.c> c = ahh.a.comapFlatMap($$0 -> {
      eif.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, eif.c::a);
   private static final MapCodec<eif.b> d = atx.a("formula", "parameters", c, eif.b::a, eif.c::b);
   public static final Codec<eif> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(kd.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, eif::new)
   );
   private final ih<crr> e;
   private final eif.b f;

   private eif(List<eke> $$0, ih<crr> $$1, eif.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eit b() {
      return eiu.r;
   }

   @Override
   public Set<ejn<?>> a() {
      return ImmutableSet.of(ejq.i);
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      cng $$2 = $$1.c(ejq.i);
      if ($$2 != null) {
         int $$3 = crt.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static eir.a<?> a(crr $$0, float $$1, int $$2) {
      return a($$3 -> new eif($$3, $$0.j(), new eif.a($$2, $$1)));
   }

   public static eir.a<?> a(crr $$0) {
      return a($$1 -> new eif($$1, $$0.j(), new eif.d()));
   }

   public static eir.a<?> b(crr $$0) {
      return a($$1 -> new eif($$1, $$0.j(), new eif.e(1)));
   }

   public static eir.a<?> a(crr $$0, int $$1) {
      return a($$2 -> new eif($$2, $$0.j(), new eif.e($$1)));
   }

   static record a(int b, float c) implements eif.b {
      private static final Codec<eif.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(eif.a::b), Codec.FLOAT.fieldOf("probability").forGetter(eif.a::c)).apply($$0, eif.a::new)
      );
      public static final eif.c a = new eif.c(new ahh("binomial_with_bonus_count"), d);

      @Override
      public int a(auw $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public eif.c a() {
         return a;
      }
   }

   interface b {
      int a(auw var1, int var2, int var3);

      eif.c a();
   }

   static record c(ahh a, Codec<? extends eif.b> b) {
   }

   static record d() implements eif.b {
      public static final Codec<eif.d> a = Codec.unit(eif.d::new);
      public static final eif.c b = new eif.c(new ahh("ore_drops"), a);

      @Override
      public int a(auw $$0, int $$1, int $$2) {
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
      public eif.c a() {
         return b;
      }
   }

   static record e(int c) implements eif.b {
      public static final Codec<eif.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(eif.e::b)).apply($$0, eif.e::new)
      );
      public static final eif.c b = new eif.c(new ahh("uniform_bonus_count"), a);

      @Override
      public int a(auw $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public eif.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
