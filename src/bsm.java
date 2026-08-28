import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class bsm extends bso {
   private final float c;
   private final ToIntFunction<azk> d;

   protected bsm(bsp $$0, int $$1, float $$2, ToIntFunction<azk> $$3) {
      super($$0, $$1, ln.G);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(buf $$0, int $$1, bsb $$2, float $$3) {
      if ($$0.dV().i() <= this.c) {
         int $$4 = this.d.applyAsInt($$0.dV());

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.a($$0.dS(), $$0, $$0.dx(), $$0.dz() + (double)$$0.do() / 2.0, $$0.dD());
         }
      }
   }

   private void a(dds $$0, buf $$1, double $$2, double $$3, double $$4) {
      clc $$5 = btq.aM.a($$0, btp.k);
      if ($$5 != null) {
         azk $$6 = $$1.dV();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = azc.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bQ().k().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.C_().i() * 360.0F, 0.0F);
         $$5.h(new eye($$9));
         $$0.b($$5);
         $$5.a(awd.xa);
      }
   }
}
