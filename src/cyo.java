import java.util.Optional;
import javax.annotation.Nullable;

public class cyo extends czu {
   private static final xa a = xa.c("item.minecraft.lodestone_compass");

   public cyo(czu.a $$0) {
      super($$0);
   }

   @Override
   public boolean d_(czy $$0) {
      return $$0.c(kk.ah) || super.d_($$0);
   }

   @Override
   public void a(czy $$0, ars $$1, bwt $$2, @Nullable bxd $$3) {
      dcs $$4 = $$0.a(kk.ah);
      if ($$4 != null) {
         dcs $$5 = $$4.a($$1);
         if ($$5 != $$4) {
            $$0.b(kk.ah, $$5);
         }
      }
   }

   @Override
   public bur a(ddt $$0) {
      iv $$1 = $$0.a();
      djx $$2 = $$0.q();
      if (!$$2.a_($$1).a(dne.pY)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awp.oZ, awq.h, 1.0F, 1.0F);
         crx $$3 = $$0.o();
         czy $$4 = $$0.n();
         boolean $$5 = !$$3.fV() && $$4.M() == 1;
         dcs $$6 = new dcs(Optional.of(je.a($$2.aj(), $$1)), true);
         if ($$5) {
            $$4.b(kk.ah, $$6);
         } else {
            czy $$7 = $$4.a(dac.rK, 1);
            $$4.a(1, $$3);
            $$7.b(kk.ah, $$6);
            if (!$$3.gj().g($$7)) {
               $$3.a($$7, false);
            }
         }

         return bur.a;
      }
   }

   @Override
   public xa a(czy $$0) {
      return $$0.c(kk.ah) ? a : super.a($$0);
   }
}
