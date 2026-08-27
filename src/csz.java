import javax.annotation.Nullable;

public class csz extends csi implements cvm {
   private static final dgj b = dfz.bv;
   public static final int a = 2;
   private final csv c;
   private final apd d;
   private final apd e;

   public csz(csv $$0, dfi.d $$1, apd $$2, apd $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.e = $$3;
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b);
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      if ($$1.c_($$2) instanceof dcz $$4) {
         $$4.c();
      }

      if (cvn.h($$1.a_($$2.d())) && $$2.v() >= $$1.H_()) {
         bym $$5 = bym.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(cpv $$0, gw $$1, bym $$2) {
      ehn $$3 = $$2.cG().f();
      $$0.c(2001, gw.a($$3), csv.i($$2.t()));
      $$0.a($$2, djt.f, $$3);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      if ($$3.a(16) == 0) {
         gw $$4 = $$2.d();
         if (cvn.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new ip(ix.z, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dcz($$0, $$1);
   }

   public csv a() {
      return this.c;
   }

   public apd b() {
      return this.d;
   }

   public apd c() {
      return this.e;
   }
}
