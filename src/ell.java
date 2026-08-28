import com.mojang.serialization.Codec;

public class ell extends ekm<end> {
   public ell(Codec<end> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<end> $$0) {
      end $$1 = $$0.f();
      azz $$2 = $$0.d();
      dky $$3 = $$0.b();
      ede $$4 = $$0.c();
      iw $$5 = $$0.e();

      for (emg $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
