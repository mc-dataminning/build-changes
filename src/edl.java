import com.mojang.serialization.Codec;

public class edl extends ece<efa> {
   public edl(Codec<efa> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecg<efa> $$0) {
      efa $$1 = $$0.f();
      dds $$2 = $$0.b();
      jd $$3 = $$0.e();
      dtc $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dig) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dig.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
