import com.mojang.serialization.Codec;

public class ebp extends ecd<eeo> {
   public ebp(Codec<eeo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecf<eeo> $$0) {
      dds $$1 = $$0.b();
      jd $$2 = $$0.e();
      ayw $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.e()).a(dga.fz)) {
         dhd.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
