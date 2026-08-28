import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class brk extends brm {
   private final float a;
   private final ToIntFunction<ayo> b;

   protected brk(brn $$0, int $$1, float $$2, ToIntFunction<ayo> $$3) {
      super($$0, $$1, lj.G);
      this.a = $$2;
      this.b = $$3;
   }

   @Override
   public void a(btb $$0, int $$1, bqz $$2, float $$3) {
      if ($$0.dT().i() <= this.a) {
         int $$4 = this.b.applyAsInt($$0.dT());

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.a($$0.dQ(), $$0, $$0.dv(), $$0.dx() + (double)$$0.dl() / 2.0, $$0.dB());
         }
      }
   }

   private void a(dcf $$0, btb $$1, double $$2, double $$3, double $$4) {
      cjx $$5 = bsm.aM.a($$0);
      if ($$5 != null) {
         ayo $$6 = $$1.dT();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = ayg.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bM().j().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.E_().i() * 360.0F, 0.0F);
         $$5.i(new ewf($$9));
         $$0.b($$5);
         $$5.a(avh.wZ);
      }
   }
}
