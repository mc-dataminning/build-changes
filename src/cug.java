import javax.annotation.Nullable;

public class cug extends csi implements czw {
   public static final dga a = dfz.C;
   private static final int c = 3;
   protected static final eig b = csv.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   public cug(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return a($$2, dcx.z, $$0.B ? ddh::a : ddh::b);
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.b;
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(a) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return b;
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, @Nullable bjg $$3, cjf $$4) {
      if ($$4.A()) {
         dcv $$5 = $$0.c_($$1);
         if ($$5 instanceof dcq) {
            ((dcq)$$5).a($$4.y());
         }
      }
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      eam $$1 = $$0.q().b_($$0.a());
      return this.n().a(a, Boolean.valueOf($$1.a(apy.a) && $$1.e() == 8));
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
