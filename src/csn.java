import java.util.Optional;
import javax.annotation.Nullable;

public class csn extends cuc {
   public csn(cuc.a $$0) {
      super($$0);
   }

   @Nullable
   public static iz a(dca $$0) {
      return $$0.E_().j() ? iz.a($$0.af(), $$0.V()) : null;
   }

   @Override
   public boolean d_(cuh $$0) {
      return $$0.b(ke.R) || super.d_($$0);
   }

   @Override
   public void a(cuh $$0, dca $$1, brv $$2, int $$3, boolean $$4) {
      if ($$1 instanceof aqt $$5) {
         cxo $$6 = $$0.a(ke.R);
         if ($$6 != null) {
            cxo $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(ke.R, $$7);
            }
         }
      }
   }

   @Override
   public bqa a(cyf $$0) {
      ir $$1 = $$0.a();
      dca $$2 = $$0.q();
      if (!$$2.a_($$1).a(dfe.qB)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, avo.oD, avq.h, 1.0F, 1.0F);
         cly $$3 = $$0.o();
         cuh $$4 = $$0.n();
         boolean $$5 = !$$3.fY() && $$4.G() == 1;
         cxo $$6 = new cxo(Optional.of(iz.a($$2.af(), $$1)), true);
         if ($$5) {
            $$4.b(ke.R, $$6);
         } else {
            cuh $$7 = $$4.a(cuk.sp, 1);
            $$4.a(1, $$3);
            $$7.b(ke.R, $$6);
            if (!$$3.gl().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bqa.a($$2.C);
      }
   }

   @Override
   public String i(cuh $$0) {
      return $$0.b(ke.R) ? "item.minecraft.lodestone_compass" : super.i($$0);
   }
}
