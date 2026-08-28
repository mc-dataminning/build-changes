import org.joml.Vector2i;

public class fsd implements fsj {
   private final fpo a;
   private final fpx b;

   public fsd(fpo $$0) {
      this.a = $$0;
      this.b = new fpx();
   }

   @Override
   public boolean a(cwz $$0) {
      return $$0.g().a(axk.bR);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, czk $$3) {
      int $$4 = cxz.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cxz.h($$3);
            int $$8 = fpx.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(cwz $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(cwz $$0, cvn $$1) {
      if ($$1 == cvn.b || $$1 == cvn.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(czk $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cxz.j($$0)) {
         gkm $$3 = this.a.L();
         cxz.a($$0, $$2);
         $$3.b(new aid($$1, $$2));
      }
   }

   public void a(czk $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
