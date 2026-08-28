import org.joml.Vector2i;

public class fkq implements fkw {
   private final fji a;
   private final fjs b;

   public fkq(fji $$0) {
      this.a = $$0;
      this.b = new fjs();
   }

   @Override
   public boolean a(ctl $$0) {
      return $$0.g().a(cwf.qV);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cwb $$3) {
      int $$4 = cuo.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cuo.h($$3);
            $$7 = fjs.a((double)$$6, $$7, $$4);
            this.a($$3, $$2, $$7);
         }

         return true;
      }
   }

   @Override
   public void b(ctl $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(ctl $$0, crz $$1) {
      if ($$1 == crz.b) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(cwb $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cuo.j($$0)) {
         gcj $$3 = this.a.L();
         cuo.a($$0, $$2);
         $$3.b(new aih($$1, $$2));
      }
   }

   public void a(cwb $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
