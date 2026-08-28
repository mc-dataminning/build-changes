import javax.annotation.Nullable;

public class clr extends cki {
   public clr(btv<? extends clr> $$0, deg $$1) {
      super($$0, $$1);
      this.a(erg.i, 8.0F);
   }

   @Override
   protected void D() {
      this.bT.a(3, new cda<>(this, cmj.class, true));
      super.D();
   }

   @Override
   protected awd w() {
      return awe.CJ;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.CL;
   }

   @Override
   protected awd n_() {
      return awe.CK;
   }

   @Override
   awd t() {
      return awe.CM;
   }

   @Override
   protected void a(arh $$0, bsg $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof ckm $$4 && $$4.gr()) {
         $$4.gs();
         this.a((def)cvt.uo);
      }
   }

   @Override
   protected void a(azl $$0, brn $$1) {
      this.a(btw.a, new cvp(cvt.oS));
   }

   @Override
   protected void a(dew $$0, azl $$1, brn $$2) {
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      bvc $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bvr.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean E(bto $$0) {
      if (!super.E($$0)) {
         return false;
      } else {
         if ($$0 instanceof buk) {
            ((buk)$$0).b(new bsv(bsx.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cob a(cvp $$0, float $$1, @Nullable cvp $$2) {
      cob $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean b(bsv $$0) {
      return $$0.a(bsx.t) ? false : super.b($$0);
   }
}
