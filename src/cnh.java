public abstract class cnh extends cnc implements cnk {
   private static final akj<cun> f = akn.a(cnh.class, akl.h);

   public cnh(bsy<? extends cnh> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public cnh(bsy<? extends cnh> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dbw $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cnh(bsy<? extends cnh> $$0, btn $$1, double $$2, double $$3, double $$4, dbw $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cun $$0) {
      if ($$0.e()) {
         this.ap().a(f, this.z());
      } else {
         this.ap().a(f, $$0.c(1));
      }
   }

   @Override
   public cun p() {
      return this.ap().a(f);
   }

   @Override
   protected void a(akn.a $$0) {
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
         this.a(cun.a(this.dR(), (vo)$$0.p("Item")).orElse(this.z()));
      } else {
         this.a(this.z());
      }
   }

   private cun z() {
      return new cun(cuq.tX);
   }

   @Override
   public buf a_(int $$0) {
      return $$0 == 0 ? buf.a(this::p, this::a) : super.a_($$0);
   }
}
