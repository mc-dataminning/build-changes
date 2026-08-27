import com.mojang.serialization.Codec;

public class dxi extends dvs<dyd> {
   public dxi(Codec<dyd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvu<dyd> $$0) {
      cxw $$1 = $$0.b();
      ib $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (ih $$3 : ih.values()) {
            if ($$3 != ih.a && dix.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dae.ff.o().a(dix.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
