import javax.annotation.Nullable;

public class cbr extends caj {
   public cbr(bkm<? extends cbr> $$0, crs $$1) {
      super($$0, $$1);
      this.a(ecr.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bP.a(3, new btm<>(this, ccb.class, true));
      super.z();
   }

   @Override
   protected aqm w() {
      return aqn.At;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.Av;
   }

   @Override
   protected aqm m_() {
      return aqn.Au;
   }

   @Override
   aqm t() {
      return aqn.Aw;
   }

   @Override
   protected void a(bjg $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cam $$4 && $$4.gf()) {
         $$4.gg();
         this.a((crr)cle.tt);
      }
   }

   @Override
   protected void a(ato $$0, bio $$1) {
      this.a(bkn.a, new clb(cle.oc));
   }

   @Override
   protected void b(ato $$0, bio $$1) {
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      blr $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bme.c).a(4.0);
      this.y();
      return $$5;
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return 2.1F;
   }

   @Override
   protected float l(bki $$0) {
      return -0.875F;
   }

   @Override
   public boolean C(bki $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bky) {
            ((bky)$$0).b(new bjv(bjx.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cds b(clb $$0, float $$1) {
      cds $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bjv $$0) {
      return $$0.c() == bjx.t ? false : super.c($$0);
   }
}
