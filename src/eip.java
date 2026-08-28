import com.mojang.serialization.Codec;

public class eip extends eje<elp> {
   public eip(Codec<elp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<elp> $$0) {
      dju $$1 = $$0.b();
      iu $$2 = $$0.e();
      azv $$3 = $$0.d();
      if ($$1.v($$2) && $$1.a_($$2.e()).a(dmc.fV)) {
         dnf.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
