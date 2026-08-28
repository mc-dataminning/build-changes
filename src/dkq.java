import com.mojang.serialization.MapCodec;

public class dkq extends dkg implements dfz {
   public static final MapCodec<dkq> a = b(dkq::new);

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   public dkq(dsz.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      $$0.a($$2.d(), dkr.c(), 2);
   }

   @Override
   public jd a(jd $$0) {
      return $$0.d();
   }
}
