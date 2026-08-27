import com.mojang.serialization.Codec;

public class dtl extends dtz<dwk> {
   public dtl(Codec<dwk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dwk> $$0) {
      cwm $$1 = $$0.b();
      hz $$2 = $$0.e();
      awp $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.d()).a(cyu.fz)) {
         czx.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
