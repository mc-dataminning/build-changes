import org.joml.Vector2i;

public class flf implements fll {
   private final fjx a;
   private final fkh b;

   public flf(fjx $$0) {
      this.a = $$0;
      this.b = new fkh();
   }

   @Override
   public boolean a(ctp $$0) {
      return $$0.g().a(axm.bS);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cwf $$3) {
      int $$4 = cus.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cus.h($$3);
            $$7 = fkh.a((double)$$6, $$7, $$4);
            this.a($$3, $$2, $$7);
         }

         return true;
      }
   }

   @Override
   public void b(ctp $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(ctp $$0, csd $$1) {
      if ($$1 == csd.b) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(cwf $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cus.j($$0)) {
         gcz $$3 = this.a.L();
         cus.a($$0, $$2);
         $$3.b(new aik($$1, $$2));
      }
   }

   public void a(cwf $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
