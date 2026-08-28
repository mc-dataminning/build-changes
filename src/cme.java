import javax.annotation.Nullable;

public abstract class cme extends ckv {
   protected static final akg<Boolean> b = akk.a(cme.class, aki.k);
   protected static final int c = 300;
   protected int d;

   public cme(btq<? extends cme> $$0, dds $$1) {
      super($$0, $$1);
      this.a_(true);
      this.y();
      this.a(eqs.n, 16.0F);
      this.a(eqs.o, -1.0F);
   }

   private void y() {
      if (cfa.a(this)) {
         ((cdp)this.P()).b(true);
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
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (this.t()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void ad() {
      super.ad();
      if (this.go()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gs();
         this.a((arg)this.dS());
      }
   }

   public boolean go() {
      return !this.dS().B_().b() && !this.t() && !this.gd();
   }

   protected void a(arg $$0) {
      clq $$1 = this.a(btq.bx, true);
      if ($$1 != null) {
         $$1.b(new bsq(bss.i, 200, 0));
      }
   }

   public boolean gp() {
      return !this.o_();
   }

   public abstract cmh gq();

   @Nullable
   @Override
   public buf m() {
      return this.R();
   }

   protected boolean gr() {
      return this.eW().b(kr.x);
   }

   @Override
   public void U() {
      if (cmg.d(this)) {
         super.U();
      }
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   protected abstract void gs();
}
