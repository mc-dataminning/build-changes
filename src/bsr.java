import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class bsr extends bst {
   private final float c;
   private final ToIntFunction<azl> d;

   protected bsr(bsu $$0, int $$1, float $$2, ToIntFunction<azl> $$3) {
      super($$0, $$1, ln.G);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(buk $$0, int $$1, bsg $$2, float $$3) {
      if ($$0.dV().i() <= this.c) {
         int $$4 = this.d.applyAsInt($$0.dV());

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.a($$0.dS(), $$0, $$0.dx(), $$0.dz() + (double)$$0.do() / 2.0, $$0.dD());
         }
      }
   }

   private void a(deg $$0, buk $$1, double $$2, double $$3, double $$4) {
      clh $$5 = btv.aM.a($$0, btu.k);
      if ($$5 != null) {
         azl $$6 = $$1.dV();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = azd.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bQ().k().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.C_().i() * 360.0F, 0.0F);
         $$5.h(new eys($$9));
         $$0.b($$5);
         $$5.a(awe.xa);
      }
   }
}
