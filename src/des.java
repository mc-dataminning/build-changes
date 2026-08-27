import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class des extends czf {
   private static final ih[] a = ih.values();
   public static final dmv b = dmu.L;
   public static final dmv c = dmu.M;
   public static final dmv d = dmu.N;
   public static final dmv e = dmu.O;
   public static final dmv f = dmu.J;
   public static final dmv g = dmu.K;
   public static final Map<ih, dmv> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ih.class), $$0 -> {
      $$0.put(ih.c, b);
      $$0.put(ih.f, c);
      $$0.put(ih.d, d);
      $$0.put(ih.e, e);
      $$0.put(ih.b, f);
      $$0.put(ih.a, g);
   }));
   protected final epo[] i;

   protected des(float $$0, dmd.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends des> a();

   private epo[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      epo $$3 = czf.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      epo[] $$4 = new epo[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         ih $$6 = a[$$5];
         $$4[$$5] = epl.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      epo[] $$7 = new epo[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         epo $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = epl.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dme $$0, cvk $$1, ib $$2) {
      return false;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dme $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
