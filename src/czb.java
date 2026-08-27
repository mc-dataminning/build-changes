import javax.annotation.Nullable;

public class czb extends cza {
   public static final dgf e = cwq.aC;
   public static final dgc f = cza.a;

   protected czb(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, hc.c).a(f, Boolean.valueOf(true)));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return dbx.h($$0);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return csy.cq.a($$0, $$1, $$2);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return csy.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      dfl $$1 = csy.cq.a($$0);
      return $$1 == null ? null : this.n().a(e, $$1.c(e));
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      if ($$0.c(f)) {
         hc $$4 = $$0.c(e).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(this.i, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(cpx $$0, gw $$1, dfl $$2) {
      hc $$3 = $$2.c(e).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.c(f) && $$0.c(e) != $$3 ? 15 : 0;
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return csy.cq.a($$0, $$1);
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return csy.cq.a($$0, $$1);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(e, f);
   }
}
