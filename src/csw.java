import java.util.Optional;
import javax.annotation.Nullable;

public class csw extends cuj {
   public csw(cuj.a $$0) {
      super($$0);
   }

   @Nullable
   public static jl a(dcu $$0) {
      return $$0.D_().j() ? jl.a($$0.af(), $$0.V()) : null;
   }

   @Override
   public boolean d_(cuo $$0) {
      return $$0.b(kq.T) || super.d_($$0);
   }

   @Override
   public void a(cuo $$0, dcu $$1, bsq $$2, int $$3, boolean $$4) {
      if ($$1 instanceof aqt $$5) {
         cxo $$6 = $$0.a(kq.T);
         if ($$6 != null) {
            cxo $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kq.T, $$7);
            }
         }
      }
   }

   @Override
   public bqq a(cyd $$0) {
      jd $$1 = $$0.a();
      dcu $$2 = $$0.q();
      if (!$$2.a_($$1).a(dfy.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, avo.on, avp.h, 1.0F, 1.0F);
         cmv $$3 = $$0.o();
         cuo $$4 = $$0.n();
         boolean $$5 = !$$3.fM() && $$4.H() == 1;
         cxo $$6 = new cxo(Optional.of(jl.a($$2.af(), $$1)), true);
         if ($$5) {
            $$4.b(kq.T, $$6);
         } else {
            cuo $$7 = $$4.a(cur.qS, 1);
            $$4.a(1, $$3);
            $$7.b(kq.T, $$6);
            if (!$$3.fZ().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bqq.a($$2.B);
      }
   }

   @Override
   public String h(cuo $$0) {
      return $$0.b(kq.T) ? "item.minecraft.lodestone_compass" : super.h($$0);
   }
}
