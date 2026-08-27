import com.mojang.serialization.Codec;

public class edw extends eca<eer> {
   public edw(Codec<eer> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eer> $$0) {
      dcv $$1 = $$0.b();
      ir $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (iw $$3 : iw.values()) {
            if ($$3 != iw.a && doo.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dfe.fX.n().a(doo.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
