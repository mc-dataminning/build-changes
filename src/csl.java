import java.util.Optional;
import javax.annotation.Nullable;

public class csl extends ctx {
   public csl(ctx.a $$0) {
      super($$0);
   }

   @Nullable
   public static ji a(dcf $$0) {
      return $$0.D_().j() ? ji.a($$0.af(), $$0.V()) : null;
   }

   @Override
   public boolean d_(cuc $$0) {
      return $$0.b(kn.S) || super.d_($$0);
   }

   @Override
   public void a(cuc $$0, dcf $$1, bsg $$2, int $$3, boolean $$4) {
      if ($$1 instanceof aqm $$5) {
         cwz $$6 = $$0.a(kn.S);
         if ($$6 != null) {
            cwz $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kn.S, $$7);
            }
         }
      }
   }

   @Override
   public bqg a(cxo $$0) {
      ja $$1 = $$0.a();
      dcf $$2 = $$0.q();
      if (!$$2.a_($$1).a(dfj.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, avh.on, avi.h, 1.0F, 1.0F);
         cmk $$3 = $$0.o();
         cuc $$4 = $$0.n();
         boolean $$5 = !$$3.fM() && $$4.H() == 1;
         cwz $$6 = new cwz(Optional.of(ji.a($$2.af(), $$1)), true);
         if ($$5) {
            $$4.b(kn.S, $$6);
         } else {
            cuc $$7 = $$4.a(cuf.qS, 1);
            $$4.a(1, $$3);
            $$7.b(kn.S, $$6);
            if (!$$3.fZ().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bqg.a($$2.B);
      }
   }

   @Override
   public String h(cuc $$0) {
      return $$0.b(kn.S) ? "item.minecraft.lodestone_compass" : super.h($$0);
   }
}
