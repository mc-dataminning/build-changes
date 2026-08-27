import java.util.Optional;
import javax.annotation.Nullable;

public class cqb extends crn {
   public cqb(crn.a $$0) {
      super($$0);
   }

   @Nullable
   public static im a(czg $$0) {
      return $$0.D_().j() ? im.a($$0.ae(), $$0.U()) : null;
   }

   @Override
   public boolean d_(crs $$0) {
      return $$0.b(jr.I) || super.d_($$0);
   }

   @Override
   public void a(crs $$0, czg $$1, bqa $$2, int $$3, boolean $$4) {
      if ($$1 instanceof apu $$5) {
         cul $$6 = $$0.a(jr.I);
         if ($$6 != null) {
            cul $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(jr.I, $$7);
            }
         }
      }
   }

   @Override
   public bof a(cuz $$0) {
      id $$1 = $$0.a();
      czg $$2 = $$0.q();
      if (!$$2.a_($$1).a(dcj.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, auo.nY, aup.h, 1.0F, 1.0F);
         cka $$3 = $$0.o();
         crs $$4 = $$0.n();
         boolean $$5 = !$$3.fM() && $$4.G() == 1;
         cul $$6 = new cul(Optional.of(im.a($$2.ae(), $$1)), true);
         if ($$5) {
            $$4.b(jr.I, $$6);
         } else {
            crs $$7 = $$4.a(crv.qR, 1);
            $$4.a(1, $$3);
            $$7.b(jr.I, $$6);
            if (!$$3.fZ().e($$7)) {
               $$3.a($$7, false);
            }
         }

         return bof.a($$2.B);
      }
   }

   @Override
   public String i(crs $$0) {
      return $$0.b(jr.I) ? "item.minecraft.lodestone_compass" : super.i($$0);
   }
}
