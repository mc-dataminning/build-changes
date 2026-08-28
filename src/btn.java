import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class btn extends btp {
   private final float c;
   private final ToIntFunction<azh> d;

   protected btn(btq $$0, int $$1, float $$2, ToIntFunction<azh> $$3) {
      super($$0, $$1, lt.G);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(ard $$0, bvi $$1, int $$2, btc $$3, float $$4) {
      if ($$1.dY().i() <= this.c) {
         int $$5 = this.d.applyAsInt($$1.dY());

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            this.a($$0, $$1, $$1.dA(), $$1.dC() + (double)$$1.dr() / 2.0, $$1.dG());
         }
      }
   }

   private void a(ard $$0, bvi $$1, double $$2, double $$3, double $$4) {
      cmg $$5 = but.bd.a($$0, bus.k);
      if ($$5 != null) {
         azh $$6 = $$1.dY();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = ayz.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bT().k().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.H_().i() * 360.0F, 0.0F);
         $$5.i(new fbb($$9));
         $$0.b($$5);
         $$5.a(awa.xz);
      }
   }
}
