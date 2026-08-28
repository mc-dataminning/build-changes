import org.joml.Vector2i;

public class fno implements fnu {
   private final fmg a;
   private final fmp b;

   public fno(fmg $$0) {
      this.a = $$0;
      this.b = new fmp();
   }

   @Override
   public boolean a(cuz $$0) {
      return $$0.g().a(ayd.bT);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cxp $$3) {
      int $$4 = cwc.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cwc.h($$3);
            int $$8 = fmp.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(cuz $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(cuz $$0, ctn $$1) {
      if ($$1 == ctn.b || $$1 == ctn.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(cxp $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cwc.j($$0)) {
         gfl $$3 = this.a.L();
         cwc.a($$0, $$2);
         $$3.b(new aiy($$1, $$2));
      }
   }

   public void a(cxp $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
