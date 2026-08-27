public abstract class ccm extends cch implements ccp {
   private static final aef<cjl> e = aei.a(ccm.class, aeh.h);

   public ccm(bja<? extends ccm> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public ccm(bja<? extends ccm> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cqb $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public ccm(bja<? extends ccm> $$0, bjm $$1, double $$2, double $$3, double $$4, cqb $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cjl $$0) {
      if (!$$0.a(cjo.tf) || $$0.u()) {
         this.al().b(e, $$0.c(1));
      }
   }

   protected cjl w() {
      return this.al().b(e);
   }

   @Override
   public cjl q() {
      cjl $$0 = this.w();
      return $$0.b() ? new cjl(cjo.tf) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(e, cjl.b);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      cjl $$1 = this.w();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new qw()));
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      cjl $$1 = cjl.a($$0.p("Item"));
      this.a($$1);
   }
}
