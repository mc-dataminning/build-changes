import com.mojang.serialization.Codec;

public class egx extends efy<eio> {
   public egx(Codec<eio> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ega<eio> $$0) {
      eio $$1 = $$0.f();
      azh $$2 = $$0.d();
      dhg $$3 = $$0.b();
      dyt $$4 = $$0.c();
      ji $$5 = $$0.e();

      for (ehs $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
