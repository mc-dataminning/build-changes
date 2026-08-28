import com.mojang.serialization.Codec;

public class eak extends eay<edj> {
   public eak(Codec<edj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eba<edj> $$0) {
      dct $$1 = $$0.b();
      iz $$2 = $$0.e();
      azh $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.d()).a(dfb.fz)) {
         dge.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
