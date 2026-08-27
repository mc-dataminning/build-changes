import com.mojang.serialization.Codec;

public class dzu extends dye<eap> {
   public dzu(Codec<eap> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<eap> $$0) {
      dab $$1 = $$0.b();
      id $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (ij $$3 : ij.values()) {
            if ($$3 != ij.a && dlc.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dcj.ff.n().a(dlc.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
