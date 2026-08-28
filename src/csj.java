import java.util.Optional;
import javax.annotation.Nullable;

public class csj extends ctv {
   public csj(ctv.a $$0) {
      super($$0);
   }

   @Nullable
   public static ji a(dcd $$0) {
      return $$0.D_().j() ? ji.a($$0.af(), $$0.V()) : null;
   }

   @Override
   public boolean d_(cua $$0) {
      return $$0.b(kn.S) || super.d_($$0);
   }

   @Override
   public void a(cua $$0, dcd $$1, bsd $$2, int $$3, boolean $$4) {
      if ($$1 instanceof aqk $$5) {
         cwx $$6 = $$0.a(kn.S);
         if ($$6 != null) {
            cwx $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kn.S, $$7);
            }
         }
      }
   }

   @Override
   public bqd a(cxm $$0) {
      ja $$1 = $$0.a();
      dcd $$2 = $$0.q();
      if (!$$2.a_($$1).a(dfh.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, avf.on, avg.h, 1.0F, 1.0F);
         cmh $$3 = $$0.o();
         cua $$4 = $$0.n();
         boolean $$5 = !$$3.fL() && $$4.H() == 1;
         cwx $$6 = new cwx(Optional.of(ji.a($$2.af(), $$1)), true);
         if ($$5) {
            $$4.b(kn.S, $$6);
         } else {
            cua $$7 = $$4.a(cud.qS, 1);
            $$4.a(1, $$3);
            $$7.b(kn.S, $$6);
            if (!$$3.fY().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bqd.a($$2.B);
      }
   }

   @Override
   public String h(cua $$0) {
      return $$0.b(kn.S) ? "item.minecraft.lodestone_compass" : super.h($$0);
   }
}
