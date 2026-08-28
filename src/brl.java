import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class brl extends brn {
   private final float c;
   private final ToIntFunction<ayo> d;

   protected brl(bro $$0, int $$1, float $$2, ToIntFunction<ayo> $$3) {
      super($$0, $$1, lj.G);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(btc $$0, int $$1, bra $$2, float $$3) {
      if ($$0.dU().i() <= this.c) {
         int $$4 = this.d.applyAsInt($$0.dU());

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.a($$0.dR(), $$0, $$0.dw(), $$0.dy() + (double)$$0.dm() / 2.0, $$0.dC());
         }
      }
   }

   private void a(dcg $$0, btc $$1, double $$2, double $$3, double $$4) {
      cjy $$5 = bsn.aM.a($$0);
      if ($$5 != null) {
         ayo $$6 = $$1.dU();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = ayg.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bN().j().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.E_().i() * 360.0F, 0.0F);
         $$5.j(new ewh($$9));
         $$0.b($$5);
         $$5.a(avh.wZ);
      }
   }
}
