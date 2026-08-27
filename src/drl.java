import com.mojang.serialization.Codec;

public class drl extends dpv<dsg> {
   public drl(Codec<dsg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpx<dsg> $$0) {
      csu $$1 = $$0.b();
      ht $$2 = $$0.e();
      $$0.f();
      if (!$$1.t($$2)) {
         return false;
      } else {
         for (hx $$3 : hx.values()) {
            if ($$3 != hx.a && ddt.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, cvc.ff.o().a(ddt.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
