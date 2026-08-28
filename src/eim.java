import com.mojang.serialization.Codec;

public class eim extends egw<ejh> {
   public eim(Codec<ejh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egy<ejh> $$0) {
      dig $$1 = $$0.b();
      jh $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jm $$3 : jm.values()) {
            if ($$3 != jm.a && dtl.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dko.ft.m().b(dtl.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
