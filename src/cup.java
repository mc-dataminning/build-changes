import java.util.Optional;
import javax.annotation.Nullable;

public class cup extends cvx {
   private static final xi a = xi.c("item.minecraft.lodestone_compass");

   public cup(cvx.a $$0) {
      super($$0);
   }

   @Nullable
   public static jp a(dfb $$0) {
      return $$0.D_().j() ? jp.a($$0.ag(), $$0.W()) : null;
   }

   @Override
   public boolean c_(cwb $$0) {
      return $$0.b(ku.ad) || super.c_($$0);
   }

   @Override
   public void a(cwb $$0, dfb $$1, bue $$2, int $$3, boolean $$4) {
      if ($$1 instanceof arn $$5) {
         cyv $$6 = $$0.a(ku.ad);
         if ($$6 != null) {
            cyv $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(ku.ad, $$7);
            }
         }
      }
   }

   @Override
   public bsd a(czu $$0) {
      jh $$1 = $$0.a();
      dfb $$2 = $$0.q();
      if (!$$2.a_($$1).a(dig.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awl.om, awm.h, 1.0F, 1.0F);
         com $$3 = $$0.o();
         cwb $$4 = $$0.n();
         boolean $$5 = !$$3.fX() && $$4.L() == 1;
         cyv $$6 = new cyv(Optional.of(jp.a($$2.ag(), $$1)), true);
         if ($$5) {
            $$4.b(ku.ad, $$6);
         } else {
            cwb $$7 = $$4.a(cwf.qT, 1);
            $$4.a(1, $$3);
            $$7.b(ku.ad, $$6);
            if (!$$3.gk().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bsd.a;
      }
   }

   @Override
   public xi a(cwb $$0) {
      return $$0.b(ku.ad) ? a : super.a($$0);
   }
}
