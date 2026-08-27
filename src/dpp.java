import com.mojang.serialization.Codec;

public class dpp extends doo<drg> {
   public dpp(Codec<drg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doq<drg> $$0) {
      crt $$1 = $$0.b();
      ht $$2 = $$0.e();
      drg $$3 = $$0.f();

      for (dra.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
