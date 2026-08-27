import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class cyj extends csx {
   private static final hc[] i = hc.values();
   public static final dgc a = dgb.L;
   public static final dgc b = dgb.M;
   public static final dgc c = dgb.N;
   public static final dgc d = dgb.O;
   public static final dgc e = dgb.J;
   public static final dgc f = dgb.K;
   public static final Map<hc, dgc> g = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(hc.class), $$0 -> {
      $$0.put(hc.c, a);
      $$0.put(hc.f, b);
      $$0.put(hc.d, c);
      $$0.put(hc.e, d);
      $$0.put(hc.b, e);
      $$0.put(hc.a, f);
   }));
   protected final eii[] h;

   protected cyj(float $$0, dfk.d $$1) {
      super($$1);
      this.h = this.a($$0);
   }

   private eii[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      eii $$3 = csx.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      eii[] $$4 = new eii[i.length];

      for (int $$5 = 0; $$5 < i.length; $$5++) {
         hc $$6 = i[$$5];
         $$4[$$5] = eif.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      eii[] $$7 = new eii[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         eii $$9 = $$3;

         for (int $$10 = 0; $$10 < i.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = eif.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   public boolean c(dfl $$0, cpd $$1, gw $$2) {
      return false;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return this.h[this.h($$0)];
   }

   protected int h(dfl $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < i.length; $$2++) {
         if ($$0.c(g.get(i[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
