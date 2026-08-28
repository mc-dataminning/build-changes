import com.mojang.serialization.Codec;

public class eam extends eba<edl> {
   public eam(Codec<edl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebc<edl> $$0) {
      dcv $$1 = $$0.b();
      iz $$2 = $$0.e();
      azh $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.d()).a(dfd.fz)) {
         dgg.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
