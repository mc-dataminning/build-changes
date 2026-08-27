import com.mojang.serialization.Codec;

public class doz extends dny<dqq> {
   public doz(Codec<dqq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doa<dqq> $$0) {
      cqr $$1 = $$0.b();
      gw $$2 = $$0.e();
      dqq $$3 = $$0.f();

      for (dqk.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
