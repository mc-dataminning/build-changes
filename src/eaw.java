import com.mojang.serialization.Codec;

public class eaw extends ebk<edv> {
   public eaw(Codec<edv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebm<edv> $$0) {
      ddb $$1 = $$0.b();
      ja $$2 = $$0.e();
      ayo $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.d()).a(dfj.fz)) {
         dgm.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
