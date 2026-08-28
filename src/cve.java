import java.util.Optional;

public class cve extends cwm {
   private static final wp a = wp.c("item.minecraft.lodestone_compass");

   public cve(cwm.a $$0) {
      super($$0);
   }

   @Override
   public boolean c_(cwq $$0) {
      return $$0.b(kv.ad) || super.c_($$0);
   }

   @Override
   public void a(cwq $$0, dgj $$1, bum $$2, int $$3, boolean $$4) {
      if ($$1 instanceof ard $$5) {
         czk $$6 = $$0.a(kv.ad);
         if ($$6 != null) {
            czk $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kv.ad, $$7);
            }
         }
      }
   }

   @Override
   public bsl a(daj $$0) {
      ji $$1 = $$0.a();
      dgj $$2 = $$0.q();
      if (!$$2.a_($$1).a(djp.pS)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awa.oL, awb.h, 1.0F, 1.0F);
         coy $$3 = $$0.o();
         cwq $$4 = $$0.n();
         boolean $$5 = !$$3.fV() && $$4.M() == 1;
         czk $$6 = new czk(Optional.of(jq.a($$2.ai(), $$1)), true);
         if ($$5) {
            $$4.b(kv.ad, $$6);
         } else {
            cwq $$7 = $$4.a(cwu.rz, 1);
            $$4.a(1, $$3);
            $$7.b(kv.ad, $$6);
            if (!$$3.gi().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bsl.a;
      }
   }

   @Override
   public wp a(cwq $$0) {
      return $$0.b(kv.ad) ? a : super.a($$0);
   }
}
