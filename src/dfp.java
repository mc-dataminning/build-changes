import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dfp extends dac {
   private static final ih[] a = ih.values();
   public static final dns b = dnr.L;
   public static final dns c = dnr.M;
   public static final dns d = dnr.N;
   public static final dns e = dnr.O;
   public static final dns f = dnr.J;
   public static final dns g = dnr.K;
   public static final Map<ih, dns> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ih.class), $$0 -> {
      $$0.put(ih.c, b);
      $$0.put(ih.f, c);
      $$0.put(ih.d, d);
      $$0.put(ih.e, e);
      $$0.put(ih.b, f);
      $$0.put(ih.a, g);
   }));
   protected final eqm[] i;

   protected dfp(float $$0, dna.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfp> a();

   private eqm[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      eqm $$3 = dac.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      eqm[] $$4 = new eqm[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         ih $$6 = a[$$5];
         $$4[$$5] = eqj.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      eqm[] $$7 = new eqm[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         eqm $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = eqj.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dnb $$0, cwh $$1, ib $$2) {
      return false;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dnb $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
