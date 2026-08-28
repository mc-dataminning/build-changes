import javax.annotation.Nullable;

public abstract class cmm extends cld {
   protected static final akh<Boolean> b = akl.a(cmm.class, akj.k);
   protected static final int c = 300;
   protected int d;

   public cmm(bty<? extends cmm> $$0, dej $$1) {
      super($$0, $$1);
      this.a_(true);
      this.y();
      this.a(erk.n, 16.0F);
      this.a(erk.o, -1.0F);
   }

   private void y() {
      if (cfi.a(this)) {
         ((cdx)this.P()).b(true);
      }
   }

   @Override
   protected abstract boolean q();

   public void x(boolean $$0) {
      this.at().a(b, $$0);
   }

   protected boolean t() {
      return this.at().a(b);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      if (this.t()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void ac() {
      super.ac();
      if (this.go()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gs();
         this.a((arj)this.dS());
      }
   }

   public boolean go() {
      return !this.dS().C_().b() && !this.t() && !this.gd();
   }

   protected void a(arj $$0) {
      cly $$1 = this.a(bty.bx, true);
      if ($$1 != null) {
         $$1.a(new bsy(bta.i, 200, 0));
      }
   }

   public boolean gp() {
      return !this.p_();
   }

   public abstract cmp gq();

   @Nullable
   @Override
   public bun m() {
      return this.R();
   }

   protected boolean gr() {
      return this.eW().b(ks.A);
   }

   @Override
   public void U() {
      if (cmo.d(this)) {
         super.U();
      }
   }

   @Override
   protected void ab() {
      super.ab();
      ago.a(this);
   }

   protected abstract void gs();
}
