public abstract class ctk extends ctl implements cta {
   private static final aku<dak> a = aky.a(ctk.class, akw.h);

   public ctk(bxn<? extends ctk> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public ctk(bxn<? extends ctk> $$0, double $$1, double $$2, double $$3, dkj $$4, dak $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public ctk(bxn<? extends ctk> $$0, byf $$1, dkj $$2, dak $$3) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3);
      this.c($$1);
   }

   public void a(dak $$0) {
      this.ar().a(a, $$0.c(1));
   }

   protected abstract dag g();

   @Override
   public dak f() {
      return this.ar().a(a);
   }

   @Override
   protected void a(aky.a $$0) {
      $$0.a(a, new dak(this.g()));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      alp<va> $$1 = this.dX().a(uo.a);
      $$0.a("Item", dak.b, $$1, this.f());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      alp<va> $$1 = this.dX().a(uo.a);
      this.a($$0.<dak>a("Item", dak.b, $$1).orElseGet(() -> new dak(this.g())));
   }
}
