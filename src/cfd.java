public abstract class cfd extends cey implements cfg {
   private static final afz<cmh> e = agc.a(cfd.class, agb.h);

   public cfd(blj<? extends cfd> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cfd(blj<? extends cfd> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, csy $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cfd(blj<? extends cfd> $$0, blv $$1, double $$2, double $$3, double $$4, csy $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cmh $$0) {
      if (!$$0.a(cmk.tS) || $$0.u()) {
         this.an().b(e, $$0.c(1));
      }
   }

   protected cmh y() {
      return this.an().b(e);
   }

   @Override
   public cmh q() {
      cmh $$0 = this.y();
      return $$0.b() ? new cmh(cmk.tS) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(e, cmh.f);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      cmh $$1 = this.y();
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
