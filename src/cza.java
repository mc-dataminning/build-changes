import java.util.Optional;
import javax.annotation.Nullable;

public class cza extends dag {
   private static final xg a = xg.c("item.minecraft.lodestone_compass");

   public cza(dag.a $$0) {
      super($$0);
   }

   @Override
   public boolean d_(dak $$0) {
      return $$0.c(kl.ah) || super.d_($$0);
   }

   @Override
   public void a(dak $$0, asb $$1, bxe $$2, @Nullable bxo $$3) {
      dde $$4 = $$0.a(kl.ah);
      if ($$4 != null) {
         dde $$5 = $$4.a($$1);
         if ($$5 != $$4) {
            $$0.b(kl.ah, $$5);
         }
      }
   }

   @Override
   public bvc a(def $$0) {
      iw $$1 = $$0.a();
      dkj $$2 = $$0.q();
      if (!$$2.a_($$1).a(dnq.pY)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awy.oZ, awz.h, 1.0F, 1.0F);
         csi $$3 = $$0.o();
         dak $$4 = $$0.n();
         boolean $$5 = !$$3.fV() && $$4.M() == 1;
         dde $$6 = new dde(Optional.of(jf.a($$2.aj(), $$1)), true);
         if ($$5) {
            $$4.b(kl.ah, $$6);
         } else {
            dak $$7 = $$4.a(dao.rK, 1);
            $$4.a(1, $$3);
            $$7.b(kl.ah, $$6);
            if (!$$3.gj().g($$7)) {
               $$3.a($$7, false);
            }
         }

         return bvc.a;
      }
   }

   @Override
   public xg a(dak $$0) {
      return $$0.c(kl.ah) ? a : super.a($$0);
   }
}
