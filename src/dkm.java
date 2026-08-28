import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dkm extends dey {
   private static final je[] a = je.values();
   public static final dss b = dsr.L;
   public static final dss c = dsr.M;
   public static final dss d = dsr.N;
   public static final dss e = dsr.O;
   public static final dss f = dsr.J;
   public static final dss g = dsr.K;
   public static final Map<je, dss> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(je.class), $$0 -> {
      $$0.put(je.c, b);
      $$0.put(je.f, c);
      $$0.put(je.d, d);
      $$0.put(je.e, e);
      $$0.put(je.b, f);
      $$0.put(je.a, g);
   }));
   protected final ewj[] i;

   protected dkm(float $$0, dsa.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkm> a();

   private ewj[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      ewj $$3 = dey.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      ewj[] $$4 = new ewj[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         je $$6 = a[$$5];
         $$4[$$5] = ewg.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      ewj[] $$7 = new ewj[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         ewj $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ewg.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dsb $$0, dbd $$1, iz $$2) {
      return false;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dsb $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
