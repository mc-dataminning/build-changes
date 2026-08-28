import org.joml.Vector2i;

public class frr implements frx {
   private final foz a;
   private final fpi b;

   public frr(foz $$0) {
      this.a = $$0;
      this.b = new fpi();
   }

   @Override
   public boolean a(cws $$0) {
      return $$0.g().a(axk.bR);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, czd $$3) {
      int $$4 = cxs.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cxs.h($$3);
            int $$8 = fpi.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(cws $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(cws $$0, cvg $$1) {
      if ($$1 == cvg.b || $$1 == cvg.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(czd $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cxs.j($$0)) {
         gka $$3 = this.a.L();
         cxs.a($$0, $$2);
         $$3.b(new aid($$1, $$2));
      }
   }

   public void a(czd $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
