import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class brw extends bry {
   private final float a;
   private final ToIntFunction<azf> b;

   protected brw(brz $$0, int $$1, float $$2, ToIntFunction<azf> $$3) {
      super($$0, $$1, li.G);
      this.a = $$2;
      this.b = $$3;
   }

   @Override
   public void a(btn $$0, int $$1, brl $$2, float $$3) {
      if ($$0.el().i() <= this.a) {
         int $$4 = this.b.applyAsInt($$0.el());

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.a($$0.dP(), $$0, $$0.du(), $$0.dw() + (double)$$0.dk() / 2.0, $$0.dA());
         }
      }
   }

   private void a(dbw $$0, btn $$1, double $$2, double $$3, double $$4) {
      cki $$5 = bsy.aM.a($$0);
      if ($$5 != null) {
         azf $$6 = $$1.el();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = ayx.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bL().j().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.E_().i() * 360.0F, 0.0F);
         $$5.h(new evp($$9));
         $$0.b($$5);
         $$5.a(avz.wW);
      }
   }
}
