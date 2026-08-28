import com.mojang.serialization.Codec;

public class ekf extends eje<elw> {
   public ekf(Codec<elw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<elw> $$0) {
      dju $$1 = $$0.b();
      iu $$2 = $$0.e();
      elw $$3 = $$0.f();

      for (elq.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
