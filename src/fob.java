import org.joml.Vector2i;

public class fob implements foh {
   private final flk a;
   private final flt b;

   public fob(flk $$0) {
      this.a = $$0;
      this.b = new flt();
   }

   @Override
   public boolean a(cua $$0) {
      return $$0.g().a(awy.bQ);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cwq $$3) {
      int $$4 = cvd.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cvd.h($$3);
            int $$8 = flt.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(cua $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(cua $$0, cso $$1) {
      if ($$1 == cso.b || $$1 == cso.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(cwq $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cvd.j($$0)) {
         ggb $$3 = this.a.L();
         cvd.a($$0, $$2);
         $$3.b(new ahu($$1, $$2));
      }
   }

   public void a(cwq $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
