import com.mojang.serialization.Codec;

public class ecj extends ebk<eea> {
   public ecj(Codec<eea> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebm<eea> $$0) {
      eea $$1 = $$0.f();
      ayo $$2 = $$0.d();
      ddb $$3 = $$0.b();
      duh $$4 = $$0.c();
      ja $$5 = $$0.e();

      for (ede $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
