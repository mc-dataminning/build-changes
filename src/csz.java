import java.util.Optional;
import javax.annotation.Nullable;

public class csz extends cul {
   public csz(cul.a $$0) {
      super($$0);
   }

   @Nullable
   public static jh a(dbz $$0) {
      return $$0.D_().j() ? jh.a($$0.af(), $$0.V()) : null;
   }

   @Override
   public boolean d_(cuq $$0) {
      return $$0.b(km.S) || super.d_($$0);
   }

   @Override
   public void a(cuq $$0, dbz $$1, bsv $$2, int $$3, boolean $$4) {
      if ($$1 instanceof arf $$5) {
         cxo $$6 = $$0.a(km.S);
         if ($$6 != null) {
            cxo $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(km.S, $$7);
            }
         }
      }
   }

   @Override
   public bqv a(cyd $$0) {
      iz $$1 = $$0.a();
      dbz $$2 = $$0.q();
      if (!$$2.a_($$1).a(dfc.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awa.on, awb.h, 1.0F, 1.0F);
         cmy $$3 = $$0.o();
         cuq $$4 = $$0.n();
         boolean $$5 = !$$3.fP() && $$4.I() == 1;
         cxo $$6 = new cxo(Optional.of(jh.a($$2.af(), $$1)), true);
         if ($$5) {
            $$4.b(km.S, $$6);
         } else {
            cuq $$7 = $$4.a(cut.qS, 1);
            $$4.a(1, $$3);
            $$7.b(km.S, $$6);
            if (!$$3.gc().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bqv.a($$2.B);
      }
   }

   @Override
   public String i(cuq $$0) {
      return $$0.b(km.S) ? "item.minecraft.lodestone_compass" : super.i($$0);
   }
}
