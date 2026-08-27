import com.mojang.serialization.Codec;

public class dtj extends drt<due> {
   public dtj(Codec<due> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<due> $$0) {
      cuj $$1 = $$0.b();
      hx $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (ic $$3 : ic.values()) {
            if ($$3 != ic.a && dfj.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, cwr.ff.o().a(dfj.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
