import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dij extends dcv {
   private static final ir[] a = ir.values();
   public static final dqp b = dqo.L;
   public static final dqp c = dqo.M;
   public static final dqp d = dqo.N;
   public static final dqp e = dqo.O;
   public static final dqp f = dqo.J;
   public static final dqp g = dqo.K;
   public static final Map<ir, dqp> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ir.class), $$0 -> {
      $$0.put(ir.c, b);
      $$0.put(ir.f, c);
      $$0.put(ir.d, d);
      $$0.put(ir.e, e);
      $$0.put(ir.b, f);
      $$0.put(ir.a, g);
   }));
   protected final ety[] i;

   protected dij(float $$0, dpx.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dij> a();

   private ety[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      ety $$3 = dcv.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      ety[] $$4 = new ety[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         ir $$6 = a[$$5];
         $$4[$$5] = etv.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      ety[] $$7 = new ety[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         ety $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = etv.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dpy $$0, cza $$1, im $$2) {
      return false;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dpy $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
