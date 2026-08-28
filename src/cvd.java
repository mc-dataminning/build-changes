import java.util.Optional;

public class cvd extends cwl {
   private static final wp a = wp.c("item.minecraft.lodestone_compass");

   public cvd(cwl.a $$0) {
      super($$0);
   }

   @Override
   public boolean c_(cwp $$0) {
      return $$0.b(kv.ad) || super.c_($$0);
   }

   @Override
   public void a(cwp $$0, dgi $$1, bul $$2, int $$3, boolean $$4) {
      if ($$1 instanceof ard $$5) {
         czj $$6 = $$0.a(kv.ad);
         if ($$6 != null) {
            czj $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kv.ad, $$7);
            }
         }
      }
   }

   @Override
   public bsk a(dai $$0) {
      ji $$1 = $$0.a();
      dgi $$2 = $$0.q();
      if (!$$2.a_($$1).a(djo.pS)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awa.oL, awb.h, 1.0F, 1.0F);
         cox $$3 = $$0.o();
         cwp $$4 = $$0.n();
         boolean $$5 = !$$3.fV() && $$4.M() == 1;
         czj $$6 = new czj(Optional.of(jq.a($$2.ai(), $$1)), true);
         if ($$5) {
            $$4.b(kv.ad, $$6);
         } else {
            cwp $$7 = $$4.a(cwt.rz, 1);
            $$4.a(1, $$3);
            $$7.b(kv.ad, $$6);
            if (!$$3.gi().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bsk.a;
      }
   }

   @Override
   public wp a(cwp $$0) {
      return $$0.b(kv.ad) ? a : super.a($$0);
   }
}
