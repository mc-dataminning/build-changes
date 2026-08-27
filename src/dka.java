import com.mojang.serialization.Codec;

public class dka extends dko<dmz> {
   public dka(Codec<dmz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dmz> $$0) {
      cng $$1 = $$0.b();
      gu $$2 = $$0.e();
      apf $$3 = $$0.d();
      if ($$1.t($$2) && $$1.a_($$2.d()).a(cpo.fz)) {
         cqr.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
