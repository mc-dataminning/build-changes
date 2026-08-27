public abstract class cci extends ccd implements ccl {
   private static final aeg<cjh> e = aej.a(cci.class, aei.h);

   public cci(biw<? extends cci> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public cci(biw<? extends cci> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cpx $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cci(biw<? extends cci> $$0, bji $$1, double $$2, double $$3, double $$4, cpx $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cjh $$0) {
      if (!$$0.a(cjk.tf) || $$0.u()) {
         this.al().b(e, $$0.c(1));
      }
   }

   protected cjh w() {
      return this.al().b(e);
   }

   @Override
   public cjh q() {
      cjh $$0 = this.w();
      return $$0.b() ? new cjh(cjk.tf) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(e, cjh.b);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      cjh $$1 = this.w();
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
