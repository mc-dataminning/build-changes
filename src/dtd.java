import com.mojang.serialization.Codec;

public class dtd extends drn<dty> {
   public dtd(Codec<dty> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drp<dty> $$0) {
      cud $$1 = $$0.b();
      hx $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (ic $$3 : ic.values()) {
            if ($$3 != ic.a && dfd.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, cwl.ff.o().a(dfd.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
