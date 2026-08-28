import org.joml.Vector2i;

public class flm implements fls {
   private final fke a;
   private final fko b;

   public flm(fke $$0) {
      this.a = $$0;
      this.b = new fko();
   }

   @Override
   public boolean a(ctw $$0) {
      return $$0.g().a(axl.bS);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cwm $$3) {
      int $$4 = cuz.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cuz.h($$3);
            $$7 = fko.a((double)$$6, $$7, $$4);
            this.a($$3, $$2, $$7);
         }

         return true;
      }
   }

   @Override
   public void b(ctw $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(ctw $$0, csk $$1) {
      if ($$1 == csk.b) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(cwm $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cuz.j($$0)) {
         gdi $$3 = this.a.L();
         cuz.a($$0, $$2);
         $$3.b(new aii($$1, $$2));
      }
   }

   public void a(cwm $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
