import com.mojang.serialization.Codec;

public class dov extends dnw<dqm> {
   public dov(Codec<dqm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqm> $$0) {
      dqm $$1 = $$0.f();
      asc $$2 = $$0.d();
      cqp $$3 = $$0.b();
      dhg $$4 = $$0.c();
      gw $$5 = $$0.e();

      for (dpq $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
