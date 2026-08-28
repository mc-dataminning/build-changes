import com.mojang.serialization.Codec;

public class eix extends ejm<elx> {
   public eix(Codec<elx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<elx> $$0) {
      djz $$1 = $$0.b();
      iu $$2 = $$0.e();
      azv $$3 = $$0.d();
      if ($$1.v($$2) && $$1.a_($$2.e()).a(dmh.fY)) {
         dnl.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
