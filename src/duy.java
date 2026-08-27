import com.mojang.serialization.Codec;

public class duy extends dtz<dwp> {
   public duy(Codec<dwp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dwp> $$0) {
      dwp $$1 = $$0.f();
      awp $$2 = $$0.d();
      cwm $$3 = $$0.b();
      dng $$4 = $$0.c();
      hz $$5 = $$0.e();

      for (dvt $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
