import java.util.Optional;
import javax.annotation.Nullable;

public class cvy extends cxg {
   private static final xv a = xv.c("item.minecraft.lodestone_compass");

   public cvy(cxg.a $$0) {
      super($$0);
   }

   @Nullable
   public static jp a(dha $$0) {
      return $$0.G_().j() ? jp.a($$0.ah(), $$0.Y()) : null;
   }

   @Override
   public boolean c_(cxk $$0) {
      return $$0.b(ku.ad) || super.c_($$0);
   }

   @Override
   public void a(cxk $$0, dha $$1, bvf $$2, int $$3, boolean $$4) {
      if ($$1 instanceof ash $$5) {
         dae $$6 = $$0.a(ku.ad);
         if ($$6 != null) {
            dae $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(ku.ad, $$7);
            }
         }
      }
   }

   @Override
   public bte a(dbd $$0) {
      jh $$1 = $$0.a();
      dha $$2 = $$0.q();
      if (!$$2.a_($$1).a(dkg.pL)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, axf.oE, axg.h, 1.0F, 1.0F);
         cps $$3 = $$0.o();
         cxk $$4 = $$0.n();
         boolean $$5 = !$$3.fT() && $$4.L() == 1;
         dae $$6 = new dae(Optional.of(jp.a($$2.ah(), $$1)), true);
         if ($$5) {
            $$4.b(ku.ad, $$6);
         } else {
            cxk $$7 = $$4.a(cxo.rq, 1);
            $$4.a(1, $$3);
            $$7.b(ku.ad, $$6);
            if (!$$3.gg().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bte.a;
      }
   }

   @Override
   public xv a(cxk $$0) {
      return $$0.b(ku.ad) ? a : super.a($$0);
   }
}
