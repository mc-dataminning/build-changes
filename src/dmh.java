import com.mojang.serialization.MapCodec;

public class dmh extends dfw implements dfz {
   public static final MapCodec<dmh> a = b(dmh::new);

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   public dmh(dsz.d $$0) {
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
      $$0.b($$2.d(), dfy.sG.o());
   }

   @Override
   public jd a(jd $$0) {
      return $$0.d();
   }
}
