import com.mojang.serialization.Codec;

public class emm extends ekw<eni> {
   public emm(Codec<eni> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<eni> $$0) {
      dli $$1 = $$0.b();
      iw $$2 = $$0.e();
      $$0.f();
      if (!$$1.v($$2)) {
         return false;
      } else {
         for (jc $$3 : jc.values()) {
            if ($$3 != jc.a && dxb.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dnq.fx.m().b(dxb.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
