import com.mojang.serialization.MapCodec;

public abstract class dgx extends die {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final fah h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final fah b = fae.a(
      fae.b(), fae.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), ezr.e
   );
   protected final kn.a c;

   @Override
   protected abstract MapCodec<? extends dgx> a();

   public dgx(dvi.d $$0, kn.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dvj $$0) {
      return 0.0;
   }

   protected boolean a(dvj $$0, jh $$1, bue $$2) {
      return $$2.dE() < (double)$$1.v() + this.b($$0) && $$2.cS().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      kn $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2) {
      return h;
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   public abstract boolean d(dvj var1);

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      jh $$4 = dnv.a((dfb)$$1, $$2);
      if ($$4 != null) {
         erj $$5 = dnv.a($$1, $$4);
         if ($$5 != erl.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(erj $$0) {
      return false;
   }

   protected void a(dvj $$0, dfb $$1, jh $$2, erj $$3) {
   }
}
