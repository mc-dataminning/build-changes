import com.mojang.serialization.Codec;

public class eie extends eit<ele> {
   public eie(Codec<ele> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<ele> $$0) {
      djo $$1 = $$0.b();
      iu $$2 = $$0.e();
      azt $$3 = $$0.d();
      if ($$1.v($$2) && $$1.a_($$2.e()).a(dlw.fU)) {
         dmz.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
