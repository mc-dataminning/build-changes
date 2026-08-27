import com.mojang.serialization.Codec;

public class dph extends dpv<dsg> {
   public dph(Codec<dsg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpx<dsg> $$0) {
      csu $$1 = $$0.b();
      ht $$2 = $$0.e();
      ats $$3 = $$0.d();
      if ($$1.t($$2) && $$1.a_($$2.d()).a(cvc.fz)) {
         cwf.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
