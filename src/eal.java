import com.mojang.serialization.Codec;

public class eal extends eaz<edk> {
   public eal(Codec<edk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebb<edk> $$0) {
      dcu $$1 = $$0.b();
      iz $$2 = $$0.e();
      azh $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.d()).a(dfc.fz)) {
         dgf.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
