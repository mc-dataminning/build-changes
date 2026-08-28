import org.joml.Vector2i;

public class fnz implements fof {
   private final fli a;
   private final flr b;

   public fnz(fli $$0) {
      this.a = $$0;
      this.b = new flr();
   }

   @Override
   public boolean a(cty $$0) {
      return $$0.g().a(awy.bQ);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cwo $$3) {
      int $$4 = cvb.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cvb.h($$3);
            int $$8 = flr.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(cty $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(cty $$0, csm $$1) {
      if ($$1 == csm.b || $$1 == csm.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(cwo $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cvb.j($$0)) {
         gfz $$3 = this.a.L();
         cvb.a($$0, $$2);
         $$3.b(new ahu($$1, $$2));
      }
   }

   public void a(cwo $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
