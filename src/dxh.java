import com.mojang.serialization.Codec;

public class dxh extends dxv<eag> {
   public dxh(Codec<eag> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<eag> $$0) {
      czs $$1 = $$0.b();
      ib $$2 = $$0.e();
      axr $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.d()).a(dca.fz)) {
         ddd.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
