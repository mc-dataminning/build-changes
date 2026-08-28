public abstract class cpe extends coz implements cph {
   private static final float e = 12.25F;
   private static final ako<cwf> f = aks.a(cpe.class, akq.h);

   public cpe(bup<? extends cpe> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpe(bup<? extends cpe> $$0, double $$1, double $$2, double $$3, ezr $$4, dff $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cpe(bup<? extends cpe> $$0, bve $$1, ezr $$2, dff $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cwf $$0) {
      if ($$0.f()) {
         this.aw().a(f, this.w());
      } else {
         this.aw().a(f, $$0.c(1));
      }
   }

   @Override
   public cwf m() {
      return this.aw().a(f);
   }

   @Override
   protected void a(aks.a $$0) {
      $$0.a(f, this.w());
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Item", this.m().a(this.ea()));
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cwf.a(this.ea(), (vk)$$0.p("Item")).orElse(this.w()));
      } else {
         this.a(this.w());
      }
   }

   private cwf w() {
      return new cwf(cwj.uo);
   }

   @Override
   public bvw a_(int $$0) {
      return $$0 == 0 ? bvw.a(this::m, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return this.ag < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
