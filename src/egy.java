import com.mojang.serialization.Codec;

public class egy extends efx<eip> {
   public egy(Codec<eip> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efz<eip> $$0) {
      dhf $$1 = $$0.b();
      ji $$2 = $$0.e();
      eip $$3 = $$0.f();

      for (eij.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
