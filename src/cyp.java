import javax.annotation.Nullable;

public class cyp extends cyo {
   public static final dft e = cwe.aC;
   public static final dfq f = cyo.a;

   protected cyp(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, ha.c).a(f, Boolean.valueOf(true)));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return dbl.h($$0);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return csm.cq.a($$0, $$1, $$2);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return csm.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      dez $$1 = csm.cq.a($$0);
      return $$1 == null ? null : this.n().a(e, $$1.c(e));
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
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
   protected boolean a(cpl $$0, gu $$1, dez $$2) {
      ha $$3 = $$2.c(e).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$0.c(f) && $$0.c(e) != $$3 ? 15 : 0;
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return csm.cq.a($$0, $$1);
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return csm.cq.a($$0, $$1);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(e, f);
   }
}
