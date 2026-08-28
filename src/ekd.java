import com.mojang.serialization.Codec;

public class ekd extends eje<elu> {
   public ekd(Codec<elu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<elu> $$0) {
      elu $$1 = $$0.f();
      azv $$2 = $$0.d();
      dju $$3 = $$0.b();
      ebx $$4 = $$0.c();
      iu $$5 = $$0.e();

      for (eky $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
