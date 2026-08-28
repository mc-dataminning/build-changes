import org.joml.Vector2i;

public class fjt implements fjz {
   private final fil a;
   private final fiv b;

   public fjt(fil $$0) {
      this.a = $$0;
      this.b = new fiv();
   }

   @Override
   public boolean a(cst $$0) {
      return $$0.g().a(cvt.qV);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cvp $$3) {
      Vector2i $$4 = this.b.a($$0, $$1);
      int $$5 = $$4.y == 0 ? -$$4.x : $$4.y;
      int $$6 = cty.i($$3);
      if ($$5 != 0 && $$6 != 0) {
         int $$7 = cty.g($$3);
         $$7 = fiv.a((double)$$5, $$7, $$6);
         this.a($$3, $$2, $$7);
      }

      return true;
   }

   @Override
   public void b(cst $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public boolean a(cvp $$0, int $$1, int $$2, int $$3) {
      for (int $$4 = 0; $$4 < this.a.n.S.length; $$4++) {
         if (this.a.n.S[$$4].a($$2, $$3)) {
            this.a($$0, $$1, $$4);
            return true;
         }
      }

      return false;
   }

   private void a(cvp $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cty.i($$0)) {
         gbi $$3 = this.a.L();
         cty.a($$0, $$2);
         $$3.b(new aic($$1, $$2));
      }
   }

   public void a(cvp $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
