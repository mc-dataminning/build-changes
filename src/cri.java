import java.util.Optional;
import javax.annotation.Nullable;

public class cri extends csu {
   public cri(csu.a $$0) {
      super($$0);
   }

   @Nullable
   public static iv a(dad $$0) {
      return $$0.D_().j() ? iv.a($$0.ae(), $$0.U()) : null;
   }

   @Override
   public boolean d_(csz $$0) {
      return $$0.b(ka.P) || super.d_($$0);
   }

   @Override
   public void a(csz $$0, dad $$1, brh $$2, int $$3, boolean $$4) {
      if ($$1 instanceof aqh $$5) {
         cvv $$6 = $$0.a(ka.P);
         if ($$6 != null) {
            cvv $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(ka.P, $$7);
            }
         }
      }
   }

   @Override
   public bpm a(cwk $$0) {
      in $$1 = $$0.a();
      dad $$2 = $$0.q();
      if (!$$2.a_($$1).a(ddg.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, avc.od, avd.h, 1.0F, 1.0F);
         clh $$3 = $$0.o();
         csz $$4 = $$0.n();
         boolean $$5 = !$$3.fN() && $$4.G() == 1;
         cvv $$6 = new cvv(Optional.of(iv.a($$2.ae(), $$1)), true);
         if ($$5) {
            $$4.b(ka.P, $$6);
         } else {
            csz $$7 = $$4.a(ctc.qS, 1);
            $$4.a(1, $$3);
            $$7.b(ka.P, $$6);
            if (!$$3.ga().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bpm.a($$2.B);
      }
   }

   @Override
   public String i(csz $$0) {
      return $$0.b(ka.P) ? "item.minecraft.lodestone_compass" : super.i($$0);
   }
}
