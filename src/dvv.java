import com.mojang.serialization.Codec;

public class dvv extends duu<dxm> {
   public dvv(Codec<dxm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(duw<dxm> $$0) {
      cwz $$1 = $$0.b();
      ib $$2 = $$0.e();
      dxm $$3 = $$0.f();

      for (dxg.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
