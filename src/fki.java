import org.joml.Vector2i;

public class fki implements fko {
   private final fja a;
   private final fjk b;

   public fki(fja $$0) {
      this.a = $$0;
      this.b = new fjk();
   }

   @Override
   public boolean a(ctg $$0) {
      return $$0.g().a(cwb.qV);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cvx $$3) {
      Vector2i $$4 = this.b.a($$0, $$1);
      int $$5 = $$4.y == 0 ? -$$4.x : $$4.y;
      int $$6 = cuj.i($$3);
      if ($$5 != 0 && $$6 != 0) {
         int $$7 = cuj.g($$3);
         $$7 = fjk.a((double)$$5, $$7, $$6);
         this.a($$3, $$2, $$7);
      }

      return true;
   }

   @Override
   public void b(ctg $$0) {
      this.a($$0.g(), $$0.d);
   }

   private void a(cvx $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cuj.i($$0)) {
         gby $$3 = this.a.L();
         cuj.a($$0, $$2);
         $$3.b(new aig($$1, $$2));
      }
   }

   public void a(cvx $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
