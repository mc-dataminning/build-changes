import java.util.Optional;
import javax.annotation.Nullable;

public class cqm extends cry {
   public cqm(cry.a $$0) {
      super($$0);
   }

   @Nullable
   public static iu a(czu $$0) {
      return $$0.D_().j() ? iu.a($$0.ae(), $$0.U()) : null;
   }

   @Override
   public boolean d_(csd $$0) {
      return $$0.b(jz.I) || super.d_($$0);
   }

   @Override
   public void a(csd $$0, czu $$1, bql $$2, int $$3, boolean $$4) {
      if ($$1 instanceof aqe $$5) {
         cuz $$6 = $$0.a(jz.I);
         if ($$6 != null) {
            cuz $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(jz.I, $$7);
            }
         }
      }
   }

   @Override
   public boq a(cvn $$0) {
      im $$1 = $$0.a();
      czu $$2 = $$0.q();
      if (!$$2.a_($$1).a(dcx.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, auz.od, ava.h, 1.0F, 1.0F);
         ckl $$3 = $$0.o();
         csd $$4 = $$0.n();
         boolean $$5 = !$$3.fN() && $$4.G() == 1;
         cuz $$6 = new cuz(Optional.of(iu.a($$2.ae(), $$1)), true);
         if ($$5) {
            $$4.b(jz.I, $$6);
         } else {
            csd $$7 = $$4.a(csg.qS, 1);
            $$4.a(1, $$3);
            $$7.b(jz.I, $$6);
            if (!$$3.ga().e($$7)) {
               $$3.a($$7, false);
            }
         }

         return boq.a($$2.B);
      }
   }

   @Override
   public String i(csd $$0) {
      return $$0.b(jz.I) ? "item.minecraft.lodestone_compass" : super.i($$0);
   }
}
