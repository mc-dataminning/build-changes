import com.mojang.serialization.MapCodec;

public class dnj extends dfw {
   public static final MapCodec<dnj> a = b(dnj::new);
   protected static final exp b = dfw.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dnj> a() {
      return a;
   }

   public dnj(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   protected exp b_(dta $$0, dca $$1, jd $$2) {
      return exm.b();
   }

   @Override
   protected exp c(dta $$0, dca $$1, jd $$2, exb $$3) {
      return exm.b();
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      dgc.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$1 == ji.b && $$2.a(dfy.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   @Override
   protected float d(dta $$0, dca $$1, jd $$2) {
      return 0.2F;
   }
}
