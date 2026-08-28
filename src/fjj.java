import org.joml.Vector2i;

public class fjj implements fjp {
   private final fib a;
   private final fil b;

   public fjj(fib $$0) {
      this.a = $$0;
      this.b = new fil();
   }

   @Override
   public boolean a(csn $$0) {
      return $$0.g().a(cvo.qV);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cvl $$3) {
      Vector2i $$4 = this.b.a($$0, $$1);
      int $$5 = $$4.y == 0 ? -$$4.x : $$4.y;
      int $$6 = cts.j($$3);
      if ($$5 != 0 && $$6 != 0) {
         int $$7 = cts.h($$3);
         $$7 = fil.a((double)$$5, $$7, $$6);
         this.a($$3, $$2, $$7);
      }

      return true;
   }

   @Override
   public void b(csn $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public boolean a(cvl $$0, int $$1, int $$2, int $$3) {
      for (int $$4 = 0; $$4 < this.a.n.S.length; $$4++) {
         if (this.a.n.S[$$4].a($$2, $$3)) {
            this.a($$0, $$1, $$4);
            return true;
         }
      }

      return false;
   }

   private void a(cvl $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cts.j($$0)) {
         gay $$3 = this.a.L();
         cts.a($$0, $$2);
         $$3.b(new aic($$1, $$2));
      }
   }

   public void a(cvl $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
