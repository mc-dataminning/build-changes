import org.joml.Vector2i;

public class ftt implements ftz {
   private final frd a;
   private final frm b;

   public ftt(frd $$0) {
      this.a = $$0;
      this.b = new frm();
   }

   @Override
   public boolean a(cxn $$0) {
      return $$0.g().a(axm.bR);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, czy $$3) {
      int $$4 = cyn.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cyn.h($$3);
            int $$8 = frm.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(cxn $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(cxn $$0, cwb $$1) {
      if ($$1 == cwb.b || $$1 == cwb.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(czy $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cyn.j($$0)) {
         gmc $$3 = this.a.L();
         cyn.a($$0, $$2);
         $$3.b(new aif($$1, $$2));
      }
   }

   public void a(czy $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
