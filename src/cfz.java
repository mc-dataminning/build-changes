public abstract class cfz extends cga implements cfq {
   private static final agj<cmr> b = agm.a(cfz.class, agl.h);

   public cfz(blt<? extends cfz> $$0, cti $$1) {
      super($$0, $$1);
   }

   public cfz(blt<? extends cfz> $$0, double $$1, double $$2, double $$3, cti $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cfz(blt<? extends cfz> $$0, bmf $$1, cti $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cmr $$0) {
      if (!$$0.a(this.s()) || $$0.u()) {
         this.an().b(b, $$0.c(1));
      }
   }

   protected abstract cmm s();

   protected cmr u() {
      return this.an().b(b);
   }

   @Override
   public cmr q() {
      cmr $$0 = this.u();
      return $$0.b() ? new cmr(this.s()) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(b, cmr.f);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      cmr $$1 = this.u();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new sl()));
      }
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      cmr $$1 = cmr.a($$0.p("Item"));
      this.a($$1);
   }
}
