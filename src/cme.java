public class cme extends cmp {
   private final cmc a;
   private final cia b;
   private int c;
   private final cvb h;

   public cme(cia $$0, cvb $$1, cmc $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cpq $$0) {
      return false;
   }

   @Override
   public cpq a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cpq $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cpq $$0) {
      $$0.a(this.b.dJ(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(cia $$0, cpq $$1) {
      this.b_($$1);
      cvc $$2 = this.a.g();
      if ($$2 != null) {
         cpq $$3 = this.a.a(0);
         cpq $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(atz.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.u(this.h.w() + $$2.p());
      }
   }
}
