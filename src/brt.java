import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class brt extends brv {
   private final float a;
   private final ToIntFunction<azc> b;

   protected brt(brw $$0, int $$1, float $$2, ToIntFunction<azc> $$3) {
      super($$0, $$1, lj.G);
      this.a = $$2;
      this.b = $$3;
   }

   @Override
   public void a(btk $$0, int $$1, bri $$2, float $$3) {
      if ($$0.el().i() <= this.a) {
         int $$4 = this.b.applyAsInt($$0.el());

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.a($$0.dP(), $$0, $$0.du(), $$0.dw() + (double)$$0.dk() / 2.0, $$0.dA());
         }
      }
   }

   private void a(dbt $$0, btk $$1, double $$2, double $$3, double $$4) {
      ckf $$5 = bsv.aM.a($$0);
      if ($$5 != null) {
         azc $$6 = $$1.el();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = ayu.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bL().j().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.E_().i() * 360.0F, 0.0F);
         $$5.h(new evm($$9));
         $$0.b($$5);
         $$5.a(avw.wW);
      }
   }
}
