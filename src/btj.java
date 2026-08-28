import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class btj extends btl {
   private final float c;
   private final ToIntFunction<azv> d;

   protected btj(btm $$0, int $$1, float $$2, ToIntFunction<azv> $$3) {
      super($$0, $$1, ls.G);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(bve $$0, int $$1, bsy $$2, float $$3) {
      if ($$0.eb().i() <= this.c) {
         int $$4 = this.d.applyAsInt($$0.eb());

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.a($$0.dY(), $$0, $$0.dD(), $$0.dF() + (double)$$0.du() / 2.0, $$0.dJ());
         }
      }
   }

   private void a(dff $$0, bve $$1, double $$2, double $$3, double $$4) {
      cmc $$5 = bup.aM.a($$0, buo.k);
      if ($$5 != null) {
         azv $$6 = $$1.eb();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = azn.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bV().k().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.E_().i() * 360.0F, 0.0F);
         $$5.h(new ezr($$9));
         $$0.b($$5);
         $$5.a(awo.wY);
      }
   }
}
