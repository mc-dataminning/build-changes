import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dhl extends dby {
   private static final ih[] a = ih.values();
   public static final dpq b = dpp.L;
   public static final dpq c = dpp.M;
   public static final dpq d = dpp.N;
   public static final dpq e = dpp.O;
   public static final dpq f = dpp.J;
   public static final dpq g = dpp.K;
   public static final Map<ih, dpq> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ih.class), $$0 -> {
      $$0.put(ih.c, b);
      $$0.put(ih.f, c);
      $$0.put(ih.d, d);
      $$0.put(ih.e, e);
      $$0.put(ih.b, f);
      $$0.put(ih.a, g);
   }));
   protected final est[] i;

   protected dhl(float $$0, doy.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhl> a();

   private est[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      est $$3 = dby.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      est[] $$4 = new est[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         ih $$6 = a[$$5];
         $$4[$$5] = esq.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      est[] $$7 = new est[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         est $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = esq.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(doz $$0, cyd $$1, ib $$2) {
      return false;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(doz $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
