public abstract class ctb extends ctc implements csr {
   private static final akn<daa> a = akr.a(ctb.class, akp.h);

   public ctb(bxe<? extends ctb> $$0, djz $$1) {
      super($$0, $$1);
   }

   public ctb(bxe<? extends ctb> $$0, double $$1, double $$2, double $$3, djz $$4, daa $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public ctb(bxe<? extends ctb> $$0, bxw $$1, djz $$2, daa $$3) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3);
      this.c($$1);
   }

   public void a(daa $$0) {
      this.ar().a(a, $$0.c(1));
   }

   protected abstract czw g();

   @Override
   public daa f() {
      return this.ar().a(a);
   }

   @Override
   protected void a(akr.a $$0) {
      $$0.a(a, new daa(this.g()));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      ali<va> $$1 = this.dX().a(uo.a);
      $$0.a("Item", daa.b, $$1, this.f());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      ali<va> $$1 = this.dX().a(uo.a);
      this.a($$0.<daa>a("Item", daa.b, $$1).orElseGet(() -> new daa(this.g())));
   }
}
