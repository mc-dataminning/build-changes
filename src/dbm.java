import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dbm extends cvz {
   private static final ia[] a = ia.values();
   public static final djg b = djf.L;
   public static final djg c = djf.M;
   public static final djg d = djf.N;
   public static final djg e = djf.O;
   public static final djg f = djf.J;
   public static final djg g = djf.K;
   public static final Map<ia, djg> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ia.class), $$0 -> {
      $$0.put(ia.c, b);
      $$0.put(ia.f, c);
      $$0.put(ia.d, d);
      $$0.put(ia.e, e);
      $$0.put(ia.b, f);
      $$0.put(ia.a, g);
   }));
   protected final elu[] i;

   protected dbm(float $$0, dio.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dbm> a();

   private elu[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      elu $$3 = cvz.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      elu[] $$4 = new elu[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         ia $$6 = a[$$5];
         $$4[$$5] = elr.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      elu[] $$7 = new elu[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         elu $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = elr.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   public boolean a_(dip $$0, cse $$1, hv $$2) {
      return false;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.i[this.h($$0)];
   }

   protected int h(dip $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
