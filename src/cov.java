import javax.annotation.Nullable;

public class cov extends cnl {
   public cov(bwo<? extends cov> $$0, dja $$1) {
      super($$0, $$1);
      this.a(exf.i, 8.0F);
   }

   @Override
   protected void D() {
      this.bE.a(3, new cft<>(this, cpq.class, true));
      super.D();
   }

   @Override
   protected awm u() {
      return awn.DH;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.DJ;
   }

   @Override
   protected awm l_() {
      return awn.DI;
   }

   @Override
   awm m() {
      return awn.DK;
   }

   @Override
   public axr<cyz> Y() {
      return null;
   }

   @Override
   public boolean g(czd $$0) {
      return !$$0.a(axk.bX) && super.g($$0);
   }

   @Override
   protected void a(arq $$0, buu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cnp $$4 && $$4.x()) {
         $$4.gr();
         this.a($$0, czh.vw);
      }
   }

   @Override
   protected void a(azv $$0, bub $$1) {
      this.a(bwp.a, new czd(czh.pF));
   }

   @Override
   protected void a(djr $$0, azv $$1, bub $$2) {
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      bxw $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(byk.c).a(4.0);
      this.n();
      return $$4;
   }

   @Override
   public boolean c(arq $$0, bwf $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bxe) {
            ((bxe)$$1).b(new bvj(bvl.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected crk a(czd $$0, float $$1, @Nullable czd $$2) {
      crk $$3 = super.a($$0, $$1, $$2);
      $$3.e(100.0F);
      return $$3;
   }

   @Override
   public boolean b(bvj $$0) {
      return $$0.a(bvl.t) ? false : super.b($$0);
   }
}
