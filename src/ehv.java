import com.mojang.serialization.Codec;

public class ehv extends egu<ejm> {
   public ehv(Codec<ejm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egw<ejm> $$0) {
      dhy $$1 = $$0.b();
      ji $$2 = $$0.e();
      ejm $$3 = $$0.f();

      for (ejg.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
