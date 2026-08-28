import javax.annotation.Nullable;

public class clm extends ckd {
   public clm(btq<? extends clm> $$0, dds $$1) {
      super($$0, $$1);
      this.a(eqs.i, 8.0F);
   }

   @Override
   protected void D() {
      this.bU.a(3, new ccv<>(this, cme.class, true));
      super.D();
   }

   @Override
   protected awc w() {
      return awd.CJ;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.CL;
   }

   @Override
   protected awc n_() {
      return awd.CK;
   }

   @Override
   awc t() {
      return awd.CM;
   }

   @Override
   protected void a(arg $$0, bsb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof ckh $$4 && $$4.gq()) {
         $$4.gr();
         this.a((ddr)cvo.uo);
      }
   }

   @Override
   protected void a(azk $$0, bri $$1) {
      this.a(btr.a, new cvl(cvo.oS));
   }

   @Override
   protected void a(dei $$0, azk $$1, bri $$2) {
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      bux $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bvm.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean E(btj $$0) {
      if (!super.E($$0)) {
         return false;
      } else {
         if ($$0 instanceof buf) {
            ((buf)$$0).b(new bsq(bss.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cnw a(cvl $$0, float $$1, @Nullable cvl $$2) {
      cnw $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean c(bsq $$0) {
      return $$0.a(bss.t) ? false : super.c($$0);
   }
}
