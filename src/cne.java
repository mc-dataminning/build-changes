public abstract class cne extends cmz implements cnh {
   private static final akg<cuk> f = akk.a(cne.class, aki.h);

   public cne(bsv<? extends cne> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public cne(bsv<? extends cne> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dbt $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cne(bsv<? extends cne> $$0, btk $$1, double $$2, double $$3, double $$4, dbt $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cuk $$0) {
      if ($$0.e()) {
         this.ap().a(f, this.z());
      } else {
         this.ap().a(f, $$0.c(1));
      }
   }

   @Override
   public cuk p() {
      return this.ap().a(f);
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(f, this.z());
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dR()));
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cuk.a(this.dR(), (vo)$$0.p("Item")).orElse(this.z()));
      } else {
         this.a(this.z());
      }
   }

   private cuk z() {
      return new cuk(cun.tX);
   }

   @Override
   public buc a_(int $$0) {
      return $$0 == 0 ? buc.a(this::p, this::a) : super.a_($$0);
   }
}
