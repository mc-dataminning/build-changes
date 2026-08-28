public abstract class cph extends cpc implements cpk {
   private static final float d = 12.25F;
   private static final akm<cwm> e = akq.a(cph.class, ako.h);

   public cph(bus<? extends cph> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cph(bus<? extends cph> $$0, double $$1, double $$2, double $$3, ezy $$4, dfm $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cph(bus<? extends cph> $$0, bvh $$1, ezy $$2, dfm $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cwm $$0) {
      if ($$0.f()) {
         this.au().a(e, this.t());
      } else {
         this.au().a(e, $$0.c(1));
      }
   }

   @Override
   protected void aM() {
   }

   @Override
   public cwm j() {
      return this.au().a(e);
   }

   @Override
   protected void a(akq.a $$0) {
      $$0.a(e, this.t());
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("Item", this.j().a(this.dX()));
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cwm.a(this.dX(), (vi)$$0.p("Item")).orElse(this.t()));
      } else {
         this.a(this.t());
      }
   }

   private cwm t() {
      return new cwm(cwq.uo);
   }

   @Override
   public bvz a_(int $$0) {
      return $$0 == 0 ? bvz.a(this::j, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
