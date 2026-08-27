import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class das extends cvf {
   private static final ib[] a = ib.values();
   public static final die b = did.L;
   public static final die c = did.M;
   public static final die d = did.N;
   public static final die e = did.O;
   public static final die f = did.J;
   public static final die g = did.K;
   public static final Map<ib, die> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ib.class), $$0 -> {
      $$0.put(ib.c, b);
      $$0.put(ib.f, c);
      $$0.put(ib.d, d);
      $$0.put(ib.e, e);
      $$0.put(ib.b, f);
      $$0.put(ib.a, g);
   }));
   protected final eks[] i;

   protected das(float $$0, dhm.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends das> a();

   private eks[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      eks $$3 = cvf.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      eks[] $$4 = new eks[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         ib $$6 = a[$$5];
         $$4[$$5] = ekp.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      eks[] $$7 = new eks[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         eks $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ekp.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   public boolean a_(dhn $$0, crl $$1, hx $$2) {
      return false;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.i[this.h($$0)];
   }

   protected int h(dhn $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
