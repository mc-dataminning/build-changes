import javax.annotation.Nullable;

public class czr extends crf {
   protected czr(dex.d $$0) {
      super($$0);
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return a($$0, $$2, dcm.B);
   }

   @Override
   protected void a(cpk $$0, gv $$1, cbl $$2) {
      dck $$3 = $$0.c_($$1);
      if ($$3 instanceof ddv) {
         $$2.a((bgr)$$3);
         $$2.a(ape.at);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aou.wx, aov.e, 1.0F, 1.0F, false);
         }

         $$1.a(iw.Z, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
