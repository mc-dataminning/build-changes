import javax.annotation.Nullable;

public class cpf extends cnv {
   public cpf(bwr<? extends cpf> $$0, djm $$1) {
      super($$0, $$1);
      this.a(exr.i, 8.0F);
   }

   @Override
   protected void D() {
      this.bE.a(3, new cfy<>(this, cqa.class, true));
      super.D();
   }

   @Override
   protected awm u() {
      return awn.DH;
   }

   @Override
   protected awm e(bux $$0) {
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
   public axr<czj> Y() {
      return null;
   }

   @Override
   public boolean g(czn $$0) {
      return !$$0.a(axk.bX) && super.g($$0);
   }

   @Override
   protected void a(arq $$0, bux $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cnz $$4 && $$4.x()) {
         $$4.gt();
         this.a($$0, czr.vw);
      }
   }

   @Override
   protected void a(azv $$0, bue $$1) {
      this.a(bws.a, new czn(czr.pF));
   }

   @Override
   protected void a(dkd $$0, azv $$1, bue $$2) {
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      byb $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(byp.c).a(4.0);
      this.n();
      return $$4;
   }

   @Override
   public boolean c(arq $$0, bwi $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bxj) {
            ((bxj)$$1).b(new bvm(bvo.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cru a(czn $$0, float $$1, @Nullable czn $$2) {
      cru $$3 = super.a($$0, $$1, $$2);
      $$3.e(100.0F);
      return $$3;
   }

   @Override
   public boolean b(bvm $$0) {
      return $$0.a(bvo.t) ? false : super.b($$0);
   }
}
