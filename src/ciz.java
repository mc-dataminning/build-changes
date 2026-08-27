public abstract class ciz extends cja implements cip {
   private static final aii<cpq> b = ail.a(ciz.class, aik.h);

   public ciz(bol<? extends ciz> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public ciz(bol<? extends ciz> $$0, double $$1, double $$2, double $$3, cwe $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public ciz(bol<? extends ciz> $$0, box $$1, cwe $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cpq $$0) {
      this.an().b(b, $$0.c(1));
   }

   protected abstract cpl s();

   @Override
   public cpq q() {
      return this.an().b(b);
   }

   @Override
   protected void c_() {
      this.an().a(b, new cpq(this.s()));
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
         this.a(new cpq(this.s()));
      }
   }
}
