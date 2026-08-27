import java.util.Optional;
import javax.annotation.Nullable;

public class crz extends ctl {
   public crz(ctl.a $$0) {
      super($$0);
   }

   @Nullable
   public static iw a(daz $$0) {
      return $$0.D_().j() ? iw.a($$0.ae(), $$0.U()) : null;
   }

   @Override
   public boolean d_(ctq $$0) {
      return $$0.b(kb.R) || super.d_($$0);
   }

   @Override
   public void a(ctq $$0, daz $$1, brw $$2, int $$3, boolean $$4) {
      if ($$1 instanceof aqn $$5) {
         cwo $$6 = $$0.a(kb.R);
         if ($$6 != null) {
            cwo $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kb.R, $$7);
            }
         }
      }
   }

   @Override
   public bpw a(cxd $$0) {
      io $$1 = $$0.a();
      daz $$2 = $$0.q();
      if (!$$2.a_($$1).a(dec.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, avi.on, avj.h, 1.0F, 1.0F);
         cly $$3 = $$0.o();
         ctq $$4 = $$0.n();
         boolean $$5 = !$$3.fP() && $$4.I() == 1;
         cwo $$6 = new cwo(Optional.of(iw.a($$2.ae(), $$1)), true);
         if ($$5) {
            $$4.b(kb.R, $$6);
         } else {
            ctq $$7 = $$4.a(ctt.qS, 1);
            $$4.a(1, $$3);
            $$7.b(kb.R, $$6);
            if (!$$3.gc().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bpw.a($$2.B);
      }
   }

   @Override
   public String i(ctq $$0) {
      return $$0.b(kb.R) ? "item.minecraft.lodestone_compass" : super.i($$0);
   }
}
