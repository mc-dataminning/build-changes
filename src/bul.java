import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class bul extends bun {
   private final float c;
   private final ToIntFunction<bam> d;

   protected bul(buo $$0, int $$1, float $$2, ToIntFunction<bam> $$3) {
      super($$0, $$1, ls.G);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(ash $$0, bwg $$1, int $$2, bua $$3, float $$4) {
      if ($$1.dZ().i() <= this.c) {
         int $$5 = this.d.applyAsInt($$1.dZ());

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            this.a($$0, $$1, $$1.dB(), $$1.dD() + (double)$$1.ds() / 2.0, $$1.dH());
         }
      }
   }

   private void a(ash $$0, bwg $$1, double $$2, double $$3, double $$4) {
      cne $$5 = bvr.be.a($$0, bvq.k);
      if ($$5 != null) {
         bam $$6 = $$1.dZ();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = bae.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bT().k().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.H_().i() * 360.0F, 0.0F);
         $$5.h(new fby($$9));
         $$0.b($$5);
         $$5.a(axf.xt);
      }
   }
}
