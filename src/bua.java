import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class bua extends buc {
   private final float c;
   private final ToIntFunction<azh> d;

   protected bua(bud $$0, int $$1, float $$2, ToIntFunction<azh> $$3) {
      super($$0, $$1, lt.G);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(ard $$0, bvy $$1, int $$2, btp $$3, float $$4) {
      if ($$1.dX().i() <= this.c) {
         int $$5 = this.d.applyAsInt($$1.dX());

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            this.a($$0, $$1, $$1.dz(), $$1.dB() + (double)$$1.dq() / 2.0, $$1.dF());
         }
      }
   }

   private void a(ard $$0, bvy $$1, double $$2, double $$3, double $$4) {
      cmz $$5 = bvi.bd.a($$0, bvh.k);
      if ($$5 != null) {
         azh $$6 = $$1.dX();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = ayz.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bS().k().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.C_().i() * 360.0F, 0.0F);
         $$5.i(new fbx($$9));
         $$0.b($$5);
         $$5.a(awa.xJ);
      }
   }
}
