import java.util.Optional;
import javax.annotation.Nullable;

public class cvb extends cwj {
   private static final wo a = wo.c("item.minecraft.lodestone_compass");

   public cvb(cwj.a $$0) {
      super($$0);
   }

   @Nullable
   public static jq a(dgg $$0) {
      return $$0.G_().j() ? jq.a($$0.ai(), $$0.Z()) : null;
   }

   @Override
   public boolean c_(cwn $$0) {
      return $$0.b(kv.ad) || super.c_($$0);
   }

   @Override
   public void a(cwn $$0, dgg $$1, buj $$2, int $$3, boolean $$4) {
      if ($$1 instanceof arc $$5) {
         czh $$6 = $$0.a(kv.ad);
         if ($$6 != null) {
            czh $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kv.ad, $$7);
            }
         }
      }
   }

   @Override
   public bsi a(dag $$0) {
      ji $$1 = $$0.a();
      dgg $$2 = $$0.q();
      if (!$$2.a_($$1).a(djm.pS)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, avz.oL, awa.h, 1.0F, 1.0F);
         cov $$3 = $$0.o();
         cwn $$4 = $$0.n();
         boolean $$5 = !$$3.fV() && $$4.M() == 1;
         czh $$6 = new czh(Optional.of(jq.a($$2.ai(), $$1)), true);
         if ($$5) {
            $$4.b(kv.ad, $$6);
         } else {
            cwn $$7 = $$4.a(cwr.rz, 1);
            $$4.a(1, $$3);
            $$7.b(kv.ad, $$6);
            if (!$$3.gi().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bsi.a;
      }
   }

   @Override
   public wo a(cwn $$0) {
      return $$0.b(kv.ad) ? a : super.a($$0);
   }
}
