import com.mojang.serialization.Codec;

public class ehq extends egp<ejh> {
   public ehq(Codec<ejh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<ejh> $$0) {
      dhx $$1 = $$0.b();
      jh $$2 = $$0.e();
      ejh $$3 = $$0.f();

      for (ejb.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
