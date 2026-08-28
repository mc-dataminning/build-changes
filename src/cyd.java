import java.util.Optional;
import javax.annotation.Nullable;

public class cyd extends czj {
   private static final wy a = wy.c("item.minecraft.lodestone_compass");

   public cyd(czj.a $$0) {
      super($$0);
   }

   @Override
   public boolean d_(czn $$0) {
      return $$0.c(kk.ah) || super.d_($$0);
   }

   @Override
   public void a(czn $$0, arq $$1, bwi $$2, @Nullable bws $$3) {
      dch $$4 = $$0.a(kk.ah);
      if ($$4 != null) {
         dch $$5 = $$4.a($$1);
         if ($$5 != $$4) {
            $$0.b(kk.ah, $$5);
         }
      }
   }

   @Override
   public bug a(ddi $$0) {
      iv $$1 = $$0.a();
      djm $$2 = $$0.q();
      if (!$$2.a_($$1).a(dmt.pY)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awn.oZ, awo.h, 1.0F, 1.0F);
         crm $$3 = $$0.o();
         czn $$4 = $$0.n();
         boolean $$5 = !$$3.fU() && $$4.M() == 1;
         dch $$6 = new dch(Optional.of(je.a($$2.aj(), $$1)), true);
         if ($$5) {
            $$4.b(kk.ah, $$6);
         } else {
            czn $$7 = $$4.a(czr.rK, 1);
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
   public wy a(czn $$0) {
      return $$0.c(kk.ah) ? a : super.a($$0);
   }
}
