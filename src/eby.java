import com.mojang.serialization.Codec;

public class eby extends eaz<edp> {
   public eby(Codec<edp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebb<edp> $$0) {
      edp $$1 = $$0.f();
      azh $$2 = $$0.d();
      dcu $$3 = $$0.b();
      dua $$4 = $$0.c();
      iz $$5 = $$0.e();

      for (ect $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
