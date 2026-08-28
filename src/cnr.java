public abstract class cnr extends cns implements cnh {
   private static final akg<cuk> b = akk.a(cnr.class, aki.h);

   public cnr(bsv<? extends cnr> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public cnr(bsv<? extends cnr> $$0, double $$1, double $$2, double $$3, dbt $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cnr(bsv<? extends cnr> $$0, btk $$1, dbt $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cuk $$0) {
      this.ap().a(b, $$0.c(1));
   }

   protected abstract cuf u();

   @Override
   public cuk p() {
      return this.ap().a(b);
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(b, new cuk(this.u()));
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
         this.a(cuk.a(this.dR(), (vo)$$0.p("Item")).orElseGet(() -> new cuk(this.u())));
      } else {
         this.a(new cuk(this.u()));
      }
   }
}
