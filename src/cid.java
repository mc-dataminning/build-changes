public class cid extends cih {
   private final chc a;
   private final cdu b;
   private int c;

   public cid(cdu $$0, chc $$1, biq $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(clj $$0) {
      return false;
   }

   @Override
   public clj a(int $$0) {
      if (this.g()) {
         this.c = this.c + Math.min($$0, this.f().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(clj $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(clj $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dN(), this.b, this.c);
      }

      if (this.d instanceof cib $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(cdu $$0, clj $$1) {
      this.b_($$1);
      il<clj> $$2 = $$0.dN().q().c(cot.a, this.a, $$0.dN());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         clj $$4 = this.a.a($$3);
         clj $$5 = $$2.get($$3);
         if (!$$4.b()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.b()) {
            if ($$4.b()) {
               this.a.a($$3, $$5);
            } else if (clj.c($$4, $$5)) {
               $$5.g($$4.L());
               this.a.a($$3, $$5);
            } else if (!this.b.fT().e($$5)) {
               this.b.a($$5, false);
            }
         }
      }
   }
}
