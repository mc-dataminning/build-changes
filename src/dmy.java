import com.mojang.serialization.Codec;

public class dmy extends dnm<dpx> {
   public dmy(Codec<dpx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dno<dpx> $$0) {
      cqf $$1 = $$0.b();
      gu $$2 = $$0.e();
      aru $$3 = $$0.d();
      if ($$1.t($$2) && $$1.a_($$2.d()).a(csm.fz)) {
         ctp.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
