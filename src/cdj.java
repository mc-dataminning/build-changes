public abstract class cdj extends cde implements cdm {
   private static final afc<ckj> e = aff.a(cdj.class, afe.h);

   public cdj(bjx<? extends cdj> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cdj(bjx<? extends cdj> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cqz $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cdj(bjx<? extends cdj> $$0, bkj $$1, double $$2, double $$3, double $$4, cqz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(ckj $$0) {
      if (!$$0.a(ckm.tf) || $$0.u()) {
         this.al().b(e, $$0.c(1));
      }
   }

   protected ckj w() {
      return this.al().b(e);
   }

   @Override
   public ckj q() {
      ckj $$0 = this.w();
      return $$0.b() ? new ckj(ckm.tf) : $$0;
   }

   @Override
   protected void b_() {
      this.al().a(e, ckj.b);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      ckj $$1 = this.w();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new rt()));
      }
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      ckj $$1 = ckj.a($$0.p("Item"));
      this.a($$1);
   }
}
