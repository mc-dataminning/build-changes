import com.mojang.serialization.Codec;

public class dzv extends dyu<ebm> {
   public dzv(Codec<ebm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<ebm> $$0) {
      dap $$1 = $$0.b();
      im $$2 = $$0.e();
      ebm $$3 = $$0.f();

      for (ebg.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
