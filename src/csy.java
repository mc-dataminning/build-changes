import java.util.Optional;
import javax.annotation.Nullable;

public class csy extends cuk {
   public csy(cuk.a $$0) {
      super($$0);
   }

   @Nullable
   public static jh a(dby $$0) {
      return $$0.D_().j() ? jh.a($$0.af(), $$0.V()) : null;
   }

   @Override
   public boolean d_(cup $$0) {
      return $$0.b(km.S) || super.d_($$0);
   }

   @Override
   public void a(cup $$0, dby $$1, bsu $$2, int $$3, boolean $$4) {
      if ($$1 instanceof arf $$5) {
         cxn $$6 = $$0.a(km.S);
         if ($$6 != null) {
            cxn $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(km.S, $$7);
            }
         }
      }
   }

   @Override
   public bqu a(cyc $$0) {
      iz $$1 = $$0.a();
      dby $$2 = $$0.q();
      if (!$$2.a_($$1).a(dfb.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awa.on, awb.h, 1.0F, 1.0F);
         cmx $$3 = $$0.o();
         cup $$4 = $$0.n();
         boolean $$5 = !$$3.fP() && $$4.I() == 1;
         cxn $$6 = new cxn(Optional.of(jh.a($$2.af(), $$1)), true);
         if ($$5) {
            $$4.b(km.S, $$6);
         } else {
            cup $$7 = $$4.a(cus.qS, 1);
            $$4.a(1, $$3);
            $$7.b(km.S, $$6);
            if (!$$3.gc().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bqu.a($$2.B);
      }
   }

   @Override
   public String i(cup $$0) {
      return $$0.b(km.S) ? "item.minecraft.lodestone_compass" : super.i($$0);
   }
}
