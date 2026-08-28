import com.mojang.serialization.MapCodec;

public abstract class dhc extends dij {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final fal h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final fal b = fai.a(
      fai.b(), fai.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), ezv.e
   );
   protected final kn.a c;

   @Override
   protected abstract MapCodec<? extends dhc> a();

   public dhc(dvn.d $$0, kn.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dvo $$0) {
      return 0.0;
   }

   protected boolean a(dvo $$0, jh $$1, bui $$2) {
      return $$2.dF() < (double)$$1.v() + this.b($$0) && $$2.cT().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      kn $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2) {
      return h;
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   public abstract boolean d(dvo var1);

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      jh $$4 = doa.a((dff)$$1, $$2);
      if ($$4 != null) {
         ern $$5 = doa.a($$1, $$4);
         if ($$5 != erp.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ern $$0) {
      return false;
   }

   protected void a(dvo $$0, dff $$1, jh $$2, ern $$3) {
   }
}
