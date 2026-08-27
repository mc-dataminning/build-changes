import com.mojang.serialization.Codec;

public class dpm extends dnw<dqh> {
   public dpm(Codec<dqh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqh> $$0) {
      cqp $$1 = $$0.b();
      gw $$2 = $$0.e();
      $$0.f();
      if (!$$1.t($$2)) {
         return false;
      } else {
         for (ha $$3 : ha.values()) {
            if ($$3 != ha.a && dbp.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, csw.ff.n().a(dbp.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
