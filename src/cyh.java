import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class cyh extends csv {
   private static final hc[] i = hc.values();
   public static final dga a = dfz.L;
   public static final dga b = dfz.M;
   public static final dga c = dfz.N;
   public static final dga d = dfz.O;
   public static final dga e = dfz.J;
   public static final dga f = dfz.K;
   public static final Map<hc, dga> g = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(hc.class), $$0 -> {
      $$0.put(hc.c, a);
      $$0.put(hc.f, b);
      $$0.put(hc.d, c);
      $$0.put(hc.e, d);
      $$0.put(hc.b, e);
      $$0.put(hc.a, f);
   }));
   protected final eig[] h;

   protected cyh(float $$0, dfi.d $$1) {
      super($$1);
      this.h = this.a($$0);
   }

   private eig[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      eig $$3 = csv.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      eig[] $$4 = new eig[i.length];

      for (int $$5 = 0; $$5 < i.length; $$5++) {
         hc $$6 = i[$$5];
         $$4[$$5] = eid.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      eig[] $$7 = new eig[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         eig $$9 = $$3;

         for (int $$10 = 0; $$10 < i.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = eid.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   public boolean c(dfj $$0, cpb $$1, gw $$2) {
      return false;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return this.h[this.h($$0)];
   }

   protected int h(dfj $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < i.length; $$2++) {
         if ($$0.c(g.get(i[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
