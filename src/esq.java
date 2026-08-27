import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class esq implements etu, eum, ewd, ewi {
   private static final double a = 0.5;
   private static final double b = 3.0;
   protected int f;
   protected int g;
   private int c;
   private int d;
   private tn e;
   protected boolean h;
   public boolean i = true;
   public boolean j = true;
   protected float k = 1.0F;
   private int l;
   private boolean m;
   @Nullable
   private euc n;
   private int o;
   private long p;
   private boolean q;

   public esq(int $$0, int $$1, int $$2, int $$3, tn $$4) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = $$3;
      this.e = $$4;
   }

   @Override
   public int i() {
      return this.g;
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      if (this.j) {
         this.h = $$1 >= this.r() && $$2 >= this.t() && $$1 < this.r() + this.f && $$2 < this.t() + this.g;
         this.b($$0, $$1, $$2, $$3);
         this.a();
      }
   }

   private void a() {
      if (this.n != null) {
         boolean $$0 = this.h || this.aC_() && eqx.O().aU().b();
         if ($$0 != this.q) {
            if ($$0) {
               this.p = ac.b();
            }

            this.q = $$0;
         }

         if ($$0 && ac.b() - this.p > (long)this.o) {
            eym $$1 = eqx.O().y;
            if ($$1 != null) {
               $$1.a(this.n, this.j(), this.aC_());
            }
         }
      }
   }

   protected fbd j() {
      return (fbd)(!this.h && this.aC_() && eqx.O().aU().b() ? new faz(this) : new fbf(this));
   }

   public void a(@Nullable euc $$0) {
      this.n = $$0;
   }

   @Nullable
   public euc k() {
      return this.n;
   }

   public void b(int $$0) {
      this.o = $$0;
   }

   protected ua aE_() {
      return a(this.m());
   }

   public static ua a(tn $$0) {
      return tn.a("gui.narrate.button", $$0);
   }

   protected abstract void b(esh var1, int var2, int var3, float var4);

   protected static void a(esh $$0, esf $$1, tn $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      a($$0, $$1, $$2, ($$3 + $$5) / 2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static void a(esh $$0, esf $$1, tn $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      int $$9 = $$1.a($$2);
      int $$10 = ($$5 + $$7 - 9) / 2 + 1;
      int $$11 = $$6 - $$4;
      if ($$9 > $$11) {
         int $$12 = $$9 - $$11;
         double $$13 = (double)ac.b() / 1000.0;
         double $$14 = Math.max((double)$$12 * 0.5, 3.0);
         double $$15 = Math.sin((Math.PI / 2) * Math.cos((Math.PI * 2) * $$13 / $$14)) / 2.0 + 0.5;
         double $$16 = ary.d($$15, 0.0, (double)$$12);
         $$0.c($$4, $$5, $$6, $$7);
         $$0.b($$1, $$2, $$4 - (int)$$16, $$10, $$8);
         $$0.f();
      } else {
         int $$17 = ary.a($$3, $$4 + $$9 / 2, $$6 - $$9 / 2);
         $$0.a($$1, $$2, $$17, $$10, $$8);
      }
   }

   protected void a(esh $$0, esf $$1, int $$2, int $$3) {
      int $$4 = this.r() + $$2;
      int $$5 = this.r() + this.l() - $$2;
      a($$0, $$1, this.m(), $$4, this.t(), $$5, this.t() + this.i(), $$3);
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
               this.a(eqx.O().ai());
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
      return this.i && this.j && $$0 >= (double)this.r() && $$1 >= (double)this.t() && $$0 < (double)(this.r() + this.f) && $$1 < (double)(this.t() + this.g);
   }

   @Nullable
   @Override
   public ese a(ewq $$0) {
      if (!this.i || !this.j) {
         return null;
      } else {
         return !this.aC_() ? ese.a(this) : null;
      }
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return this.i && this.j && $$0 >= (double)this.r() && $$1 >= (double)this.t() && $$0 < (double)(this.r() + this.f) && $$1 < (double)(this.t() + this.g);
   }

   public void a(gds $$0) {
      $$0.a(gcj.a(apf.yu, 1.0F));
   }

   @Override
   public int l() {
      return this.f;
   }

   public void d(int $$0) {
      this.f = $$0;
   }

   public void e(int $$0) {
      this.g = $$0;
   }

   public void a(float $$0) {
      this.k = $$0;
   }

   public void b(tn $$0) {
      this.e = $$0;
   }

   public tn m() {
      return this.e;
   }

   @Override
   public boolean aC_() {
      return this.m;
   }

   public boolean n() {
      return this.h;
   }

   public boolean o() {
      return this.n() || this.aC_();
   }

   @Override
   public boolean aD_() {
      return this.j && this.i;
   }

   @Override
   public void b_(boolean $$0) {
      this.m = $$0;
   }

   @Override
   public ewi.a q() {
      if (this.aC_()) {
         return ewi.a.c;
      } else {
         return this.h ? ewi.a.b : ewi.a.a;
      }
   }

   @Override
   public final void b(ewk $$0) {
      this.a($$0);
      if (this.n != null) {
         this.n.b($$0);
      }
   }

   protected abstract void a(ewk var1);

   protected void c(ewk $$0) {
      $$0.a(ewj.a, this.aE_());
      if (this.i) {
         if (this.aC_()) {
            $$0.a(ewj.d, tn.c("narration.button.usage.focused"));
         } else {
            $$0.a(ewj.d, tn.c("narration.button.usage.hovered"));
         }
      }
   }

   @Override
   public int r() {
      return this.c;
   }

   @Override
   public void f(int $$0) {
      this.c = $$0;
   }

   @Override
   public int t() {
      return this.d;
   }

   @Override
   public void g(int $$0) {
      this.d = $$0;
   }

   @Override
   public void a(Consumer<esq> $$0) {
      $$0.accept(this);
   }

   @Override
   public ewu s() {
      return ewd.super.s();
   }

   @Override
   public int u() {
      return this.l;
   }

   public void h(int $$0) {
      this.l = $$0;
   }
}
