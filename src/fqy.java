import org.joml.Vector2i;

public class fqy implements fre {
   private final fof a;
   private final foo b;

   public fqy(fof $$0) {
      this.a = $$0;
      this.b = new foo();
   }

   @Override
   public boolean a(cwh $$0) {
      return $$0.g().a(axi.bQ);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cys $$3) {
      int $$4 = cxh.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cxh.h($$3);
            int $$8 = foo.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(cwh $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(cwh $$0, cuv $$1) {
      if ($$1 == cuv.b || $$1 == cuv.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(cys $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cxh.j($$0)) {
         gje $$3 = this.a.L();
         cxh.a($$0, $$2);
         $$3.b(new aib($$1, $$2));
      }
   }

   public void a(cys $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
