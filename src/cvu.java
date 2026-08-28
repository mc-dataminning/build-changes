import java.util.Optional;
import javax.annotation.Nullable;

public class cvu extends cxc {
   private static final xk a = xk.c("item.minecraft.lodestone_compass");

   public cvu(cxc.a $$0) {
      super($$0);
   }

   @Nullable
   public static jp a(dgz $$0) {
      return $$0.G_().j() ? jp.a($$0.ai(), $$0.Z()) : null;
   }

   @Override
   public boolean c_(cxg $$0) {
      return $$0.b(ku.ad) || super.c_($$0);
   }

   @Override
   public void a(cxg $$0, dgz $$1, bvb $$2, int $$3, boolean $$4) {
      if ($$1 instanceof arx $$5) {
         daa $$6 = $$0.a(ku.ad);
         if ($$6 != null) {
            daa $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(ku.ad, $$7);
            }
         }
      }
   }

   @Override
   public bta a(daz $$0) {
      jh $$1 = $$0.a();
      dgz $$2 = $$0.q();
      if (!$$2.a_($$1).a(dkf.pS)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awv.oL, aww.h, 1.0F, 1.0F);
         cpo $$3 = $$0.o();
         cxg $$4 = $$0.n();
         boolean $$5 = !$$3.fV() && $$4.M() == 1;
         daa $$6 = new daa(Optional.of(jp.a($$2.ai(), $$1)), true);
         if ($$5) {
            $$4.b(ku.ad, $$6);
         } else {
            cxg $$7 = $$4.a(cxk.rz, 1);
            $$4.a(1, $$3);
            $$7.b(ku.ad, $$6);
            if (!$$3.gi().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bta.a;
      }
   }

   @Override
   public xk a(cxg $$0) {
      return $$0.b(ku.ad) ? a : super.a($$0);
   }
}
