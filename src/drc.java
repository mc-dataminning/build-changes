import com.mojang.serialization.Codec;

public class drc extends dpv<dsr> {
   public drc(Codec<dsr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpx<dsr> $$0) {
      dsr $$1 = $$0.f();
      csu $$2 = $$0.b();
      ht $$3 = $$0.e();
      dhi $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof cxi) {
            if (!$$2.t($$3.c())) {
               return false;
            }

            cxi.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
