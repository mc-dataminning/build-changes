import com.mojang.serialization.Codec;

public class dph extends dnr<dqc> {
   public dph(Codec<dqc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dqc> $$0) {
      cqk $$1 = $$0.b();
      gw $$2 = $$0.e();
      $$0.f();
      if (!$$1.t($$2)) {
         return false;
      } else {
         for (hc $$3 : hc.values()) {
            if ($$3 != hc.a && dbk.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, csr.ff.n().a(dbk.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
