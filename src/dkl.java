import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dkl extends dex {
   private static final je[] a = je.values();
   public static final dsr b = dsq.L;
   public static final dsr c = dsq.M;
   public static final dsr d = dsq.N;
   public static final dsr e = dsq.O;
   public static final dsr f = dsq.J;
   public static final dsr g = dsq.K;
   public static final Map<je, dsr> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(je.class), $$0 -> {
      $$0.put(je.c, b);
      $$0.put(je.f, c);
      $$0.put(je.d, d);
      $$0.put(je.e, e);
      $$0.put(je.b, f);
      $$0.put(je.a, g);
   }));
   protected final ewi[] i;

   protected dkl(float $$0, drz.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkl> a();

   private ewi[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      ewi $$3 = dex.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      ewi[] $$4 = new ewi[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         je $$6 = a[$$5];
         $$4[$$5] = ewf.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      ewi[] $$7 = new ewi[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         ewi $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ewf.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dsa $$0, dbc $$1, iz $$2) {
      return false;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dsa $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
