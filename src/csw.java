import java.util.Optional;
import javax.annotation.Nullable;

public class csw extends cui {
   public csw(cui.a $$0) {
      super($$0);
   }

   @Nullable
   public static jh a(dbw $$0) {
      return $$0.D_().j() ? jh.a($$0.af(), $$0.V()) : null;
   }

   @Override
   public boolean d_(cun $$0) {
      return $$0.b(km.R) || super.d_($$0);
   }

   @Override
   public void a(cun $$0, dbw $$1, bss $$2, int $$3, boolean $$4) {
      if ($$1 instanceof are $$5) {
         cxl $$6 = $$0.a(km.R);
         if ($$6 != null) {
            cxl $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(km.R, $$7);
            }
         }
      }
   }

   @Override
   public bqs a(cya $$0) {
      iz $$1 = $$0.a();
      dbw $$2 = $$0.q();
      if (!$$2.a_($$1).a(dez.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, avz.on, awa.h, 1.0F, 1.0F);
         cmv $$3 = $$0.o();
         cun $$4 = $$0.n();
         boolean $$5 = !$$3.fP() && $$4.I() == 1;
         cxl $$6 = new cxl(Optional.of(jh.a($$2.af(), $$1)), true);
         if ($$5) {
            $$4.b(km.R, $$6);
         } else {
            cun $$7 = $$4.a(cuq.qS, 1);
            $$4.a(1, $$3);
            $$7.b(km.R, $$6);
            if (!$$3.gc().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bqs.a($$2.B);
      }
   }

   @Override
   public String i(cun $$0) {
      return $$0.b(km.R) ? "item.minecraft.lodestone_compass" : super.i($$0);
   }
}
