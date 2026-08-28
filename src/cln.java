import javax.annotation.Nullable;

public abstract class cln extends cke {
   protected static final akk<Boolean> b = ako.a(cln.class, akm.k);
   protected static final int c = 300;
   protected int d;

   public cln(btb<? extends cln> $$0, dbz $$1) {
      super($$0, $$1);
      this.a_(true);
      this.y();
      this.a(eon.n, 16.0F);
      this.a(eon.o, -1.0F);
   }

   private void y() {
      if (cem.a(this)) {
         ((cdb)this.K()).b(true);
      }
   }

   protected abstract boolean s();

   public void w(boolean $$0) {
      this.ap().a(b, $$0);
   }

   protected boolean u() {
      return this.ap().a(b);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      if (this.u()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void Z() {
      super.Z();
      if (this.gq()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gu();
         this.c((arf)this.dP());
      }
   }

   public boolean gq() {
      return !this.dP().D_().b() && !this.u() && !this.gg();
   }

   protected void c(arf $$0) {
      ckz $$1 = this.a(btb.bx, true);
      if ($$1 != null) {
         $$1.b(new bsd(bsf.i, 200, 0));
      }
   }

   public boolean gr() {
      return !this.p_();
   }

   public abstract clq gs();

   @Nullable
   @Override
   public btq p() {
      return this.N();
   }

   protected boolean gt() {
      return this.eX().g() instanceof cwg;
   }

   @Override
   public void Q() {
      if (clp.d(this)) {
         super.Q();
      }
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   protected abstract void gu();
}
