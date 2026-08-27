import javax.annotation.Nullable;

public class cyq extends cyp {
   public static final dfu e = cwf.aC;
   public static final dfr f = cyp.a;

   protected cyq(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, ha.c).a(f, Boolean.valueOf(true)));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return dbm.h($$0);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return csn.cq.a($$0, $$1, $$2);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return csn.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      dfa $$1 = csn.cq.a($$0);
      return $$1 == null ? null : this.n().a(e, $$1.c(e));
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
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
   protected boolean a(cpm $$0, gu $$1, dfa $$2) {
      ha $$3 = $$2.c(e).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$0.c(f) && $$0.c(e) != $$3 ? 15 : 0;
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return csn.cq.a($$0, $$1);
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return csn.cq.a($$0, $$1);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(e, f);
   }
}
