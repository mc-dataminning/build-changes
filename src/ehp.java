import com.mojang.serialization.Codec;

public class ehp extends ego<ejg> {
   public ehp(Codec<ejg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egq<ejg> $$0) {
      dhy $$1 = $$0.b();
      jh $$2 = $$0.e();
      ejg $$3 = $$0.f();

      for (eja.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
