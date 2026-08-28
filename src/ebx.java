import com.mojang.serialization.Codec;

public class ebx extends eay<edo> {
   public ebx(Codec<edo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eba<edo> $$0) {
      edo $$1 = $$0.f();
      azh $$2 = $$0.d();
      dct $$3 = $$0.b();
      dtz $$4 = $$0.c();
      iz $$5 = $$0.e();

      for (ecs $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
