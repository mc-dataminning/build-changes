import com.mojang.serialization.MapCodec;

public class dia extends dfw {
   public static final MapCodec<dia> a = b(dia::new);
   protected static final exp b = dit.c;

   @Override
   public MapCodec<dia> a() {
      return a;
   }

   protected dia(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dta $$0) {
      return true;
   }

   @Override
   public dta a(cyb $$0) {
      return !this.o().a((dcx)$$0.q(), $$0.a()) ? dfw.a(this.o(), dfy.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$1 == ji.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      dit.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      dta $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof div;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
