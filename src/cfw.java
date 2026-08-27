import javax.annotation.Nullable;

public class cfw extends cey implements cfg {
   public cfw(blj<? extends cfw> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cfw(blj<? extends cfw> $$0, ccv $$1, csy $$2) {
      super($$0, $$1.dr(), $$1.gf(), $$1.dx(), $$2);
      this.b($$1);
   }

   @Override
   public boolean h(blf $$0) {
      return $$0 instanceof cfw ? false : super.h($$0);
   }

   @Override
   protected boolean a(blf $$0) {
      return $$0 instanceof cfw ? false : super.a($$0);
   }

   @Override
   protected void a(eky $$0) {
      super.a($$0);
      if (!this.dM().B) {
         $$0.a().a(this.dN().a(this, this.w() instanceof blv $$1 ? $$1 : null), 1.0F);
         this.y();
      }
   }

   private void y() {
      this.dM().a(this, null, null, this.dr(), this.dt(), this.dx(), (float)(3.0 + this.ag.j()), false, csy.a.e, jv.y, jv.z, arc.Be);
   }

   @Override
   protected void a(ekx $$0) {
      super.a($$0);
      this.y();
      this.am();
   }

   @Override
   protected void a(ekz $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.am();
      }
   }

   @Override
   protected boolean s() {
      return false;
   }

   @Override
   public cmh q() {
      return cmh.f;
   }

   @Override
   protected float x() {
      return 1.0F;
   }

   @Nullable
   @Override
   protected jt u() {
      return null;
   }

   @Override
   protected csh.a ag_() {
      return csh.a.b;
   }
}
