public class ciy extends cig {
   private static final cpq g = new cpq(cpt.vl);
   private int h = 200;

   public ciy(bol<? extends ciy> $$0, cwe $$1) {
      super($$0, $$1, g);
   }

   public ciy(cwe $$0, box $$1, cpq $$2) {
      super(bol.aT, $$1, $$0, $$2);
   }

   public ciy(cwe $$0, double $$1, double $$2, double $$3, cpq $$4) {
      super(bol.aT, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dJ().B && !this.b) {
         this.dJ().a(kb.P, this.do(), this.dq(), this.du(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(box $$0) {
      super.a($$0);
      bns $$1 = new bns(bnu.x, this.h, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.h = $$0.h("Duration");
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Duration", this.h);
   }
}
