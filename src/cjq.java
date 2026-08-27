public class cjq extends ciy {
   private static final cqk g = new cqk(cqn.vm);
   private int h = 200;

   public cjq(bpc<? extends cjq> $$0, cwz $$1) {
      super($$0, $$1, g);
   }

   public cjq(cwz $$0, bpo $$1, cqk $$2) {
      super(bpc.aU, $$1, $$0, $$2);
   }

   public cjq(cwz $$0, double $$1, double $$2, double $$3, cqk $$4) {
      super(bpc.aU, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && !this.b) {
         this.dM().a(kc.Q, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bpo $$0) {
      super.a($$0);
      boj $$1 = new boj(bol.x, this.h, 0);
      $$0.b($$1, this.H());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.h = $$0.h("Duration");
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Duration", this.h);
   }
}
