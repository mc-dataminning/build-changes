import com.mojang.serialization.Codec;

public class dsj extends drc<dty> {
   public dsj(Codec<dty> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dty> $$0) {
      dty $$1 = $$0.f();
      ctt $$2 = $$0.b();
      hv $$3 = $$0.e();
      dip $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof cyh) {
            if (!$$2.t($$3.c())) {
               return false;
            }

            cyh.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
