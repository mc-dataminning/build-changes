import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class cxw extends csk {
   private static final hb[] i = hb.values();
   public static final dfp a = dfo.L;
   public static final dfp b = dfo.M;
   public static final dfp c = dfo.N;
   public static final dfp d = dfo.O;
   public static final dfp e = dfo.J;
   public static final dfp f = dfo.K;
   public static final Map<hb, dfp> g = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(hb.class), $$0 -> {
      $$0.put(hb.c, a);
      $$0.put(hb.f, b);
      $$0.put(hb.d, c);
      $$0.put(hb.e, d);
      $$0.put(hb.b, e);
      $$0.put(hb.a, f);
   }));
   protected final ehy[] h;

   protected cxw(float $$0, dex.d $$1) {
      super($$1);
      this.h = this.a($$0);
   }

   private ehy[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      ehy $$3 = csk.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      ehy[] $$4 = new ehy[i.length];

      for (int $$5 = 0; $$5 < i.length; $$5++) {
         hb $$6 = i[$$5];
         $$4[$$5] = ehv.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      ehy[] $$7 = new ehy[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         ehy $$9 = $$3;

         for (int $$10 = 0; $$10 < i.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ehv.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   public boolean c(dey $$0, coq $$1, gv $$2) {
      return false;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return this.h[this.h($$0)];
   }

   protected int h(dey $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < i.length; $$2++) {
         if ($$0.c(g.get(i[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
