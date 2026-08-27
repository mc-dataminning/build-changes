import com.mojang.serialization.Codec;

public class dpo extends dny<dqj> {
   public dpo(Codec<dqj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doa<dqj> $$0) {
      cqr $$1 = $$0.b();
      gw $$2 = $$0.e();
      $$0.f();
      if (!$$1.t($$2)) {
         return false;
      } else {
         for (hc $$3 : hc.values()) {
            if ($$3 != hc.a && dbr.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, csy.ff.n().a(dbr.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
