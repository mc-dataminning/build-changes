import com.mojang.serialization.Codec;

public class dtb extends dru<duq> {
   public dtb(Codec<duq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drw<duq> $$0) {
      duq $$1 = $$0.f();
      cuk $$2 = $$0.b();
      hx $$3 = $$0.e();
      djh $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof cyy) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            cyy.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
