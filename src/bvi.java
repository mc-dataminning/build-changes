import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class bvi extends bvk {
   private final float c;
   private final ToIntFunction<azv> d;

   protected bvi(bvl $$0, int $$1, float $$2, ToIntFunction<azv> $$3) {
      super($$0, $$1, ly.G);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(arq $$0, bxj $$1, int $$2, bux $$3, float $$4) {
      if ($$1.dX().i() <= this.c) {
         int $$5 = this.d.applyAsInt($$1.dX());

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            this.a($$0, $$1, $$1.dz(), $$1.dB() + (double)$$1.dq() / 2.0, $$1.dF());
         }
      }
   }

   private void a(arq $$0, bxj $$1, double $$2, double $$3, double $$4) {
      cov $$5 = bwr.be.a($$0, bwq.k);
      if ($$5 != null) {
         azv $$6 = $$1.dX();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = azm.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bR().k().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.C_().i() * 360.0F, 0.0F);
         $$5.i(new ffc($$9));
         $$0.b($$5);
         $$5.a(awn.xP);
      }
   }
}
