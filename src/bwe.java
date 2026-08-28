import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class bwe extends bwg {
   private final float c;
   private final ToIntFunction<bai> d;

   protected bwe(bwh $$0, int $$1, float $$2, ToIntFunction<bai> $$3) {
      super($$0, $$1, lz.G);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(asb $$0, byf $$1, int $$2, bvt $$3, float $$4) {
      if ($$1.dY().i() <= this.c) {
         int $$5 = this.d.applyAsInt($$1.dY());

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            this.a($$0, $$1, $$1.dA(), $$1.dC() + (double)$$1.dr() / 2.0, $$1.dG());
         }
      }
   }

   private void a(asb $$0, byf $$1, double $$2, double $$3, double $$4) {
      cpr $$5 = bxn.bf.a($$0, bxm.k);
      if ($$5 != null) {
         bai $$6 = $$1.dY();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = azz.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bS().k().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.G_().i() * 360.0F, 0.0F);
         $$5.i(new fgc($$9));
         $$0.b($$5);
         $$5.a(awy.xP);
      }
   }
}
