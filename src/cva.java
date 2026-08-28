import java.util.Optional;
import javax.annotation.Nullable;

public class cva extends cwi {
   private static final xj a = xj.c("item.minecraft.lodestone_compass");

   public cva(cwi.a $$0) {
      super($$0);
   }

   @Nullable
   public static jp a(dfm $$0) {
      return $$0.F_().j() ? jp.a($$0.ag(), $$0.X()) : null;
   }

   @Override
   public boolean c_(cwm $$0) {
      return $$0.b(ku.ad) || super.c_($$0);
   }

   @Override
   public void a(cwm $$0, dfm $$1, bul $$2, int $$3, boolean $$4) {
      if ($$1 instanceof arp $$5) {
         czg $$6 = $$0.a(ku.ad);
         if ($$6 != null) {
            czg $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(ku.ad, $$7);
            }
         }
      }
   }

   @Override
   public bsk a(daf $$0) {
      jh $$1 = $$0.a();
      dfm $$2 = $$0.q();
      if (!$$2.a_($$1).a(dis.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awn.om, awo.h, 1.0F, 1.0F);
         cou $$3 = $$0.o();
         cwm $$4 = $$0.n();
         boolean $$5 = !$$3.fT() && $$4.L() == 1;
         czg $$6 = new czg(Optional.of(jp.a($$2.ag(), $$1)), true);
         if ($$5) {
            $$4.b(ku.ad, $$6);
         } else {
            cwm $$7 = $$4.a(cwq.qT, 1);
            $$4.a(1, $$3);
            $$7.b(ku.ad, $$6);
            if (!$$3.gg().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bsk.a;
      }
   }

   @Override
   public xj a(cwm $$0) {
      return $$0.b(ku.ad) ? a : super.a($$0);
   }
}
