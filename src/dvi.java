import com.mojang.serialization.Codec;

public class dvi extends dts<dwd> {
   public dvi(Codec<dwd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dwd> $$0) {
      cwi $$1 = $$0.b();
      hz $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (ie $$3 : ie.values()) {
            if ($$3 != ie.a && dhi.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, cyq.ff.o().a(dhi.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
