import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class brh extends brj {
   private final float a;
   private final ToIntFunction<aym> b;

   protected brh(brk $$0, int $$1, float $$2, ToIntFunction<aym> $$3) {
      super($$0, $$1, lj.G);
      this.a = $$2;
      this.b = $$3;
   }

   @Override
   public void a(bsy $$0, int $$1, bqw $$2, float $$3) {
      if ($$0.dS().i() <= this.a) {
         int $$4 = this.b.applyAsInt($$0.dS());

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.a($$0.dP(), $$0, $$0.du(), $$0.dw() + (double)$$0.dk() / 2.0, $$0.dA());
         }
      }
   }

   private void a(dcd $$0, bsy $$1, double $$2, double $$3, double $$4) {
      cju $$5 = bsj.aM.a($$0);
      if ($$5 != null) {
         aym $$6 = $$1.dS();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = aye.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bL().j().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.E_().i() * 360.0F, 0.0F);
         $$5.h(new evz($$9));
         $$0.b($$5);
         $$5.a(avf.wZ);
      }
   }
}
