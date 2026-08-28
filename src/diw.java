import com.mojang.serialization.MapCodec;

public abstract class diw extends dkd {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final fcl h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final fcl b = fci.a(
      fci.b(), fci.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), fbv.e
   );
   protected final kn.a c;

   @Override
   protected abstract MapCodec<? extends diw> a();

   public diw(dxn.d $$0, kn.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dxo $$0) {
      return 0.0;
   }

   protected boolean a(dxo $$0, jh $$1, bvb $$2) {
      return $$2.dD() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      kn $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2) {
      return h;
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   public abstract boolean d(dxo var1);

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      jh $$4 = dpz.a((dgz)$$1, $$2);
      if ($$4 != null) {
         etp $$5 = dpz.a($$1, $$4);
         if ($$5 != etr.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(etp $$0) {
      return false;
   }

   protected void a(dxo $$0, dgz $$1, jh $$2, etp $$3) {
   }
}
