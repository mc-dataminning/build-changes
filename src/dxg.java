import com.mojang.serialization.Codec;

public class dxg extends dvq<dyb> {
   public dxg(Codec<dyb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvs<dyb> $$0) {
      cxu $$1 = $$0.b();
      ib $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (ih $$3 : ih.values()) {
            if ($$3 != ih.a && div.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dac.ff.o().a(div.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
