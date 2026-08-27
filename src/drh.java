import com.mojang.serialization.Codec;

public class drh extends dqa<dsw> {
   public drh(Codec<dsw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dsw> $$0) {
      dsw $$1 = $$0.f();
      csz $$2 = $$0.b();
      hx $$3 = $$0.e();
      dhn $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof cxn) {
            if (!$$2.t($$3.c())) {
               return false;
            }

            cxn.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
