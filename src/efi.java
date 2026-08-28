import com.mojang.serialization.Codec;

public class efi extends efx<eii> {
   public efi(Codec<eii> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efz<eii> $$0) {
      dhf $$1 = $$0.b();
      ji $$2 = $$0.e();
      azh $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.e()).a(djn.fU)) {
         dkq.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
