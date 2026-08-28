import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cpg extends cnt {
   protected static final akh<Boolean> a = akl.a(cpg.class, akj.k);
   public static final int b = 300;
   protected int c;

   public cpg(bwj<? extends cpg> $$0, dip $$1) {
      super($$0, $$1);
      this.a_(true);
      this.n();
      this.a(ewm.n, 16.0F);
      this.a(ewm.o, -1.0F);
   }

   private void n() {
      if (cht.a(this)) {
         ((cgi)this.O()).b(true);
      }
   }

   protected abstract boolean j();

   public void w(boolean $$0) {
      this.au().a(a, $$0);
   }

   protected boolean m() {
      return this.au().a(a);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.m()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.c);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.c = $$0.h("TimeInOverworld");
   }

   @Override
   protected void a(aro $$0) {
      super.a($$0);
      if (this.q()) {
         this.c++;
      } else {
         this.c = 0;
      }

      if (this.c > 300) {
         this.gr();
         this.g($$0);
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.c = $$0;
   }

   public boolean q() {
      return !this.dV().B_().b() && !this.m() && !this.gf();
   }

   protected void g(aro $$0) {
      this.a(bwj.bR, bvu.a(this, true, true), $$0x -> $$0x.a(new bve(bvg.i, 200, 0)));
   }

   public boolean t() {
      return !this.n_();
   }

   public abstract cpj x();

   @Nullable
   @Override
   public bwz f() {
      return this.Q();
   }

   protected boolean gq() {
      return this.fa().c(kj.A);
   }

   @Override
   public void T() {
      if (cpi.c(this)) {
         super.T();
      }
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a(this);
   }

   protected abstract void gr();
}
