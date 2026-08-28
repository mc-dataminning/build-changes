public abstract class cnu extends cnv implements cnk {
   private static final akj<cun> b = akn.a(cnu.class, akl.h);

   public cnu(bsy<? extends cnu> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public cnu(bsy<? extends cnu> $$0, double $$1, double $$2, double $$3, dbw $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cnu(bsy<? extends cnu> $$0, btn $$1, dbw $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cun $$0) {
      this.ap().a(b, $$0.c(1));
   }

   protected abstract cui u();

   @Override
   public cun p() {
      return this.ap().a(b);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(b, new cun(this.u()));
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
         this.a(cun.a(this.dR(), (vo)$$0.p("Item")).orElseGet(() -> new cun(this.u())));
      } else {
         this.a(new cun(this.u()));
      }
   }
}
