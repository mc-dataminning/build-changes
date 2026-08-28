import javax.annotation.Nullable;

public class cmd extends cku {
   public cmd(bug<? extends cmd> $$0, dev $$1) {
      super($$0, $$1);
      this.a(erv.i, 8.0F);
   }

   @Override
   protected void D() {
      this.bT.a(3, new cdm<>(this, cmv.class, true));
      super.D();
   }

   @Override
   protected awj w() {
      return awk.CH;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.CJ;
   }

   @Override
   protected awj o_() {
      return awk.CI;
   }

   @Override
   awj t() {
      return awk.CK;
   }

   @Override
   protected void a(arm $$0, bsp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cky $$4 && $$4.gx()) {
         $$4.gy();
         this.a((deu)cwb.uo);
      }
   }

   @Override
   protected void a(azr $$0, brw $$1) {
      this.a(buh.a, new cvx(cwb.oS));
   }

   @Override
   protected void a(dfl $$0, azr $$1, brw $$2) {
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      bvo $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bwd.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean E(btz $$0) {
      if (!super.E($$0)) {
         return false;
      } else {
         if ($$0 instanceof buv) {
            ((buv)$$0).b(new bte(btg.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cop a(cvx $$0, float $$1, @Nullable cvx $$2) {
      cop $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean b(bte $$0) {
      return $$0.a(btg.t) ? false : super.b($$0);
   }
}
