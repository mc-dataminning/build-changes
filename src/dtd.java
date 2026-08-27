import com.mojang.serialization.Codec;

public class dtd extends dsc<duu> {
   public dtd(Codec<duu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dse<duu> $$0) {
      cus $$1 = $$0.b();
      hx $$2 = $$0.e();
      duu $$3 = $$0.f();

      for (duo.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
