import com.mojang.serialization.Codec;

public class egb extends eel<egw> {
   public egb(Codec<egw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(een<egw> $$0) {
      dfy $$1 = $$0.b();
      jh $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jm $$3 : jm.values()) {
            if ($$3 != jm.a && dra.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dig.ff.m().b(dra.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
