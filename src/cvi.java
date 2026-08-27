import javax.annotation.Nullable;

public class cvi extends crp<ddp> implements czw {
   public static final dgd b = cwo.aC;
   public static final dga c = dfz.C;
   protected static final eig d = csv.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final tl e = tl.c("container.enderchest");

   protected cvi(dfi.d $$0) {
      super($$0, () -> dcx.d);
      this.k(this.C.b().a(b, ha.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public cuy.c<? extends ddc> a(dfj $$0, cpv $$1, gw $$2, boolean $$3) {
      return cuy.b::b;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return d;
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.b;
   }

   @Override
   public dfj a(cln $$0) {
      eam $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, $$0.g().g()).a(c, Boolean.valueOf($$1.a() == ean.c));
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      cfu $$6 = $$3.ge();
      dcv $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof ddp) {
         gw $$8 = $$2.c();
         if ($$1.a_($$8).g($$1, $$8)) {
            return bgy.a($$1.B);
         } else if ($$1.B) {
            return bgy.a;
         } else {
            ddp $$9 = (ddp)$$7;
            $$6.a($$9);
            $$3.a(new bhg(($$1x, $$2x, $$3x) -> ces.a($$1x, $$2x, $$6), e));
            $$3.a(apn.aj);
            cal.a($$3, true);
            return bgy.b;
         }
      } else {
         return bgy.a($$1.B);
      }
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return $$0.B ? a($$2, dcx.d, ddp::a) : null;
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(iv.X, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(c) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      dcv $$4 = $$1.c_($$2);
      if ($$4 instanceof ddp) {
         ((ddp)$$4).c();
      }
   }
}
