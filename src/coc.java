public abstract class coc extends cnx implements cof {
   private static final float e = 12.25F;
   private static final akg<cvl> f = akk.a(coc.class, aki.h);

   public coc(btq<? extends coc> $$0, dds $$1) {
      super($$0, $$1);
   }

   public coc(btq<? extends coc> $$0, double $$1, double $$2, double $$3, eye $$4, dds $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public coc(btq<? extends coc> $$0, buf $$1, eye $$2, dds $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cvl $$0) {
      if ($$0.f()) {
         this.at().a(f, this.w());
      } else {
         this.at().a(f, $$0.c(1));
      }
   }

   @Override
   public cvl m() {
      return this.at().a(f);
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(f, this.w());
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Item", this.m().a(this.dU()));
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cvl.a(this.dU(), (vc)$$0.p("Item")).orElse(this.w()));
      } else {
         this.a(this.w());
      }
   }

   private cvl w() {
      return new cvl(cvo.tY);
   }

   @Override
   public buw a_(int $$0) {
      return $$0 == 0 ? buw.a(this::m, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return this.ag < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
