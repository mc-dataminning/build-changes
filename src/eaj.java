import com.mojang.serialization.Codec;

public class eaj extends eax<edi> {
   public eaj(Codec<edi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<edi> $$0) {
      dcs $$1 = $$0.b();
      iz $$2 = $$0.e();
      azg $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.d()).a(dfa.fz)) {
         dgd.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
