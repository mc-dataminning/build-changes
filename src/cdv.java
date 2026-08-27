public abstract class cdv extends cdw implements cdm {
   private static final afc<ckj> b = aff.a(cdv.class, afe.h);

   public cdv(bjx<? extends cdv> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cdv(bjx<? extends cdv> $$0, double $$1, double $$2, double $$3, cqz $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cdv(bjx<? extends cdv> $$0, bkj $$1, cqz $$2) {
      super($$0, $$1, $$2);
   }

   public void a(ckj $$0) {
      if (!$$0.a(this.s()) || $$0.u()) {
         this.al().b(b, $$0.c(1));
      }
   }

   protected abstract cke s();

   protected ckj t() {
      return this.al().b(b);
   }

   @Override
   public ckj q() {
      ckj $$0 = this.t();
      return $$0.b() ? new ckj(this.s()) : $$0;
   }

   @Override
   protected void b_() {
      this.al().a(b, ckj.b);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      ckj $$1 = this.t();
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
