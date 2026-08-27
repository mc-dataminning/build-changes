import com.mojang.serialization.Codec;

public class dzd extends dye<eau> {
   public dzd(Codec<eau> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<eau> $$0) {
      eau $$1 = $$0.f();
      axt $$2 = $$0.d();
      dab $$3 = $$0.b();
      drf $$4 = $$0.c();
      id $$5 = $$0.e();

      for (dzy $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
