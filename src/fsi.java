import org.joml.Vector2i;

public class fsi implements fso {
   private final fpt a;
   private final fqc b;

   public fsi(fpt $$0) {
      this.a = $$0;
      this.b = new fqc();
   }

   @Override
   public boolean a(cxc $$0) {
      return $$0.g().a(axk.bR);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, czn $$3) {
      int $$4 = cyc.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cyc.h($$3);
            int $$8 = fqc.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(cxc $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(cxc $$0, cvq $$1) {
      if ($$1 == cvq.b || $$1 == cvq.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(czn $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cyc.j($$0)) {
         gkr $$3 = this.a.L();
         cyc.a($$0, $$2);
         $$3.b(new aid($$1, $$2));
      }
   }

   public void a(czn $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
