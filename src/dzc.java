import com.mojang.serialization.Codec;

public class dzc extends dxv<ear> {
   public dzc(Codec<ear> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<ear> $$0) {
      ear $$1 = $$0.f();
      czs $$2 = $$0.b();
      ib $$3 = $$0.e();
      doz $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof deg) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            deg.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
