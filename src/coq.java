public abstract class coq extends cor implements cof {
   private static final akg<cvl> b = akk.a(coq.class, aki.h);

   public coq(btq<? extends coq> $$0, dds $$1) {
      super($$0, $$1);
   }

   public coq(btq<? extends coq> $$0, double $$1, double $$2, double $$3, dds $$4, cvl $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public coq(btq<? extends coq> $$0, buf $$1, dds $$2, cvl $$3) {
      this($$0, $$1.dx(), $$1.dB() - 0.1F, $$1.dD(), $$2, $$3);
      this.c($$1);
   }

   public void a(cvl $$0) {
      this.at().a(b, $$0.c(1));
   }

   protected abstract cvg o();

   @Override
   public cvl m() {
      return this.at().a(b);
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(b, new cvl(this.o()));
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Item", this.m().a(this.dU()));
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cvl.a(this.dU(), (vc)$$0.p("Item")).orElseGet(() -> new cvl(this.o())));
      } else {
         this.a(new cvl(this.o()));
      }
   }
}
