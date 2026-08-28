import java.util.Optional;
import javax.annotation.Nullable;

public class cwd extends cxl {
   private static final xv a = xv.c("item.minecraft.lodestone_compass");

   public cwd(cxl.a $$0) {
      super($$0);
   }

   @Nullable
   public static jp a(dhi $$0) {
      return $$0.G_().j() ? jp.a($$0.ah(), $$0.Y()) : null;
   }

   @Override
   public boolean c_(cxp $$0) {
      return $$0.b(ku.ad) || super.c_($$0);
   }

   @Override
   public void a(cxp $$0, dhi $$1, bvk $$2, int $$3, boolean $$4) {
      if ($$1 instanceof ash $$5) {
         daj $$6 = $$0.a(ku.ad);
         if ($$6 != null) {
            daj $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(ku.ad, $$7);
            }
         }
      }
   }

   @Override
   public btj a(dbi $$0) {
      jh $$1 = $$0.a();
      dhi $$2 = $$0.q();
      if (!$$2.a_($$1).a(dko.pL)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, axf.oF, axg.h, 1.0F, 1.0F);
         cpx $$3 = $$0.o();
         cxp $$4 = $$0.n();
         boolean $$5 = !$$3.fV() && $$4.L() == 1;
         daj $$6 = new daj(Optional.of(jp.a($$2.ah(), $$1)), true);
         if ($$5) {
            $$4.b(ku.ad, $$6);
         } else {
            cxp $$7 = $$4.a(cxt.rq, 1);
            $$4.a(1, $$3);
            $$7.b(ku.ad, $$6);
            if (!$$3.gi().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return btj.a;
      }
   }

   @Override
   public xv a(cxp $$0) {
      return $$0.b(ku.ad) ? a : super.a($$0);
   }
}
