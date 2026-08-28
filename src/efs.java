import com.mojang.serialization.Codec;

public class efs extends eel<ehh> {
   public efs(Codec<ehh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(een<ehh> $$0) {
      ehh $$1 = $$0.f();
      dfy $$2 = $$0.b();
      jh $$3 = $$0.e();
      dvj $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dkm) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dkm.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
