import org.joml.Vector2i;

public class foa implements fog {
   private final flj a;
   private final fls b;

   public foa(flj $$0) {
      this.a = $$0;
      this.b = new fls();
   }

   @Override
   public boolean a(ctz $$0) {
      return $$0.g().a(awy.bQ);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cwp $$3) {
      int $$4 = cvc.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cvc.h($$3);
            int $$8 = fls.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(ctz $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(ctz $$0, csn $$1) {
      if ($$1 == csn.b || $$1 == csn.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(cwp $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cvc.j($$0)) {
         gga $$3 = this.a.L();
         cvc.a($$0, $$2);
         $$3.b(new ahu($$1, $$2));
      }
   }

   public void a(cwp $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
