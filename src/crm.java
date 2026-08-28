public abstract class crm extends crg implements crp {
   private static final float d = 12.25F;
   private static final akj<cyy> e = akn.a(crm.class, akl.h);

   public crm(bwm<? extends crm> $$0, div $$1) {
      super($$0, $$1);
   }

   public crm(bwm<? extends crm> $$0, double $$1, double $$2, double $$3, fei $$4, div $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public crm(bwm<? extends crm> $$0, bxc $$1, fei $$2, div $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cyy $$0) {
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
   public cyy f() {
      return this.au().a(e);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(e, this.o());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Item", this.f().a(this.dX()));
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cyy.a(this.dX(), (uw)$$0.p("Item")).orElse(this.o()));
      } else {
         this.a(this.o());
      }
   }

   private cyy o() {
      return new cyy(czc.vb);
   }

   @Override
   public bxt a_(int $$0) {
      return $$0 == 0 ? bxt.a(this::f, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
