import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class exd implements eyi, eza, far, faw {
   private static final double a = 0.5;
   private static final double b = 3.0;
   protected int g;
   protected int h;
   private int c;
   private int d;
   private vf e;
   protected boolean i;
   public boolean j = true;
   public boolean k = true;
   protected float l = 1.0F;
   private int f;
   private boolean m;
   @Nullable
   private eyq n;

   public exd(int $$0, int $$1, int $$2, int $$3, vf $$4) {
      this.c = $$0;
      this.d = $$1;
      this.g = $$2;
      this.h = $$3;
      this.e = $$4;
   }

   @Override
   public int u() {
      return this.h;
   }

   @Override
   public final void a(ewt $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         this.i = $$1 >= this.B() && $$2 >= this.C() && $$1 < this.B() + this.g && $$2 < this.C() + this.h;
         this.b($$0, $$1, $$2, $$3);
         if (this.n != null) {
            this.n.a(this.y(), this.aI_(), this.F());
         }
      }
   }

   public void a(@Nullable eyq $$0) {
      this.n = $$0;
   }

   @Nullable
   public eyq v() {
      return this.n;
   }

   public void j(int $$0) {
      if (this.n != null) {
         this.n.a($$0);
      }
   }

   protected vt aK_() {
      return a_(this.x());
   }

   public static vt a_(vf $$0) {
      return vf.a("gui.narrate.button", $$0);
   }

   protected abstract void b(ewt var1, int var2, int var3, float var4);

   protected static void a(ewt $$0, ewr $$1, vf $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      a($$0, $$1, $$2, ($$3 + $$5) / 2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static void a(ewt $$0, ewr $$1, vf $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      int $$9 = $$1.a($$2);
      int $$10 = ($$5 + $$7 - 9) / 2 + 1;
      int $$11 = $$6 - $$4;
      if ($$9 > $$11) {
         int $$12 = $$9 - $$11;
         double $$13 = (double)ac.b() / 1000.0;
         double $$14 = Math.max((double)$$12 * 0.5, 3.0);
         double $$15 = Math.sin((Math.PI / 2) * Math.cos((Math.PI * 2) * $$13 / $$14)) / 2.0 + 0.5;
         double $$16 = aun.d($$15, 0.0, (double)$$12);
         $$0.c($$4, $$5, $$6, $$7);
         $$0.b($$1, $$2, $$4 - (int)$$16, $$10, $$8);
         $$0.f();
      } else {
         int $$17 = aun.a($$3, $$4 + $$9 / 2, $$6 - $$9 / 2);
         $$0.a($$1, $$2, $$17, $$10, $$8);
      }
   }

   protected void a(ewt $$0, ewr $$1, int $$2, int $$3) {
      int $$4 = this.B() + $$2;
      int $$5 = this.B() + this.w() - $$2;
      a($$0, $$1, this.x(), $$4, this.C(), $$5, this.C() + this.u(), $$3);
   }

   public void a(double $$0, double $$1) {
   }

   public void a_(double $$0, double $$1) {
   }

   protected void b(double $$0, double $$1, double $$2, double $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.j && this.k) {
         if (this.k($$2)) {
            boolean $$3 = this.d($$0, $$1);
            if ($$3) {
               this.a(evh.O().ai());
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
      if (this.k($$2)) {
         this.a_($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   protected boolean k(int $$0) {
      return $$0 == 0;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.k($$2)) {
         this.b($$0, $$1, $$3, $$4);
         return true;
      } else {
         return false;
      }
   }

   protected boolean d(double $$0, double $$1) {
      return this.j
         && this.k
         && $$0 >= (double)this.B()
         && $$1 >= (double)this.C()
         && $$0 < (double)(this.B() + this.w())
         && $$1 < (double)(this.C() + this.u());
   }

   @Nullable
   @Override
   public ewq a(fbe $$0) {
      if (!this.j || !this.k) {
         return null;
      } else {
         return !this.aI_() ? ewq.a(this) : null;
      }
   }

   @Override
   public boolean c(double $$0, double $$1) {
      return this.j && this.k && $$0 >= (double)this.B() && $$1 >= (double)this.C() && $$0 < (double)(this.B() + this.g) && $$1 < (double)(this.C() + this.h);
   }

   public void a(gjd $$0) {
      $$0.a(ghu.a(arr.zu, 1.0F));
   }

   @Override
   public int w() {
      return this.g;
   }

   public void l(int $$0) {
      this.g = $$0;
   }

   public void m(int $$0) {
      this.h = $$0;
   }

   public void a(float $$0) {
      this.l = $$0;
   }

   public void b(vf $$0) {
      this.e = $$0;
   }

   public vf x() {
      return this.e;
   }

   @Override
   public boolean aI_() {
      return this.m;
   }

   public boolean y() {
      return this.i;
   }

   public boolean z() {
      return this.y() || this.aI_();
   }

   @Override
   public boolean A() {
      return this.k && this.j;
   }

   @Override
   public void a(boolean $$0) {
      this.m = $$0;
   }

   @Override
   public faw.a s() {
      if (this.aI_()) {
         return faw.a.c;
      } else {
         return this.i ? faw.a.b : faw.a.a;
      }
   }

   @Override
   public final void b(fay $$0) {
      this.a($$0);
      if (this.n != null) {
         this.n.b($$0);
      }
   }

   protected abstract void a(fay var1);

   protected void c(fay $$0) {
      $$0.a(fax.a, this.aK_());
      if (this.j) {
         if (this.aI_()) {
            $$0.a(fax.d, vf.c("narration.button.usage.focused"));
         } else {
            $$0.a(fax.d, vf.c("narration.button.usage.hovered"));
         }
      }
   }

   @Override
   public int B() {
      return this.c;
   }

   @Override
   public void n(int $$0) {
      this.c = $$0;
   }

   @Override
   public int C() {
      return this.d;
   }

   @Override
   public void o(int $$0) {
      this.d = $$0;
   }

   public int D() {
      return this.B() + this.w();
   }

   public int E() {
      return this.C() + this.u();
   }

   @Override
   public void a(Consumer<exd> $$0) {
      $$0.accept(this);
   }

   public void b(int $$0, int $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public fbi F() {
      return far.super.F();
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.b($$0, $$1);
      this.c($$2, $$3);
   }

   @Override
   public int G() {
      return this.f;
   }

   public void p(int $$0) {
      this.f = $$0;
   }
}
