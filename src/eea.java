import com.mojang.serialization.Codec;

public class eea extends eep<eha> {
   public eea(Codec<eha> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eer<eha> $$0) {
      dgd $$1 = $$0.b();
      jh $$2 = $$0.e();
      azv $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.e()).a(dil.fz)) {
         djo.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
