import javax.annotation.Nullable;

public abstract class cmj extends cla {
   protected static final akg<Boolean> b = akk.a(cmj.class, aki.k);
   protected static final int c = 300;
   protected int d;

   public cmj(btv<? extends cmj> $$0, deg $$1) {
      super($$0, $$1);
      this.a_(true);
      this.y();
      this.a(erg.n, 16.0F);
      this.a(erg.o, -1.0F);
   }

   private void y() {
      if (cff.a(this)) {
         ((cdu)this.P()).b(true);
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
      if (this.gp()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gt();
         this.a((arh)this.dS());
      }
   }

   public boolean gp() {
      return !this.dS().B_().b() && !this.t() && !this.ge();
   }

   protected void a(arh $$0) {
      clv $$1 = this.a(btv.bx, true);
      if ($$1 != null) {
         $$1.a(new bsv(bsx.i, 200, 0));
      }
   }

   public boolean gq() {
      return !this.o_();
   }

   public abstract cmm gr();

   @Nullable
   @Override
   public buk m() {
      return this.R();
   }

   protected boolean gs() {
      return this.eW().b(kr.A);
   }

   @Override
   public void U() {
      if (cml.d(this)) {
         super.U();
      }
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   protected abstract void gt();
}
