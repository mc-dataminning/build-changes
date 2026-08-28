import com.mojang.serialization.Codec;

public class eha extends efz<eir> {
   public eha(Codec<eir> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egb<eir> $$0) {
      dhh $$1 = $$0.b();
      ji $$2 = $$0.e();
      eir $$3 = $$0.f();

      for (eil.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
