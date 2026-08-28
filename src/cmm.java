import javax.annotation.Nullable;

public class cmm extends cld {
   public cmm(bup<? extends cmm> $$0, dff $$1) {
      super($$0, $$1);
      this.a(esf.i, 8.0F);
   }

   @Override
   protected void D() {
      this.bT.a(3, new cdv<>(this, cne.class, true));
      super.D();
   }

   @Override
   protected awn w() {
      return awo.CH;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.CJ;
   }

   @Override
   protected awn o_() {
      return awo.CI;
   }

   @Override
   awn t() {
      return awo.CK;
   }

   @Override
   protected void a(arq $$0, bsy $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof clh $$4 && $$4.gx()) {
         $$4.gy();
         this.a((dfe)cwj.uE);
      }
   }

   @Override
   protected void a(azv $$0, bsf $$1) {
      this.a(buq.a, new cwf(cwj.oS));
   }

   @Override
   protected void a(dfw $$0, azv $$1, bsf $$2) {
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      bvx $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bwm.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean E(bui $$0) {
      if (!super.E($$0)) {
         return false;
      } else {
         if ($$0 instanceof bve) {
            ((bve)$$0).b(new btn(btp.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected coy a(cwf $$0, float $$1, @Nullable cwf $$2) {
      coy $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean b(btn $$0) {
      return $$0.a(btp.t) ? false : super.b($$0);
   }
}
