import org.joml.Vector2i;

public class frk implements frq {
   private final fos a;
   private final fpb b;

   public frk(fos $$0) {
      this.a = $$0;
      this.b = new fpb();
   }

   @Override
   public boolean a(cwn $$0) {
      return $$0.g().a(axk.bQ);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cyy $$3) {
      int $$4 = cxn.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cxn.h($$3);
            int $$8 = fpb.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(cwn $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(cwn $$0, cvb $$1) {
      if ($$1 == cvb.b || $$1 == cvb.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(cyy $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cxn.j($$0)) {
         gjs $$3 = this.a.L();
         cxn.a($$0, $$2);
         $$3.b(new aid($$1, $$2));
      }
   }

   public void a(cyy $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
