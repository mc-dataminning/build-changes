public abstract class cmk extends cmf implements cmn {
   private static final ajs<ctq> f = ajw.a(cmk.class, aju.h);

   public cmk(bsc<? extends cmk> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cmk(bsc<? extends cmk> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, daz $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cmk(bsc<? extends cmk> $$0, bsq $$1, double $$2, double $$3, double $$4, daz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(ctq $$0) {
      if ($$0.e()) {
         this.ap().a(f, this.z());
      } else {
         this.ap().a(f, $$0.c(1));
      }
   }

   @Override
   public ctq p() {
      return this.ap().a(f);
   }

   @Override
   protected void a(ajw.a $$0) {
      $$0.a(f, this.z());
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
         this.a(ctq.a(this.dR(), (va)$$0.p("Item")).orElse(this.z()));
      } else {
         this.a(this.z());
      }
   }

   private ctq z() {
      return new ctq(ctt.tX);
   }
}
