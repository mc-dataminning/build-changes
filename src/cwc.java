import java.util.Optional;
import javax.annotation.Nullable;

public class cwc extends cxk {
   private static final xv a = xv.c("item.minecraft.lodestone_compass");

   public cwc(cxk.a $$0) {
      super($$0);
   }

   @Nullable
   public static jp a(dhh $$0) {
      return $$0.G_().j() ? jp.a($$0.ah(), $$0.Y()) : null;
   }

   @Override
   public boolean c_(cxo $$0) {
      return $$0.b(ku.ad) || super.c_($$0);
   }

   @Override
   public void a(cxo $$0, dhh $$1, bvj $$2, int $$3, boolean $$4) {
      if ($$1 instanceof ash $$5) {
         dai $$6 = $$0.a(ku.ad);
         if ($$6 != null) {
            dai $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(ku.ad, $$7);
            }
         }
      }
   }

   @Override
   public bti a(dbh $$0) {
      jh $$1 = $$0.a();
      dhh $$2 = $$0.q();
      if (!$$2.a_($$1).a(dkn.pL)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, axf.oF, axg.h, 1.0F, 1.0F);
         cpw $$3 = $$0.o();
         cxo $$4 = $$0.n();
         boolean $$5 = !$$3.fV() && $$4.L() == 1;
         dai $$6 = new dai(Optional.of(jp.a($$2.ah(), $$1)), true);
         if ($$5) {
            $$4.b(ku.ad, $$6);
         } else {
            cxo $$7 = $$4.a(cxs.rq, 1);
            $$4.a(1, $$3);
            $$7.b(ku.ad, $$6);
            if (!$$3.gi().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bti.a;
      }
   }

   @Override
   public xv a(cxo $$0) {
      return $$0.b(ku.ad) ? a : super.a($$0);
   }
}
