import com.mojang.serialization.Codec;

public class ega extends egp<eja> {
   public ega(Codec<eja> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<eja> $$0) {
      dhx $$1 = $$0.b();
      jh $$2 = $$0.e();
      bac $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.e()).a(dkf.fU)) {
         dli.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
