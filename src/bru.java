import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class bru extends brw {
   private final float c;
   private final ToIntFunction<ayv> d;

   protected bru(brx $$0, int $$1, float $$2, ToIntFunction<ayv> $$3) {
      super($$0, $$1, lm.G);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(btl $$0, int $$1, brj $$2, float $$3) {
      if ($$0.dT().i() <= this.c) {
         int $$4 = this.d.applyAsInt($$0.dT());

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.a($$0.dQ(), $$0, $$0.dv(), $$0.dx() + (double)$$0.dl() / 2.0, $$0.dB());
         }
      }
   }

   private void a(dcu $$0, btl $$1, double $$2, double $$3, double $$4) {
      cki $$5 = bsw.aM.a($$0);
      if ($$5 != null) {
         ayv $$6 = $$1.dT();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = ayn.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bM().j().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.E_().i() * 360.0F, 0.0F);
         $$5.i(new eww($$9));
         $$0.b($$5);
         $$5.a(avo.wZ);
      }
   }
}
