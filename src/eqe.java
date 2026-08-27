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

public class eqe extends eqs {
   private static final Map<akn, eqe.c> b = Stream.of(eqe.a.a, eqe.d.b, eqe.e.b).collect(Collectors.toMap(eqe.c::a, Function.identity()));
   private static final Codec<eqe.c> c = akn.a.comapFlatMap($$0 -> {
      eqe.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, eqe.c::a);
   private static final MapCodec<eqe.b> d = axn.a("formula", "parameters", c, eqe.b::a, eqe.c::b);
   public static final MapCodec<eqe> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(le.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, eqe::new)
   );
   private final ix<czb> e;
   private final eqe.b f;

   private eqe(List<esn> $$0, ix<czb> $$1, eqe.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public equ b() {
      return eqv.u;
   }

   @Override
   public Set<erw<?>> a() {
      return ImmutableSet.of(erz.i);
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      ctq $$2 = $$1.c(erz.i);
      if ($$2 != null) {
         int $$3 = czc.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.I(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static eqs.a<?> a(czb $$0, float $$1, int $$2) {
      return a($$3 -> new eqe($$3, $$0.m(), new eqe.a($$2, $$1)));
   }

   public static eqs.a<?> a(czb $$0) {
      return a($$1 -> new eqe($$1, $$0.m(), new eqe.d()));
   }

   public static eqs.a<?> b(czb $$0) {
      return a($$1 -> new eqe($$1, $$0.m(), new eqe.e(1)));
   }

   public static eqs.a<?> a(czb $$0, int $$1) {
      return a($$2 -> new eqe($$2, $$0.m(), new eqe.e($$1)));
   }

   static record a(int b, float c) implements eqe.b {
      private static final Codec<eqe.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(eqe.a::b), Codec.FLOAT.fieldOf("probability").forGetter(eqe.a::c)).apply($$0, eqe.a::new)
      );
      public static final eqe.c a = new eqe.c(new akn("binomial_with_bonus_count"), d);

      @Override
      public int a(aym $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public eqe.c a() {
         return a;
      }
   }

   interface b {
      int a(aym var1, int var2, int var3);

      eqe.c a();
   }

   static record c(akn a, Codec<? extends eqe.b> b) {
   }

   static record d() implements eqe.b {
      public static final Codec<eqe.d> a = Codec.unit(eqe.d::new);
      public static final eqe.c b = new eqe.c(new akn("ore_drops"), a);

      @Override
      public int a(aym $$0, int $$1, int $$2) {
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
      public eqe.c a() {
         return b;
      }
   }

   static record e(int c) implements eqe.b {
      public static final Codec<eqe.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(eqe.e::b)).apply($$0, eqe.e::new)
      );
      public static final eqe.c b = new eqe.c(new akn("uniform_bonus_count"), a);

      @Override
      public int a(aym $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public eqe.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
