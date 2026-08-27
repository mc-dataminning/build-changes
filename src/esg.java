import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class esg implements etj, etw, evm, evr {
   private static final double a = 0.5;
   private static final double b = 3.0;
   protected int f;
   protected int g;
   private int c;
   private int d;
   private te e;
   protected boolean h;
   public boolean i = true;
   public boolean j = true;
   protected float k = 1.0F;
   private int l;
   private boolean m;
   @Nullable
   private etr n;
   private int o;
   private long p;
   private boolean q;

   public esg(int $$0, int $$1, int $$2, int $$3, te $$4) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = $$3;
      this.e = $$4;
   }

   @Override
   public int h() {
      return this.g;
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      if (this.j) {
         this.h = $$1 >= this.p() && $$2 >= this.r() && $$1 < this.p() + this.f && $$2 < this.r() + this.g;
         this.b($$0, $$1, $$2, $$3);
         this.a();
      }
   }

   private void a() {
      if (this.n != null) {
         boolean $$0 = this.h || this.ax_() && eqn.N().aT().b();
         if ($$0 != this.q) {
            if ($$0) {
               this.p = ac.b();
            }

            this.q = $$0;
         }

         if ($$0 && ac.b() - this.p > (long)this.o) {
            exv $$1 = eqn.N().z;
            if ($$1 != null) {
               $$1.a(this.n, this.i(), this.ax_());
            }
         }
      }
   }

   protected fam i() {
      return (fam)(!this.h && this.ax_() && eqn.N().aT().b() ? new fai(this) : new fao(this));
   }

   public void a(@Nullable etr $$0) {
      this.n = $$0;
   }

   @Nullable
   public etr j() {
      return this.n;
   }

   public void b(int $$0) {
      this.o = $$0;
   }

   protected tr aB_() {
      return a(this.l());
   }

   public static tr a(te $$0) {
      return te.a("gui.narrate.button", $$0);
   }

   protected abstract void b(erx var1, int var2, int var3, float var4);

   protected static void a(erx $$0, erv $$1, te $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      a($$0, $$1, $$2, ($$3 + $$5) / 2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static void a(erx $$0, erv $$1, te $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      int $$9 = $$1.a($$2);
      int $$10 = ($$5 + $$7 - 9) / 2 + 1;
      int $$11 = $$6 - $$4;
      if ($$9 > $$11) {
         int $$12 = $$9 - $$11;
         double $$13 = (double)ac.b() / 1000.0;
         double $$14 = Math.max((double)$$12 * 0.5, 3.0);
         double $$15 = Math.sin((Math.PI / 2) * Math.cos((Math.PI * 2) * $$13 / $$14)) / 2.0 + 0.5;
         double $$16 = aro.d($$15, 0.0, (double)$$12);
         $$0.c($$4, $$5, $$6, $$7);
         $$0.b($$1, $$2, $$4 - (int)$$16, $$10, $$8);
         $$0.f();
      } else {
         int $$17 = aro.a($$3, $$4 + $$9 / 2, $$6 - $$9 / 2);
         $$0.a($$1, $$2, $$17, $$10, $$8);
      }
   }

   protected void a(erx $$0, erv $$1, int $$2, int $$3) {
      int $$4 = this.p() + $$2;
      int $$5 = this.p() + this.k() - $$2;
      a($$0, $$1, this.l(), $$4, this.r(), $$5, this.r() + this.h(), $$3);
   }

   public void a(double $$0, double $$1) {
   }

   public void b(double $$0, double $$1) {
   }

   protected void b(double $$0, double $$1, double $$2, double $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.i && this.j) {
         if (this.c($$2)) {
            boolean $$3 = this.d($$0, $$1);
            if ($$3) {
               this.a(eqn.N().ah());
               this.a($$0, $$1);
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if (this.c($$2)) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   protected boolean c(int $$0) {
      return $$0 == 0;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.c($$2)) {
         this.b($$0, $$1, $$3, $$4);
         return true;
      } else {
         return false;
      }
   }

   protected boolean d(double $$0, double $$1) {
      return this.i && this.j && $$0 >= (double)this.p() && $$1 >= (double)this.r() && $$0 < (double)(this.p() + this.f) && $$1 < (double)(this.r() + this.g);
   }

   @Nullable
   @Override
   public eru a(evz $$0) {
      if (!this.i || !this.j) {
         return null;
      } else {
         return !this.ax_() ? eru.a(this) : null;
      }
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return this.i && this.j && $$0 >= (double)this.p() && $$1 >= (double)this.r() && $$0 < (double)(this.p() + this.f) && $$1 < (double)(this.r() + this.g);
   }

   public void a(gcs $$0) {
      $$0.a(gbj.a(aou.yp, 1.0F));
   }

   @Override
   public int k() {
      return this.f;
   }

   public void d(int $$0) {
      this.f = $$0;
   }

   public void a(float $$0) {
      this.k = $$0;
   }

   public void b(te $$0) {
      this.e = $$0;
   }

   public te l() {
      return this.e;
   }

   @Override
   public boolean ax_() {
      return this.m;
   }

   public boolean m() {
      return this.h;
   }

   public boolean n() {
      return this.m() || this.ax_();
   }

   @Override
   public boolean az_() {
      return this.j && this.i;
   }

   @Override
   public void c_(boolean $$0) {
      this.m = $$0;
   }

   @Override
   public evr.a q() {
      if (this.ax_()) {
         return evr.a.c;
      } else {
         return this.h ? evr.a.b : evr.a.a;
      }
   }

   @Override
   public final void b(evt $$0) {
      this.a($$0);
      if (this.n != null) {
         this.n.b($$0);
      }
   }

   protected abstract void a(evt var1);

   protected void c(evt $$0) {
      $$0.a(evs.a, this.aB_());
      if (this.i) {
         if (this.ax_()) {
            $$0.a(evs.d, te.c("narration.button.usage.focused"));
         } else {
            $$0.a(evs.d, te.c("narration.button.usage.hovered"));
         }
      }
   }

   @Override
   public int p() {
      return this.c;
   }

   @Override
   public void e(int $$0) {
      this.c = $$0;
   }

   @Override
   public int r() {
      return this.d;
   }

   @Override
   public void f(int $$0) {
      this.d = $$0;
   }

   @Override
   public void a(Consumer<esg> $$0) {
      $$0.accept(this);
   }

   @Override
   public ewd s() {
      return evm.super.s();
   }

   @Override
   public int ay_() {
      return this.l;
   }

   public void g(int $$0) {
      this.l = $$0;
   }
}
