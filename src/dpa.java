import com.mojang.serialization.MapCodec;

public class dpa extends dgf {
   public static final MapCodec<dpa> a = b(dpa::new);
   protected static final exp b = dfw.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dpa> a() {
      return a;
   }

   protected dpa(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aqt && $$3 instanceof cot) {
         $$1.a(new jd($$2), true, $$3);
      }
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      eoy $$3 = $$1.b_($$2);
      eoy $$4 = $$1.b_($$2.c());
      return ($$3.a() == eoz.c || $$0.b() instanceof dju) && $$4.a() == eoz.a;
   }
}
