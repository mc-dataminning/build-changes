import com.mojang.serialization.Codec;

public class eie extends ego<eiz> {
   public eie(Codec<eiz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egq<eiz> $$0) {
      dhy $$1 = $$0.b();
      jh $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jm $$3 : jm.values()) {
            if ($$3 != jm.a && dtd.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dkg.ft.m().b(dtd.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
