import com.mojang.serialization.MapCodec;

public abstract class dje extends dkl {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final fcr h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final fcr b = fco.a(
      fco.b(), fco.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), fcb.e
   );
   protected final kn.a c;

   @Override
   protected abstract MapCodec<? extends dje> a();

   public dje(dxt.d $$0, kn.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dxu $$0) {
      return 0.0;
   }

   protected boolean a(dxu $$0, jh $$1, bvj $$2) {
      return $$2.dD() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      kn $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2) {
      return h;
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   public abstract boolean d(dxu var1);

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      jh $$4 = dqf.a((dhh)$$1, $$2);
      if ($$4 != null) {
         etv $$5 = dqf.a($$1, $$4);
         if ($$5 != etx.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(etv $$0) {
      return false;
   }

   protected void a(dxu $$0, dhh $$1, jh $$2, etv $$3) {
   }
}
