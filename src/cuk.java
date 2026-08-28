import java.util.Optional;
import javax.annotation.Nullable;

public class cuk extends cvt {
   private static final xh a = xh.c("item.minecraft.lodestone_compass");

   public cuk(cvt.a $$0) {
      super($$0);
   }

   @Nullable
   public static jo a(dev $$0) {
      return $$0.D_().j() ? jo.a($$0.ag(), $$0.W()) : null;
   }

   @Override
   public boolean d_(cvx $$0) {
      return $$0.b(kt.ac) || super.d_($$0);
   }

   @Override
   public void a(cvx $$0, dev $$1, btz $$2, int $$3, boolean $$4) {
      if ($$1 instanceof arm $$5) {
         cyp $$6 = $$0.a(kt.ac);
         if ($$6 != null) {
            cyp $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kt.ac, $$7);
            }
         }
      }
   }

   @Override
   public bry a(czo $$0) {
      jg $$1 = $$0.a();
      dev $$2 = $$0.q();
      if (!$$2.a_($$1).a(dia.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awk.om, awl.h, 1.0F, 1.0F);
         coh $$3 = $$0.o();
         cvx $$4 = $$0.n();
         boolean $$5 = !$$3.fX() && $$4.L() == 1;
         cyp $$6 = new cyp(Optional.of(jo.a($$2.ag(), $$1)), true);
         if ($$5) {
            $$4.b(kt.ac, $$6);
         } else {
            cvx $$7 = $$4.a(cwb.qT, 1);
            $$4.a(1, $$3);
            $$7.b(kt.ac, $$6);
            if (!$$3.gk().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bry.a;
      }
   }

   @Override
   public xh c_(cvx $$0) {
      return $$0.b(kt.ac) ? a : super.c_($$0);
   }
}
