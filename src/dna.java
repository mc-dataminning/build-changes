import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dna extends dhm {
   private static final jk[] a = jk.values();
   public static final dvj b = dvi.L;
   public static final dvj c = dvi.M;
   public static final dvj d = dvi.N;
   public static final dvj e = dvi.O;
   public static final dvj f = dvi.J;
   public static final dvj g = dvi.K;
   public static final Map<jk, dvj> h = ImmutableMap.copyOf(ad.a(Maps.newEnumMap(jk.class), $$0 -> {
      $$0.put(jk.c, b);
      $$0.put(jk.f, c);
      $$0.put(jk.d, d);
      $$0.put(jk.e, e);
      $$0.put(jk.b, f);
      $$0.put(jk.a, g);
   }));
   protected final ezq[] i;

   protected dna(float $$0, dur.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dna> a();

   private ezq[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      ezq $$3 = dhm.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      ezq[] $$4 = new ezq[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         jk $$6 = a[$$5];
         $$4[$$5] = ezn.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      ezq[] $$7 = new ezq[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         ezq $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ezn.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean e_(dus $$0) {
      return false;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.i[this.o($$0)];
   }

   protected int o(dus $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
