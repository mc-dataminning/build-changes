public abstract class ces extends cet implements cej {
   private static final afo<clj> b = afr.a(ces.class, afq.h);

   public ces(bku<? extends ces> $$0, csa $$1) {
      super($$0, $$1);
   }

   public ces(bku<? extends ces> $$0, double $$1, double $$2, double $$3, csa $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public ces(bku<? extends ces> $$0, blg $$1, csa $$2) {
      super($$0, $$1, $$2);
   }

   public void a(clj $$0) {
      if (!$$0.a(this.s()) || $$0.u()) {
         this.an().b(b, $$0.c(1));
      }
   }

   protected abstract cle s();

   protected clj u() {
      return this.an().b(b);
   }

   @Override
   public clj q() {
      clj $$0 = this.u();
      return $$0.b() ? new clj(this.s()) : $$0;
   }

   @Override
   protected void b_() {
      this.an().a(b, clj.b);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      clj $$1 = this.u();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new rz()));
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      clj $$1 = clj.a($$0.p("Item"));
      this.a($$1);
   }
}
