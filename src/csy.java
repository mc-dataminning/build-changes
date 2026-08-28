import java.util.Optional;
import javax.annotation.Nullable;

public class csy extends cul {
   public csy(cul.a $$0) {
      super($$0);
   }

   @Nullable
   public static jl a(dcw $$0) {
      return $$0.D_().j() ? jl.a($$0.af(), $$0.V()) : null;
   }

   @Override
   public boolean d_(cuq $$0) {
      return $$0.b(kq.T) || super.d_($$0);
   }

   @Override
   public void a(cuq $$0, dcw $$1, bsr $$2, int $$3, boolean $$4) {
      if ($$1 instanceof aqu $$5) {
         cxq $$6 = $$0.a(kq.T);
         if ($$6 != null) {
            cxq $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kq.T, $$7);
            }
         }
      }
   }

   @Override
   public bqr a(cyf $$0) {
      jd $$1 = $$0.a();
      dcw $$2 = $$0.q();
      if (!$$2.a_($$1).a(dga.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, avp.on, avq.h, 1.0F, 1.0F);
         cmx $$3 = $$0.o();
         cuq $$4 = $$0.n();
         boolean $$5 = !$$3.fL() && $$4.H() == 1;
         cxq $$6 = new cxq(Optional.of(jl.a($$2.af(), $$1)), true);
         if ($$5) {
            $$4.b(kq.T, $$6);
         } else {
            cuq $$7 = $$4.a(cut.qS, 1);
            $$4.a(1, $$3);
            $$7.b(kq.T, $$6);
            if (!$$3.fY().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bqr.a($$2.B);
      }
   }

   @Override
   public String h(cuq $$0) {
      return $$0.b(kq.T) ? "item.minecraft.lodestone_compass" : super.h($$0);
   }
}
