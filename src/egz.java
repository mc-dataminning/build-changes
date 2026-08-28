import com.mojang.serialization.Codec;

public class egz extends efy<eiq> {
   public egz(Codec<eiq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ega<eiq> $$0) {
      dhg $$1 = $$0.b();
      ji $$2 = $$0.e();
      eiq $$3 = $$0.f();

      for (eik.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
