import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dkp extends dfb {
   private static final je[] a = je.values();
   public static final dsv b = dsu.L;
   public static final dsv c = dsu.M;
   public static final dsv d = dsu.N;
   public static final dsv e = dsu.O;
   public static final dsv f = dsu.J;
   public static final dsv g = dsu.K;
   public static final Map<je, dsv> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(je.class), $$0 -> {
      $$0.put(je.c, b);
      $$0.put(je.f, c);
      $$0.put(je.d, d);
      $$0.put(je.e, e);
      $$0.put(je.b, f);
      $$0.put(je.a, g);
   }));
   protected final ewm[] i;

   protected dkp(float $$0, dsd.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkp> a();

   private ewm[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      ewm $$3 = dfb.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      ewm[] $$4 = new ewm[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         je $$6 = a[$$5];
         $$4[$$5] = ewj.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      ewm[] $$7 = new ewm[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         ewm $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ewj.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dse $$0, dbg $$1, iz $$2) {
      return false;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dse $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
