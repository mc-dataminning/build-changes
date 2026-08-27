import javax.annotation.Nullable;

public abstract class cii extends cgz {
   protected static final aiy<Boolean> b = ajc.a(cii.class, aja.k);
   protected static final int c = 300;
   protected int d;

   public cii(bqb<? extends cii> $$0, cyx $$1) {
      super($$0, $$1);
      this.s(true);
      this.y();
      this.a(elj.n, 16.0F);
      this.a(elj.o, -1.0F);
   }

   private void y() {
      if (cbj.a(this)) {
         ((bzy)this.K()).b(true);
      }
   }

   protected abstract boolean r();

   public void w(boolean $$0) {
      this.an().a(b, $$0);
   }

   protected boolean u() {
      return this.an().a(b);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      if (this.u()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void Y() {
      super.Y();
      if (this.gn()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gr();
         this.c((aps)this.dM());
      }
   }

   public boolean gn() {
      return !this.dM().D_().b() && !this.u() && !this.gd();
   }

   protected void c(aps $$0) {
      chu $$1 = this.a(bqb.bw, true);
      if ($$1 != null) {
         $$1.b(new bph(bpj.i, 200, 0));
      }
   }

   public boolean go() {
      return !this.p_();
   }

   public abstract cil gp();

   @Nullable
   @Override
   public bqo p() {
      return this.bC.c(bzr.o).orElse(null);
   }

   protected boolean gq() {
      return this.eU().f() instanceof csw;
   }

   @Override
   public void P() {
      if (cik.d(this)) {
         super.P();
      }
   }

   @Override
   protected void X() {
      super.X();
      afi.a(this);
   }

   protected abstract void gr();
}
