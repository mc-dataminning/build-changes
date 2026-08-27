public abstract class ccu extends ccv implements ccl {
   private static final aeg<cjh> b = aej.a(ccu.class, aei.h);

   public ccu(biw<? extends ccu> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public ccu(biw<? extends ccu> $$0, double $$1, double $$2, double $$3, cpx $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public ccu(biw<? extends ccu> $$0, bji $$1, cpx $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cjh $$0) {
      if (!$$0.a(this.s()) || $$0.u()) {
         this.al().b(b, $$0.c(1));
      }
   }

   protected abstract cjc s();

   protected cjh t() {
      return this.al().b(b);
   }

   @Override
   public cjh q() {
      cjh $$0 = this.t();
      return $$0.b() ? new cjh(this.s()) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(b, cjh.b);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      cjh $$1 = this.t();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new qy()));
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      cjh $$1 = cjh.a($$0.p("Item"));
      this.a($$1);
   }
}
