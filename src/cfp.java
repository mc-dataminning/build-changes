public abstract class cfp extends cfq implements cfg {
   private static final afz<cmh> b = agc.a(cfp.class, agb.h);

   public cfp(blj<? extends cfp> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cfp(blj<? extends cfp> $$0, double $$1, double $$2, double $$3, csy $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cfp(blj<? extends cfp> $$0, blv $$1, csy $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cmh $$0) {
      if (!$$0.a(this.s()) || $$0.u()) {
         this.an().b(b, $$0.c(1));
      }
   }

   protected abstract cmc s();

   protected cmh u() {
      return this.an().b(b);
   }

   @Override
   public cmh q() {
      cmh $$0 = this.u();
      return $$0.b() ? new cmh(this.s()) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(b, cmh.f);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      cmh $$1 = this.u();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new sj()));
      }
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      cmh $$1 = cmh.a($$0.p("Item"));
      this.a($$1);
   }
}
