import com.mojang.serialization.Codec;

public class doo extends dnn<dqf> {
   public doo(Codec<dqf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnp<dqf> $$0) {
      cqg $$1 = $$0.b();
      gu $$2 = $$0.e();
      dqf $$3 = $$0.f();

      for (dpz.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
