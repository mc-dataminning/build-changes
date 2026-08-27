import com.mojang.serialization.Codec;

public class dox extends dnw<dqo> {
   public dox(Codec<dqo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqo> $$0) {
      cqp $$1 = $$0.b();
      gw $$2 = $$0.e();
      dqo $$3 = $$0.f();

      for (dqi.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
