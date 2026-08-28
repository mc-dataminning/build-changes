import com.mojang.serialization.Codec;

public class edq extends eca<eel> {
   public edq(Codec<eel> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eel> $$0) {
      ddq $$1 = $$0.b();
      jd $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (ji $$3 : ji.values()) {
            if ($$3 != ji.a && dot.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dfy.ff.o().a(dot.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
