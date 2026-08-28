import com.mojang.serialization.MapCodec;

public class dku extends dfw implements dfz {
   public static final MapCodec<dku> a = b(dku::new);

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   public dku(dsz.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      $$0.H_().c(lu.aI).flatMap($$0x -> $$0x.b(ro.n)).ifPresent($$3x -> ((ebn)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public dfz.a aq_() {
      return dfz.a.a;
   }
}
