import com.mojang.serialization.Codec;

public class edb extends edq<egb> {
   public edb(Codec<egb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<egb> $$0) {
      dfd $$1 = $$0.b();
      je $$2 = $$0.e();
      azl $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.e()).a(dhl.fz)) {
         dio.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
