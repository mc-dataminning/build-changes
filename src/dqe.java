import com.mojang.serialization.Codec;

public class dqe extends doo<dqz> {
   public dqe(Codec<dqz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doq<dqz> $$0) {
      crt $$1 = $$0.b();
      ht $$2 = $$0.e();
      $$0.f();
      if (!$$1.t($$2)) {
         return false;
      } else {
         for (hx $$3 : hx.values()) {
            if ($$3 != hx.a && dcr.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, cuc.ff.o().a(dcr.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
