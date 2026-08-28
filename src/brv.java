import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class brv extends brx {
   private final float c;
   private final ToIntFunction<ayw> d;

   protected brv(bry $$0, int $$1, float $$2, ToIntFunction<ayw> $$3) {
      super($$0, $$1, lm.G);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(btn $$0, int $$1, brk $$2, float $$3) {
      if ($$0.dS().i() <= this.c) {
         int $$4 = this.d.applyAsInt($$0.dS());

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.a($$0.dP(), $$0, $$0.du(), $$0.dw() + (double)$$0.dl() / 2.0, $$0.dA());
         }
      }
   }

   private void a(dcw $$0, btn $$1, double $$2, double $$3, double $$4) {
      ckk $$5 = bsx.aM.a($$0);
      if ($$5 != null) {
         ayw $$6 = $$1.dS();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = ayo.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bM().j().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.E_().i() * 360.0F, 0.0F);
         $$5.i(new exa($$9));
         $$0.b($$5);
         $$5.a(avp.wZ);
      }
   }
}
