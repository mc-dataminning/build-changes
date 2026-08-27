import javax.annotation.Nullable;

public class cyu extends cyt {
   public static final dfy e = cwj.aC;
   public static final dfv f = cyt.a;

   protected cyu(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, hc.c).a(f, Boolean.valueOf(true)));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return dbq.h($$0);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return csr.cq.a($$0, $$1, $$2);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return csr.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      dfe $$1 = csr.cq.a($$0);
      return $$1 == null ? null : this.n().a(e, $$1.c(e));
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
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
   protected boolean a(cpq $$0, gw $$1, dfe $$2) {
      hc $$3 = $$2.c(e).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$0.c(f) && $$0.c(e) != $$3 ? 15 : 0;
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return csr.cq.a($$0, $$1);
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return csr.cq.a($$0, $$1);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(e, f);
   }
}
