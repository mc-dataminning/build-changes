import com.mojang.serialization.Codec;

public class efh extends efw<eih> {
   public efh(Codec<eih> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<eih> $$0) {
      dhe $$1 = $$0.b();
      ji $$2 = $$0.e();
      azg $$3 = $$0.d();
      if ($$1.u($$2) && $$1.a_($$2.e()).a(djm.fU)) {
         dkp.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
