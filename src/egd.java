import com.mojang.serialization.Codec;

public class egd extends eew<ehs> {
   public egd(Codec<ehs> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eey<ehs> $$0) {
      ehs $$1 = $$0.f();
      dgk $$2 = $$0.b();
      jh $$3 = $$0.e();
      dvv $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dky) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dky.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
