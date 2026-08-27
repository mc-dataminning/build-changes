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

public class epa extends epo {
   private static final Map<akf, epa.c> b = Stream.of(epa.a.a, epa.d.b, epa.e.b).collect(Collectors.toMap(epa.c::a, Function.identity()));
   private static final Codec<epa.c> c = akf.a.comapFlatMap($$0 -> {
      epa.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, epa.c::a);
   private static final MapCodec<epa.b> d = axe.a("formula", "parameters", c, epa.b::a, epa.c::b);
   public static final Codec<epa> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(lc.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, epa::new)
   );
   private final iv<cxn> e;
   private final epa.b f;

   private epa(List<erh> $$0, iv<cxn> $$1, epa.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public epq b() {
      return epr.s;
   }

   @Override
   public Set<eqq<?>> a() {
      return ImmutableSet.of(eqt.i);
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      csd $$2 = $$1.c(eqt.i);
      if ($$2 != null) {
         int $$3 = cxo.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.G(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static epo.a<?> a(cxn $$0, float $$1, int $$2) {
      return a($$3 -> new epa($$3, $$0.k(), new epa.a($$2, $$1)));
   }

   public static epo.a<?> a(cxn $$0) {
      return a($$1 -> new epa($$1, $$0.k(), new epa.d()));
   }

   public static epo.a<?> b(cxn $$0) {
      return a($$1 -> new epa($$1, $$0.k(), new epa.e(1)));
   }

   public static epo.a<?> a(cxn $$0, int $$1) {
      return a($$2 -> new epa($$2, $$0.k(), new epa.e($$1)));
   }

   static record a(int b, float c) implements epa.b {
      private static final Codec<epa.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(epa.a::b), Codec.FLOAT.fieldOf("probability").forGetter(epa.a::c)).apply($$0, epa.a::new)
      );
      public static final epa.c a = new epa.c(new akf("binomial_with_bonus_count"), d);

      @Override
      public int a(ayd $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public epa.c a() {
         return a;
      }
   }

   interface b {
      int a(ayd var1, int var2, int var3);

      epa.c a();
   }

   static record c(akf a, Codec<? extends epa.b> b) {
   }

   static record d() implements epa.b {
      public static final Codec<epa.d> a = Codec.unit(epa.d::new);
      public static final epa.c b = new epa.c(new akf("ore_drops"), a);

      @Override
      public int a(ayd $$0, int $$1, int $$2) {
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
      public epa.c a() {
         return b;
      }
   }

   static record e(int c) implements epa.b {
      public static final Codec<epa.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(epa.e::b)).apply($$0, epa.e::new)
      );
      public static final epa.c b = new epa.c(new akf("uniform_bonus_count"), a);

      @Override
      public int a(ayd $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public epa.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
