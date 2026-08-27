import javax.annotation.Nullable;

public class czt extends crh {
   protected czt(dez.d $$0) {
      super($$0);
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new ddx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return a($$0, $$2, dco.B);
   }

   @Override
   protected void a(cpm $$0, gu $$1, cbn $$2) {
      dcm $$3 = $$0.c_($$1);
      if ($$3 instanceof ddx) {
         $$2.a((bgt)$$3);
         $$2.a(apg.at);
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aow.wx, aox.e, 1.0F, 1.0F, false);
         }

         $$1.a(iv.Z, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
