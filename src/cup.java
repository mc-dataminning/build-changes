import javax.annotation.Nullable;

public class cup extends csi {
   public static final dgj a = dfz.aT;
   public static final dga b = dfz.p;
   protected static final eig c = csv.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   public cup(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return c;
   }

   @Override
   public boolean g_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpb $$1, gw $$2, hc $$3) {
      return $$0.c(a);
   }

   private static void d(dfj $$0, cpv $$1, gw $$2) {
      int $$3 = $$1.a(cqe.a, $$2) - $$1.A_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(b);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * arx.b($$4));
      }

      $$3 = arx.a($$3, 0, 15);
      if ($$0.c(a) != $$3) {
         $$1.a($$2, $$0.a(a, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$3.gd()) {
         if ($$1.B) {
            return bgy.a;
         } else {
            dfj $$6 = $$0.a(b);
            $$1.a($$2, $$6, 2);
            $$1.a(djt.c, $$2, djt.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return bgy.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public boolean f_(dfj $$0) {
      return true;
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return !$$0.B && $$0.C_().g() ? a($$2, dcx.q, cup::a) : null;
   }

   private static void a(cpv $$0, gw $$1, dfj $$2, ddj $$3) {
      if ($$0.V() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b);
   }
}
