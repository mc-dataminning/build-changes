public abstract class cnl extends cng implements cno {
   private static final akk<cur> g = ako.a(cnl.class, akm.h);

   public cnl(btc<? extends cnl> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cnl(btc<? extends cnl> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dca $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cnl(btc<? extends cnl> $$0, btr $$1, double $$2, double $$3, double $$4, dca $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cur $$0) {
      if ($$0.e()) {
         this.ap().a(g, this.y());
      } else {
         this.ap().a(g, $$0.c(1));
      }
   }

   @Override
   public cur p() {
      return this.ap().a(g);
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(g, this.y());
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dR()));
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cur.a(this.dR(), (vp)$$0.p("Item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }
   }

   private cur y() {
      return new cur(cuu.tX);
   }

   @Override
   public buj a_(int $$0) {
      return $$0 == 0 ? buj.a(this::p, this::a) : super.a_($$0);
   }
}
