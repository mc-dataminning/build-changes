import com.mojang.serialization.Codec;

public class dox extends dny<dqo> {
   public dox(Codec<dqo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doa<dqo> $$0) {
      dqo $$1 = $$0.f();
      ase $$2 = $$0.d();
      cqr $$3 = $$0.b();
      dhi $$4 = $$0.c();
      gw $$5 = $$0.e();

      for (dps $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
