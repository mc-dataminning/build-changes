import com.mojang.serialization.Codec;

public class ebv extends eay<edn> {
   public ebv(Codec<edn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eba<edn> $$0) {
      azh $$1 = $$0.d();
      edn $$2 = $$0.f();
      dct $$3 = $$0.b();
      dtz $$4 = $$0.c();
      iz $$5 = $$0.e();
      boolean $$6 = $$1.h();
      return ($$6 ? $$2.b : $$2.c).a().a($$3, $$4, $$1, $$5);
   }
}
