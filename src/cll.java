public class cll extends clw {
   private final clj a;
   private final chh b;
   private int c;
   private final cuk h;

   public cll(chh $$0, cuk $$1, clj $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(coz $$0) {
      return false;
   }

   @Override
   public coz a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(coz $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(coz $$0) {
      $$0.a(this.b.dM(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(chh $$0, coz $$1) {
      this.b_($$1);
      cul $$2 = this.a.g();
      if ($$2 != null) {
         coz $$3 = this.a.a(0);
         coz $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(atu.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.u(this.h.w() + $$2.p());
      }
   }
}
