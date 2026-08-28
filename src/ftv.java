import org.joml.Vector2i;

public class ftv implements fub {
   private final frf a;
   private final fro b;

   public ftv(frf $$0) {
      this.a = $$0;
      this.b = new fro();
   }

   @Override
   public boolean a(cxp $$0) {
      return $$0.g().a(axo.bS);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, daa $$3) {
      int $$4 = cyp.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cyp.h($$3);
            int $$8 = fro.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(cxp $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(cxp $$0, cwd $$1) {
      if ($$1 == cwd.b || $$1 == cwd.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(daa $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cyp.j($$0)) {
         gme $$3 = this.a.L();
         cyp.a($$0, $$2);
         $$3.b(new aih($$1, $$2));
      }
   }

   public void a(daa $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
