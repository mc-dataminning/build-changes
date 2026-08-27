import com.mojang.serialization.Codec;

public class dop extends dnq<dqg> {
   public dop(Codec<dqg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dns<dqg> $$0) {
      dqg $$1 = $$0.f();
      ash $$2 = $$0.d();
      cqv $$3 = $$0.b();
      dha $$4 = $$0.c();
      gw $$5 = $$0.e();

      for (dpk $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
