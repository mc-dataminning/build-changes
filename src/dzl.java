import com.mojang.serialization.Codec;

public class dzl extends dxv<eag> {
   public dzl(Codec<eag> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<eag> $$0) {
      czs $$1 = $$0.b();
      ib $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (ih $$3 : ih.values()) {
            if ($$3 != ih.a && dkt.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dca.ff.n().a(dkt.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
