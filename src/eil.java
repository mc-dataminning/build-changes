import com.mojang.serialization.Codec;

public class eil extends egv<ejg> {
   public eil(Codec<ejg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egx<ejg> $$0) {
      dif $$1 = $$0.b();
      jh $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jm $$3 : jm.values()) {
            if ($$3 != jm.a && dtk.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dkn.ft.m().b(dtk.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
