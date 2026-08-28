import javax.annotation.Nullable;

public class cmi extends ckz {
   public cmi(bul<? extends cmi> $$0, dfb $$1) {
      super($$0, $$1);
      this.a(esb.i, 8.0F);
   }

   @Override
   protected void D() {
      this.bT.a(3, new cdr<>(this, cna.class, true));
      super.D();
   }

   @Override
   protected awk w() {
      return awl.CH;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.CJ;
   }

   @Override
   protected awk o_() {
      return awl.CI;
   }

   @Override
   awk t() {
      return awl.CK;
   }

   @Override
   protected void a(arn $$0, bsu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cld $$4 && $$4.gw()) {
         $$4.gx();
         this.a((dfa)cwf.uo);
      }
   }

   @Override
   protected void a(azs $$0, bsb $$1) {
      this.a(bum.a, new cwb(cwf.oS));
   }

   @Override
   protected void a(dfr $$0, azs $$1, bsb $$2) {
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      bvt $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bwi.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean E(bue $$0) {
      if (!super.E($$0)) {
         return false;
      } else {
         if ($$0 instanceof bva) {
            ((bva)$$0).b(new btj(btl.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cou a(cwb $$0, float $$1, @Nullable cwb $$2) {
      cou $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean b(btj $$0) {
      return $$0.a(btl.t) ? false : super.b($$0);
   }
}
