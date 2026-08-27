import com.mojang.serialization.Codec;

public class dnc extends dnq<dqb> {
   public dnc(Codec<dqb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dns<dqb> $$0) {
      cqv $$1 = $$0.b();
      gw $$2 = $$0.e();
      ash $$3 = $$0.d();
      if ($$1.t($$2) && $$1.a_($$2.d()).a(cte.fz)) {
         cuh.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
