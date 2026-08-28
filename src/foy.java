import org.joml.Vector2i;

public class foy implements fpe {
   private final fmg a;
   private final fmp b;

   public foy(fmg $$0) {
      this.a = $$0;
      this.b = new fmp();
   }

   @Override
   public boolean a(cut $$0) {
      return $$0.g().a(awy.bQ);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cxh $$3) {
      int $$4 = cvv.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cvv.h($$3);
            int $$8 = fmp.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(cut $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(cut $$0, cth $$1) {
      if ($$1 == cth.b || $$1 == cth.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(cxh $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cvv.j($$0)) {
         ggz $$3 = this.a.L();
         cvv.a($$0, $$2);
         $$3.b(new aht($$1, $$2));
      }
   }

   public void a(cxh $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
