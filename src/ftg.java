import org.joml.Vector2i;

public class ftg implements ftm {
   private final fqq a;
   private final fqz b;

   public ftg(fqq $$0) {
      this.a = $$0;
      this.b = new fqz();
   }

   @Override
   public boolean a(cxz $$0) {
      return $$0.g().a(axv.bS);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, dak $$3) {
      int $$4 = cyz.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cyz.h($$3);
            int $$8 = fqz.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(cxz $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(cxz $$0, cwm $$1) {
      if ($$1 == cwm.b || $$1 == cwm.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(dak $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cyz.j($$0)) {
         glp $$3 = this.a.L();
         cyz.a($$0, $$2);
         $$3.b(new aio($$1, $$2));
      }
   }

   public void a(dak $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
