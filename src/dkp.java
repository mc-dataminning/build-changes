import com.mojang.serialization.MapCodec;

public class dkp extends dfw {
   public static final MapCodec<dkp> a = b(dkp::new);
   private static final int b = 20;

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   public dkp(dsz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, bsq $$3) {
      if (!$$3.bX() && $$3 instanceof btl) {
         $$3.a($$0.aj().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
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
}
