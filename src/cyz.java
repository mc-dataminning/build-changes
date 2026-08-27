import javax.annotation.Nullable;

public class cyz extends cyy {
   public static final dgd e = cwo.aC;
   public static final dga f = cyy.a;

   protected cyz(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, hc.c).a(f, Boolean.valueOf(true)));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return dbv.h($$0);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return csw.cq.a($$0, $$1, $$2);
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return csw.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      dfj $$1 = csw.cq.a($$0);
      return $$1 == null ? null : this.n().a(e, $$1.c(e));
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
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
   protected boolean a(cpv $$0, gw $$1, dfj $$2) {
      hc $$3 = $$2.c(e).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(dfj $$0, cpb $$1, gw $$2, hc $$3) {
      return $$0.c(f) && $$0.c(e) != $$3 ? 15 : 0;
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return csw.cq.a($$0, $$1);
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return csw.cq.a($$0, $$1);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(e, f);
   }
}
