import com.mojang.serialization.Codec;

public class eai extends eaw<edh> {
   public eai(Codec<edh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eay<edh> $$0) {
      dcr $$1 = $$0.b();
      iz $$2 = $$0.e();
      azf $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.d()).a(dez.fz)) {
         dgc.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
