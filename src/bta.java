import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class bta extends btc {
   private final float c;
   private final ToIntFunction<azr> d;

   protected bta(btd $$0, int $$1, float $$2, ToIntFunction<azr> $$3) {
      super($$0, $$1, lq.G);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(buv $$0, int $$1, bsp $$2, float $$3) {
      if ($$0.ea().i() <= this.c) {
         int $$4 = this.d.applyAsInt($$0.ea());

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.a($$0.dX(), $$0, $$0.dC(), $$0.dE() + (double)$$0.dt() / 2.0, $$0.dI());
         }
      }
   }

   private void a(dev $$0, buv $$1, double $$2, double $$3, double $$4) {
      clt $$5 = bug.aM.a($$0, buf.k);
      if ($$5 != null) {
         azr $$6 = $$1.ea();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = azj.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bU().k().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.E_().i() * 360.0F, 0.0F);
         $$5.h(new ezh($$9));
         $$0.b($$5);
         $$5.a(awk.wY);
      }
   }
}
