import org.joml.Vector2i;

public class fnx implements fod {
   private final flh a;
   private final flq b;

   public fnx(flh $$0) {
      this.a = $$0;
      this.b = new flq();
   }

   @Override
   public boolean a(ctx $$0) {
      return $$0.g().a(awx.bQ);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cwn $$3) {
      int $$4 = cva.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cva.h($$3);
            int $$8 = flq.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(ctx $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(ctx $$0, csl $$1) {
      if ($$1 == csl.b || $$1 == csl.c || $$1 == csl.a) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(cwn $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cva.j($$0)) {
         gfx $$3 = this.a.L();
         cva.a($$0, $$2);
         $$3.b(new aht($$1, $$2));
      }
   }

   public void a(cwn $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
