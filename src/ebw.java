import com.mojang.serialization.Codec;

public class ebw extends eax<edn> {
   public ebw(Codec<edn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<edn> $$0) {
      edn $$1 = $$0.f();
      azg $$2 = $$0.d();
      dcs $$3 = $$0.b();
      dty $$4 = $$0.c();
      iz $$5 = $$0.e();

      for (ecr $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
