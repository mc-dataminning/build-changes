import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class cxx extends csl {
   private static final ha[] i = ha.values();
   public static final dfq a = dfp.L;
   public static final dfq b = dfp.M;
   public static final dfq c = dfp.N;
   public static final dfq d = dfp.O;
   public static final dfq e = dfp.J;
   public static final dfq f = dfp.K;
   public static final Map<ha, dfq> g = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ha.class), $$0 -> {
      $$0.put(ha.c, a);
      $$0.put(ha.f, b);
      $$0.put(ha.d, c);
      $$0.put(ha.e, d);
      $$0.put(ha.b, e);
      $$0.put(ha.a, f);
   }));
   protected final ehw[] h;

   protected cxx(float $$0, dey.d $$1) {
      super($$1);
      this.h = this.a($$0);
   }

   private ehw[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      ehw $$3 = csl.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      ehw[] $$4 = new ehw[i.length];

      for (int $$5 = 0; $$5 < i.length; $$5++) {
         ha $$6 = i[$$5];
         $$4[$$5] = eht.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      ehw[] $$7 = new ehw[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         ehw $$9 = $$3;

         for (int $$10 = 0; $$10 < i.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = eht.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   public boolean c(dez $$0, cor $$1, gu $$2) {
      return false;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return this.h[this.h($$0)];
   }

   protected int h(dez $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < i.length; $$2++) {
         if ($$0.c(g.get(i[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
