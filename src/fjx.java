import org.joml.Vector2i;

public class fjx implements fkd {
   private final fip a;
   private final fiz b;

   public fjx(fip $$0) {
      this.a = $$0;
      this.b = new fiz();
   }

   @Override
   public boolean a(csw $$0) {
      return $$0.g().a(cvw.qV);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cvs $$3) {
      Vector2i $$4 = this.b.a($$0, $$1);
      int $$5 = $$4.y == 0 ? -$$4.x : $$4.y;
      int $$6 = cub.i($$3);
      if ($$5 != 0 && $$6 != 0) {
         int $$7 = cub.g($$3);
         $$7 = fiz.a((double)$$5, $$7, $$6);
         this.a($$3, $$2, $$7);
      }

      return true;
   }

   @Override
   public void b(csw $$0) {
      this.a($$0.g(), $$0.d);
   }

   private void a(cvs $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cub.i($$0)) {
         gbn $$3 = this.a.L();
         cub.a($$0, $$2);
         $$3.b(new aid($$1, $$2));
      }
   }

   public void a(cvs $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
