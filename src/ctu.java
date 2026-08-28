import java.util.Optional;
import javax.annotation.Nullable;

public class ctu extends cvg {
   public ctu(cvg.a $$0) {
      super($$0);
   }

   @Nullable
   public static jm a(dds $$0) {
      return $$0.B_().j() ? jm.a($$0.ag(), $$0.W()) : null;
   }

   @Override
   public boolean e_(cvl $$0) {
      return $$0.b(kr.V) || super.e_($$0);
   }

   @Override
   public void a(cvl $$0, dds $$1, btj $$2, int $$3, boolean $$4) {
      if ($$1 instanceof arg $$5) {
         cyj $$6 = $$0.a(kr.V);
         if ($$6 != null) {
            cyj $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kr.V, $$7);
            }
         }
      }
   }

   @Override
   public brk a(cyy $$0) {
      je $$1 = $$0.a();
      dds $$2 = $$0.q();
      if (!$$2.a_($$1).a(dgx.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awd.oo, awe.h, 1.0F, 1.0F);
         cnp $$3 = $$0.o();
         cvl $$4 = $$0.n();
         boolean $$5 = !$$3.fP() && $$4.J() == 1;
         cyj $$6 = new cyj(Optional.of(jm.a($$2.ag(), $$1)), true);
         if ($$5) {
            $$4.b(kr.V, $$6);
         } else {
            cvl $$7 = $$4.a(cvo.qT, 1);
            $$4.a(1, $$3);
            $$7.b(kr.V, $$6);
            if (!$$3.gc().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return brk.a;
      }
   }

   @Override
   public String d_(cvl $$0) {
      return $$0.b(kr.V) ? "item.minecraft.lodestone_compass" : super.d_($$0);
   }
}
