import java.util.Optional;
import javax.annotation.Nullable;

public class csm extends cty {
   public csm(cty.a $$0) {
      super($$0);
   }

   @Nullable
   public static ji a(dcg $$0) {
      return $$0.D_().j() ? ji.a($$0.af(), $$0.V()) : null;
   }

   @Override
   public boolean d_(cud $$0) {
      return $$0.b(kn.S) || super.d_($$0);
   }

   @Override
   public void a(cud $$0, dcg $$1, bsh $$2, int $$3, boolean $$4) {
      if ($$1 instanceof aqm $$5) {
         cxa $$6 = $$0.a(kn.S);
         if ($$6 != null) {
            cxa $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kn.S, $$7);
            }
         }
      }
   }

   @Override
   public bqh a(cxp $$0) {
      ja $$1 = $$0.a();
      dcg $$2 = $$0.q();
      if (!$$2.a_($$1).a(dfk.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, avh.on, avi.h, 1.0F, 1.0F);
         cml $$3 = $$0.o();
         cud $$4 = $$0.n();
         boolean $$5 = !$$3.fN() && $$4.H() == 1;
         cxa $$6 = new cxa(Optional.of(ji.a($$2.af(), $$1)), true);
         if ($$5) {
            $$4.b(kn.S, $$6);
         } else {
            cud $$7 = $$4.a(cug.qS, 1);
            $$4.a(1, $$3);
            $$7.b(kn.S, $$6);
            if (!$$3.ga().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bqh.a($$2.B);
      }
   }

   @Override
   public String h(cud $$0) {
      return $$0.b(kn.S) ? "item.minecraft.lodestone_compass" : super.h($$0);
   }
}
