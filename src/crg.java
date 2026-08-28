public abstract class crg extends cra implements crj {
   private static final float d = 12.25F;
   private static final akh<cys> e = akl.a(crg.class, akj.h);

   public crg(bwj<? extends crg> $$0, dip $$1) {
      super($$0, $$1);
   }

   public crg(bwj<? extends crg> $$0, double $$1, double $$2, double $$3, fdw $$4, dip $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public crg(bwj<? extends crg> $$0, bwz $$1, fdw $$2, dip $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cys $$0) {
      if ($$0.f()) {
         this.au().a(e, this.o());
      } else {
         this.au().a(e, $$0.c(1));
      }
   }

   @Override
   protected void aM() {
   }

   @Override
   public cys ae_() {
      return this.au().a(e);
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(e, this.o());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Item", this.ae_().a(this.dX()));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cys.a(this.dX(), (uu)$$0.p("Item")).orElse(this.o()));
      } else {
         this.a(this.o());
      }
   }

   private cys o() {
      return new cys(cyw.uZ);
   }

   @Override
   public bxq a_(int $$0) {
      return $$0 == 0 ? bxq.a(this::ae_, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
