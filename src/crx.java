import java.util.Optional;
import javax.annotation.Nullable;

public class crx extends ctj {
   public crx(ctj.a $$0) {
      super($$0);
   }

   @Nullable
   public static iw a(dax $$0) {
      return $$0.D_().j() ? iw.a($$0.ae(), $$0.U()) : null;
   }

   @Override
   public boolean d_(cto $$0) {
      return $$0.b(kb.R) || super.d_($$0);
   }

   @Override
   public void a(cto $$0, dax $$1, bru $$2, int $$3, boolean $$4) {
      if ($$1 instanceof aqm $$5) {
         cwm $$6 = $$0.a(kb.R);
         if ($$6 != null) {
            cwm $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kb.R, $$7);
            }
         }
      }
   }

   @Override
   public bpu a(cxb $$0) {
      io $$1 = $$0.a();
      dax $$2 = $$0.q();
      if (!$$2.a_($$1).a(dea.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, avh.on, avi.h, 1.0F, 1.0F);
         clw $$3 = $$0.o();
         cto $$4 = $$0.n();
         boolean $$5 = !$$3.fP() && $$4.I() == 1;
         cwm $$6 = new cwm(Optional.of(iw.a($$2.ae(), $$1)), true);
         if ($$5) {
            $$4.b(kb.R, $$6);
         } else {
            cto $$7 = $$4.a(ctr.qS, 1);
            $$4.a(1, $$3);
            $$7.b(kb.R, $$6);
            if (!$$3.gc().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bpu.a($$2.B);
      }
   }

   @Override
   public String i(cto $$0) {
      return $$0.b(kb.R) ? "item.minecraft.lodestone_compass" : super.i($$0);
   }
}
