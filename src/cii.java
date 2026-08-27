public class cii extends cim {
   private final chh a;
   private final cdz b;
   private int c;

   public cii(cdz $$0, chh $$1, biu $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(clo $$0) {
      return false;
   }

   @Override
   public clo a(int $$0) {
      if (this.g()) {
         this.c = this.c + Math.min($$0, this.f().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(clo $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(clo $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dN(), this.b, this.c);
      }

      if (this.d instanceof cig $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(cdz $$0, clo $$1) {
      this.b_($$1);
      ip<clo> $$2 = $$0.dN().q().c(coy.a, this.a, $$0.dN());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         clo $$4 = this.a.a($$3);
         clo $$5 = $$2.get($$3);
         if (!$$4.b()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.b()) {
            if ($$4.b()) {
               this.a.a($$3, $$5);
            } else if (clo.c($$4, $$5)) {
               $$5.g($$4.L());
               this.a.a($$3, $$5);
            } else if (!this.b.fT().e($$5)) {
               this.b.a($$5, false);
            }
         }
      }
   }
}
