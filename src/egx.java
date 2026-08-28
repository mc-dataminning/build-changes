import com.mojang.serialization.Codec;

public class egx extends efw<eio> {
   public egx(Codec<eio> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<eio> $$0) {
      dhe $$1 = $$0.b();
      ji $$2 = $$0.e();
      eio $$3 = $$0.f();

      for (eii.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
