import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class cxy extends csm {
   private static final ha[] i = ha.values();
   public static final dfr a = dfq.L;
   public static final dfr b = dfq.M;
   public static final dfr c = dfq.N;
   public static final dfr d = dfq.O;
   public static final dfr e = dfq.J;
   public static final dfr f = dfq.K;
   public static final Map<ha, dfr> g = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ha.class), $$0 -> {
      $$0.put(ha.c, a);
      $$0.put(ha.f, b);
      $$0.put(ha.d, c);
      $$0.put(ha.e, d);
      $$0.put(ha.b, e);
      $$0.put(ha.a, f);
   }));
   protected final ehx[] h;

   protected cxy(float $$0, dez.d $$1) {
      super($$1);
      this.h = this.a($$0);
   }

   private ehx[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      ehx $$3 = csm.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      ehx[] $$4 = new ehx[i.length];

      for (int $$5 = 0; $$5 < i.length; $$5++) {
         ha $$6 = i[$$5];
         $$4[$$5] = ehu.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      ehx[] $$7 = new ehx[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         ehx $$9 = $$3;

         for (int $$10 = 0; $$10 < i.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ehu.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   public boolean c(dfa $$0, cos $$1, gu $$2) {
      return false;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return this.h[this.h($$0)];
   }

   protected int h(dfa $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < i.length; $$2++) {
         if ($$0.c(g.get(i[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
