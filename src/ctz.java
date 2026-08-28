import java.util.Optional;
import javax.annotation.Nullable;

public class ctz extends cvk {
   public ctz(cvk.a $$0) {
      super($$0);
   }

   @Nullable
   public static jm a(deg $$0) {
      return $$0.B_().j() ? jm.a($$0.ag(), $$0.W()) : null;
   }

   @Override
   public boolean e_(cvp $$0) {
      return $$0.b(kr.Y) || super.e_($$0);
   }

   @Override
   public void a(cvp $$0, deg $$1, bto $$2, int $$3, boolean $$4) {
      if ($$1 instanceof arh $$5) {
         cyn $$6 = $$0.a(kr.Y);
         if ($$6 != null) {
            cyn $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kr.Y, $$7);
            }
         }
      }
   }

   @Override
   public brp a(czm $$0) {
      je $$1 = $$0.a();
      deg $$2 = $$0.q();
      if (!$$2.a_($$1).a(dhl.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awe.oo, awf.h, 1.0F, 1.0F);
         cnu $$3 = $$0.o();
         cvp $$4 = $$0.n();
         boolean $$5 = !$$3.fQ() && $$4.J() == 1;
         cyn $$6 = new cyn(Optional.of(jm.a($$2.ag(), $$1)), true);
         if ($$5) {
            $$4.b(kr.Y, $$6);
         } else {
            cvp $$7 = $$4.a(cvt.qT, 1);
            $$4.a(1, $$3);
            $$7.b(kr.Y, $$6);
            if (!$$3.gc().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return brp.a;
      }
   }

   @Override
   public String d_(cvp $$0) {
      return $$0.b(kr.Y) ? "item.minecraft.lodestone_compass" : super.d_($$0);
   }
}
