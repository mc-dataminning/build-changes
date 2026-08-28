import org.joml.Vector2i;

public class fnh implements fnn {
   private final flz a;
   private final fmi b;

   public fnh(flz $$0) {
      this.a = $$0;
      this.b = new fmi();
   }

   @Override
   public boolean a(cuu $$0) {
      return $$0.g().a(ayd.bT);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cxk $$3) {
      int $$4 = cvx.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cvx.h($$3);
            int $$8 = fmi.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(cuu $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(cuu $$0, cti $$1) {
      if ($$1 == cti.b || $$1 == cti.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(cxk $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cvx.j($$0)) {
         gfe $$3 = this.a.L();
         cvx.a($$0, $$2);
         $$3.b(new aiy($$1, $$2));
      }
   }

   public void a(cxk $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
