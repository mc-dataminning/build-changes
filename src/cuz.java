import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class cuz extends cpn {
   private static final ha[] i = ha.values();
   public static final dcs a = dcr.L;
   public static final dcs b = dcr.M;
   public static final dcs c = dcr.N;
   public static final dcs d = dcr.O;
   public static final dcs e = dcr.J;
   public static final dcs f = dcr.K;
   public static final Map<ha, dcs> g = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ha.class), $$0 -> {
      $$0.put(ha.c, a);
      $$0.put(ha.f, b);
      $$0.put(ha.d, c);
      $$0.put(ha.e, d);
      $$0.put(ha.b, e);
      $$0.put(ha.a, f);
   }));
   protected final efb[] h;

   protected cuz(float $$0, dca.d $$1) {
      super($$1);
      this.h = this.a($$0);
   }

   private efb[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      efb $$3 = cpn.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      efb[] $$4 = new efb[i.length];

      for (int $$5 = 0; $$5 < i.length; $$5++) {
         ha $$6 = i[$$5];
         $$4[$$5] = eey.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      efb[] $$7 = new efb[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         efb $$9 = $$3;

         for (int $$10 = 0; $$10 < i.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = eey.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   public boolean c(dcb $$0, cls $$1, gu $$2) {
      return false;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return this.h[this.h($$0)];
   }

   protected int h(dcb $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < i.length; $$2++) {
         if ($$0.c(g.get(i[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
