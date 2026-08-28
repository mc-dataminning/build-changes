import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dlk extends dfw {
   private static final ji[] a = ji.values();
   public static final dtr b = dtq.L;
   public static final dtr c = dtq.M;
   public static final dtr d = dtq.N;
   public static final dtr e = dtq.O;
   public static final dtr f = dtq.J;
   public static final dtr g = dtq.K;
   public static final Map<ji, dtr> h = ImmutableMap.copyOf(ad.a(Maps.newEnumMap(ji.class), $$0 -> {
      $$0.put(ji.c, b);
      $$0.put(ji.f, c);
      $$0.put(ji.d, d);
      $$0.put(ji.e, e);
      $$0.put(ji.b, f);
      $$0.put(ji.a, g);
   }));
   protected final exp[] i;

   protected dlk(float $$0, dsz.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlk> a();

   private exp[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      exp $$3 = dfw.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      exp[] $$4 = new exp[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         ji $$6 = a[$$5];
         $$4[$$5] = exm.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      exp[] $$7 = new exp[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         exp $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = exm.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dta $$0, dca $$1, jd $$2) {
      return false;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dta $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
