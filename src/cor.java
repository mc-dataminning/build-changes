import javax.annotation.Nullable;

public class cor extends cnh {
   public cor(bwm<? extends cor> $$0, div $$1) {
      super($$0, $$1);
      this.a(ewx.i, 8.0F);
   }

   @Override
   protected void D() {
      this.bD.a(3, new cfr<>(this, cpm.class, true));
      super.D();
   }

   @Override
   protected awm u() {
      return awn.DE;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.DG;
   }

   @Override
   protected awm l_() {
      return awn.DF;
   }

   @Override
   awm m() {
      return awn.DH;
   }

   @Override
   public axr<cyu> Y() {
      return null;
   }

   @Override
   public boolean h(cyy $$0) {
      return !$$0.a(axk.bW) && super.h($$0);
   }

   @Override
   protected void a(arq $$0, bus $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cnl $$4 && $$4.x()) {
         $$4.gq();
         this.a($$0, czc.vr);
      }
   }

   @Override
   protected void a(azv $$0, btz $$1) {
      this.a(bwn.a, new cyy(czc.pC));
   }

   @Override
   protected void a(djm $$0, azv $$1, btz $$2) {
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      bxu $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(byi.c).a(4.0);
      this.n();
      return $$4;
   }

   @Override
   public boolean c(arq $$0, bwd $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bxc) {
            ((bxc)$$1).b(new bvh(bvj.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected crf a(cyy $$0, float $$1, @Nullable cyy $$2) {
      crf $$3 = super.a($$0, $$1, $$2);
      $$3.e(100.0F);
      return $$3;
   }

   @Override
   public boolean b(bvh $$0) {
      return $$0.a(bvj.t) ? false : super.b($$0);
   }
}
