public abstract class cim extends cih implements cip {
   private static final aii<cpq> e = ail.a(cim.class, aik.h);

   public cim(bol<? extends cim> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cim(bol<? extends cim> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cwe $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cim(bol<? extends cim> $$0, box $$1, double $$2, double $$3, double $$4, cwe $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cpq $$0) {
      this.an().b(e, $$0.c(1));
   }

   @Override
   public cpq q() {
      return this.an().b(e);
   }

   @Override
   protected void c_() {
      this.an().a(e, this.z());
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Item", this.q().b(new sy()));
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cpq.a($$0.p("Item")));
      } else {
         this.a(this.z());
      }
   }

   private cpq z() {
      return new cpq(cpt.tV);
   }
}
