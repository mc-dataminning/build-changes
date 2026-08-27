import com.mojang.serialization.Codec;

public class dni extends dnw<dqh> {
   public dni(Codec<dqh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqh> $$0) {
      cqp $$1 = $$0.b();
      gw $$2 = $$0.e();
      asc $$3 = $$0.d();
      if ($$1.t($$2) && $$1.a_($$2.d()).a(csw.fz)) {
         ctz.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
