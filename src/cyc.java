import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class cyc extends csq {
   private static final hc[] i = hc.values();
   public static final dfv a = dfu.L;
   public static final dfv b = dfu.M;
   public static final dfv c = dfu.N;
   public static final dfv d = dfu.O;
   public static final dfv e = dfu.J;
   public static final dfv f = dfu.K;
   public static final Map<hc, dfv> g = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(hc.class), $$0 -> {
      $$0.put(hc.c, a);
      $$0.put(hc.f, b);
      $$0.put(hc.d, c);
      $$0.put(hc.e, d);
      $$0.put(hc.b, e);
      $$0.put(hc.a, f);
   }));
   protected final eib[] h;

   protected cyc(float $$0, dfd.d $$1) {
      super($$1);
      this.h = this.a($$0);
   }

   private eib[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      eib $$3 = csq.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      eib[] $$4 = new eib[i.length];

      for (int $$5 = 0; $$5 < i.length; $$5++) {
         hc $$6 = i[$$5];
         $$4[$$5] = ehy.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      eib[] $$7 = new eib[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         eib $$9 = $$3;

         for (int $$10 = 0; $$10 < i.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ehy.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   public boolean c(dfe $$0, cow $$1, gw $$2) {
      return false;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return this.h[this.h($$0)];
   }

   protected int h(dfe $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < i.length; $$2++) {
         if ($$0.c(g.get(i[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
