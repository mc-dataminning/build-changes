import javax.annotation.Nullable;

public class cps extends coi {
   public cps(bxe<? extends cps> $$0, djz $$1) {
      super($$0, $$1);
      this.a(eyh.i, 8.0F);
   }

   @Override
   protected void D() {
      this.bG.a(3, new cgl<>(this, cqn.class, true));
      super.D();
   }

   @Override
   protected awq u() {
      return awr.DH;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.DJ;
   }

   @Override
   protected awq l_() {
      return awr.DI;
   }

   @Override
   awq m() {
      return awr.DK;
   }

   @Override
   public axv<czw> Y() {
      return null;
   }

   @Override
   public boolean g(daa $$0) {
      return !$$0.a(axo.bY) && super.g($$0);
   }

   @Override
   protected void a(aru $$0, bvk $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof com $$4 && $$4.x()) {
         $$4.gu();
         this.a($$0, dae.vw);
      }
   }

   @Override
   protected void a(azz $$0, bur $$1) {
      this.a(bxf.a, new daa(dae.pF));
   }

   @Override
   protected void a(dkq $$0, azz $$1, bur $$2) {
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      byo $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bzc.c).a(4.0);
      this.n();
      return $$4;
   }

   @Override
   public boolean c(aru $$0, bwv $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bxw) {
            ((bxw)$$1).b(new bvz(bwb.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected csh a(daa $$0, float $$1, @Nullable daa $$2) {
      csh $$3 = super.a($$0, $$1, $$2);
      $$3.e(100.0F);
      return $$3;
   }

   @Override
   public boolean b(bvz $$0) {
      return $$0.a(bwb.t) ? false : super.b($$0);
   }
}
