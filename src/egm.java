import com.mojang.serialization.Codec;

public class egm extends eew<ehh> {
   public egm(Codec<ehh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eey<ehh> $$0) {
      dgk $$1 = $$0.b();
      jh $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jm $$3 : jm.values()) {
            if ($$3 != jm.a && drm.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dis.ff.m().b(drm.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
