import com.mojang.serialization.Codec;

public class ejs extends eit<elj> {
   public ejs(Codec<elj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<elj> $$0) {
      elj $$1 = $$0.f();
      azt $$2 = $$0.d();
      djo $$3 = $$0.b();
      ebm $$4 = $$0.c();
      iu $$5 = $$0.e();

      for (ekn $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
