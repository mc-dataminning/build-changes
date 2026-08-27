public class cos extends cpd {
   private final coq a;
   private final ckl b;
   private int c;
   private final cyr h;

   public cos(ckl $$0, cyr $$1, coq $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(csd $$0) {
      return false;
   }

   @Override
   public csd a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().G());
      }

      return super.a($$0);
   }

   @Override
   protected void a(csd $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(csd $$0) {
      $$0.a(this.b.dN(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(ckl $$0, csd $$1) {
      this.b_($$1);
      cys $$2 = this.a.g();
      if ($$2 != null) {
         csd $$3 = this.a.a(0);
         csd $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(avj.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.u(this.h.u() + $$2.q());
      }
   }
}
