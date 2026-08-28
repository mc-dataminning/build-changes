import java.util.Optional;
import javax.annotation.Nullable;

public class cta extends cum {
   public cta(cum.a $$0) {
      super($$0);
   }

   @Nullable
   public static jh a(dca $$0) {
      return $$0.D_().j() ? jh.a($$0.af(), $$0.V()) : null;
   }

   @Override
   public boolean d_(cur $$0) {
      return $$0.b(km.S) || super.d_($$0);
   }

   @Override
   public void a(cur $$0, dca $$1, bsw $$2, int $$3, boolean $$4) {
      if ($$1 instanceof arf $$5) {
         cxp $$6 = $$0.a(km.S);
         if ($$6 != null) {
            cxp $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(km.S, $$7);
            }
         }
      }
   }

   @Override
   public bqw a(cye $$0) {
      iz $$1 = $$0.a();
      dca $$2 = $$0.q();
      if (!$$2.a_($$1).a(dfd.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awa.on, awb.h, 1.0F, 1.0F);
         cmz $$3 = $$0.o();
         cur $$4 = $$0.n();
         boolean $$5 = !$$3.fP() && $$4.I() == 1;
         cxp $$6 = new cxp(Optional.of(jh.a($$2.af(), $$1)), true);
         if ($$5) {
            $$4.b(km.S, $$6);
         } else {
            cur $$7 = $$4.a(cuu.qS, 1);
            $$4.a(1, $$3);
            $$7.b(km.S, $$6);
            if (!$$3.gc().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bqw.a($$2.B);
      }
   }

   @Override
   public String i(cur $$0) {
      return $$0.b(km.S) ? "item.minecraft.lodestone_compass" : super.i($$0);
   }
}
