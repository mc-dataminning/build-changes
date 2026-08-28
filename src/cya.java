import java.util.Optional;
import javax.annotation.Nullable;

public class cya extends czg {
   private static final wy a = wy.c("item.minecraft.lodestone_compass");

   public cya(czg.a $$0) {
      super($$0);
   }

   @Override
   public boolean d_(czk $$0) {
      return $$0.c(kk.ah) || super.d_($$0);
   }

   @Override
   public void a(czk $$0, arq $$1, bwi $$2, @Nullable bws $$3) {
      dce $$4 = $$0.a(kk.ah);
      if ($$4 != null) {
         dce $$5 = $$4.a($$1);
         if ($$5 != $$4) {
            $$0.b(kk.ah, $$5);
         }
      }
   }

   @Override
   public bug a(ddf $$0) {
      iv $$1 = $$0.a();
      djh $$2 = $$0.q();
      if (!$$2.a_($$1).a(dmo.pY)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awn.oZ, awo.h, 1.0F, 1.0F);
         crj $$3 = $$0.o();
         czk $$4 = $$0.n();
         boolean $$5 = !$$3.fU() && $$4.M() == 1;
         dce $$6 = new dce(Optional.of(je.a($$2.aj(), $$1)), true);
         if ($$5) {
            $$4.b(kk.ah, $$6);
         } else {
            czk $$7 = $$4.a(czo.rK, 1);
            $$4.a(1, $$3);
            $$7.b(kk.ah, $$6);
            if (!$$3.gi().g($$7)) {
               $$3.a($$7, false);
            }
         }

         return bug.a;
      }
   }

   @Override
   public wy a(czk $$0) {
      return $$0.c(kk.ah) ? a : super.a($$0);
   }
}
