import com.mojang.serialization.Codec;

public class eax extends ebl<edw> {
   public eax(Codec<edw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<edw> $$0) {
      ddc $$1 = $$0.b();
      ja $$2 = $$0.e();
      ayo $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.d()).a(dfk.fz)) {
         dgn.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
