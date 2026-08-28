import org.joml.Vector2i;

public class fpv implements fqb {
   private final fnd a;
   private final fnm b;

   public fpv(fnd $$0) {
      this.a = $$0;
      this.b = new fnm();
   }

   @Override
   public boolean a(cvk $$0) {
      return $$0.g().a(axi.bQ);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cxy $$3) {
      int $$4 = cwm.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cwm.h($$3);
            int $$8 = fnm.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(cvk $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(cvk $$0, cty $$1) {
      if ($$1 == cty.b || $$1 == cty.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(cxy $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cwm.j($$0)) {
         gia $$3 = this.a.L();
         cwm.a($$0, $$2);
         $$3.b(new aia($$1, $$2));
      }
   }

   public void a(cxy $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
