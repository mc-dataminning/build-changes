import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class bvf extends bvh {
   private final float c;
   private final ToIntFunction<azv> d;

   protected bvf(bvi $$0, int $$1, float $$2, ToIntFunction<azv> $$3) {
      super($$0, $$1, lx.G);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(arq $$0, bxe $$1, int $$2, buu $$3, float $$4) {
      if ($$1.dY().i() <= this.c) {
         int $$5 = this.d.applyAsInt($$1.dY());

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            this.a($$0, $$1, $$1.dA(), $$1.dC() + (double)$$1.dr() / 2.0, $$1.dG());
         }
      }
   }

   private void a(arq $$0, bxe $$1, double $$2, double $$3, double $$4) {
      cok $$5 = bwo.be.a($$0, bwn.k);
      if ($$5 != null) {
         azv $$6 = $$1.dY();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = azm.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bT().k().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.C_().i() * 360.0F, 0.0F);
         $$5.i(new feq($$9));
         $$0.b($$5);
         $$5.a(awn.xP);
      }
   }
}
