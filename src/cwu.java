import javax.annotation.Nullable;

public class cwu extends coh {
   protected cwu(dca.d $$0) {
      super($$0);
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new day($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return a($$0, $$2, czp.B);
   }

   @Override
   protected void a(cmm $$0, gu $$1, byo $$2) {
      czn $$3 = $$0.c_($$1);
      if ($$3 instanceof day) {
         $$2.a((bea)$$3);
         $$2.a(amr.at);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, amh.wx, ami.e, 1.0F, 1.0F, false);
         }

         $$1.a(iv.Z, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
