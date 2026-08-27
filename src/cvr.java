import javax.annotation.Nullable;

public class cvr extends cvq {
   public static final dcv e = ctg.aC;
   public static final dcs f = cvq.a;

   protected cvr(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, ha.c).a(f, Boolean.valueOf(true)));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return cyn.h($$0);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      return cpo.cq.a($$0, $$1, $$2);
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return cpo.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      dcb $$1 = cpo.cq.a($$0);
      return $$1 == null ? null : this.n().a(e, $$1.c(e));
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      if ($$0.c(f)) {
         ha $$4 = $$0.c(e).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(this.i, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(cmm $$0, gu $$1, dcb $$2) {
      ha $$3 = $$2.c(e).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return $$0.c(f) && $$0.c(e) != $$3 ? 15 : 0;
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return cpo.cq.a($$0, $$1);
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return cpo.cq.a($$0, $$1);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(e, f);
   }
}
