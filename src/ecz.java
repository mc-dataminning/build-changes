import com.mojang.serialization.Codec;

public class ecz extends eca<eeq> {
   public ecz(Codec<eeq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eeq> $$0) {
      eeq $$1 = $$0.f();
      ayv $$2 = $$0.d();
      ddq $$3 = $$0.b();
      dux $$4 = $$0.c();
      jd $$5 = $$0.e();

      for (edu $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
