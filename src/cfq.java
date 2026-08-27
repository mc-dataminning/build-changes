public class cfq extends cfu {
   private final ceq a;
   private final cbl b;
   private int c;

   public cfq(cbl $$0, ceq $$1, bgh $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(ciw $$0) {
      return false;
   }

   @Override
   public ciw a(int $$0) {
      if (this.f()) {
         this.c = this.c + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(ciw $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(ciw $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dK(), this.b, this.c);
      }

      if (this.d instanceof cfo $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(cbl $$0, ciw $$1) {
      this.b_($$1);
      ho<ciw> $$2 = $$0.dK().q().c(cmc.a, this.a, $$0.dK());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         ciw $$4 = this.a.a($$3);
         ciw $$5 = $$2.get($$3);
         if (!$$4.b()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.b()) {
            if ($$4.b()) {
               this.a.a($$3, $$5);
            } else if (ciw.c($$4, $$5)) {
               $$5.g($$4.L());
               this.a.a($$3, $$5);
            } else if (!this.b.fQ().e($$5)) {
               this.b.a($$5, false);
            }
         }
      }
   }
}
