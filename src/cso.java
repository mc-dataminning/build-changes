public abstract class cso extends csi implements csr {
   private static final float d = 12.25F;
   private static final akn<daa> e = akr.a(cso.class, akp.h);

   public cso(bxe<? extends cso> $$0, djz $$1) {
      super($$0, $$1);
   }

   public cso(bxe<? extends cso> $$0, double $$1, double $$2, double $$3, ffs $$4, djz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cso(bxe<? extends cso> $$0, bxw $$1, ffs $$2, djz $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(daa $$0) {
      if ($$0.f()) {
         this.ar().a(e, this.o());
      } else {
         this.ar().a(e, $$0.c(1));
      }
   }

   @Override
   protected void aL() {
   }

   @Override
   public daa f() {
      return this.ar().a(e);
   }

   @Override
   protected void a(akr.a $$0) {
      $$0.a(e, this.o());
   }

   @Override
   public void b(ua $$0) {
      ali<va> $$1 = this.dX().a(uo.a);
      $$0.a("Item", daa.b, $$1, this.f());
   }

   @Override
   public void a(ua $$0) {
      ali<va> $$1 = this.dX().a(uo.a);
      this.a($$0.<daa>a("Item", daa.b, $$1).orElse(this.o()));
   }

   private daa o() {
      return new daa(dae.vg);
   }

   @Override
   public byn a_(int $$0) {
      return $$0 == 0 ? byn.a(this::f, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
