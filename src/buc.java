import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class buc extends bue {
   private final float c;
   private final ToIntFunction<bac> d;

   protected buc(buf $$0, int $$1, float $$2, ToIntFunction<bac> $$3) {
      super($$0, $$1, ls.G);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(arx $$0, bvx $$1, int $$2, btr $$3, float $$4) {
      if ($$1.dZ().i() <= this.c) {
         int $$5 = this.d.applyAsInt($$1.dZ());

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            this.a($$0, $$1, $$1.dB(), $$1.dD() + (double)$$1.ds() / 2.0, $$1.dH());
         }
      }
   }

   private void a(arx $$0, bvx $$1, double $$2, double $$3, double $$4) {
      cmv $$5 = bvi.be.a($$0, bvh.k);
      if ($$5 != null) {
         bac $$6 = $$1.dZ();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = azu.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bT().k().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.H_().i() * 360.0F, 0.0F);
         $$5.h(new fbr($$9));
         $$0.b($$5);
         $$5.a(awv.xz);
      }
   }
}
