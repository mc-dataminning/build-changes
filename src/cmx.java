public abstract class cmx extends cmy implements cmn {
   private static final ajs<ctq> b = ajw.a(cmx.class, aju.h);

   public cmx(bsc<? extends cmx> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cmx(bsc<? extends cmx> $$0, double $$1, double $$2, double $$3, daz $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cmx(bsc<? extends cmx> $$0, bsq $$1, daz $$2) {
      super($$0, $$1, $$2);
   }

   public void a(ctq $$0) {
      this.ap().a(b, $$0.c(1));
   }

   protected abstract ctl u();

   @Override
   public ctq p() {
      return this.ap().a(b);
   }

   @Override
   protected void a(ajw.a $$0) {
      $$0.a(b, new ctq(this.u()));
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dR()));
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(ctq.a(this.dR(), (va)$$0.p("Item")).orElseGet(() -> new ctq(this.u())));
      } else {
         this.a(new ctq(this.u()));
      }
   }
}
