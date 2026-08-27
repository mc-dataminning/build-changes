import com.mojang.serialization.Codec;

public class dss extends drc<dtn> {
   public dss(Codec<dtn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtn> $$0) {
      ctt $$1 = $$0.b();
      hv $$2 = $$0.e();
      $$0.f();
      if (!$$1.t($$2)) {
         return false;
      } else {
         for (ia $$3 : ia.values()) {
            if ($$3 != ia.a && det.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, cwb.ff.o().a(det.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
