import java.time.Duration;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class fes implements ffx, fgq, fij, fio {
   private static final double a = 0.5;
   private static final double b = 3.0;
   protected int g;
   protected int h;
   private int c;
   private int d;
   private ws e;
   protected boolean i;
   public boolean j = true;
   public boolean k = true;
   protected float l = 1.0F;
   private int f;
   private boolean m;
   private final fgi n = new fgi();

   public fes(int $$0, int $$1, int $$2, int $$3, ws $$4) {
      this.c = $$0;
      this.d = $$1;
      this.g = $$2;
      this.h = $$3;
      this.e = $$4;
   }

   @Override
   public int v() {
      return this.h;
   }

   @Override
   public final void a(feh $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         this.i = $$0.a($$1, $$2) && $$1 >= this.C() && $$2 >= this.D() && $$1 < this.C() + this.g && $$2 < this.D() + this.h;
         this.b($$0, $$1, $$2, $$3);
         this.n.a(this.z(), this.aI_(), this.G());
      }
   }

   public void a(@Nullable fgf $$0) {
      this.n.a($$0);
   }

   @Nullable
   public fgf w() {
      return this.n.a();
   }

   public void a(Duration $$0) {
      this.n.a($$0);
   }

   protected xg aK_() {
      return a_(this.y());
   }

   public static xg a_(ws $$0) {
      return ws.a("gui.narrate.button", $$0);
   }

   protected abstract void b(feh var1, int var2, int var3, float var4);

   protected static void a(feh $$0, fef $$1, ws $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      a($$0, $$1, $$2, ($$3 + $$5) / 2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static void a(feh $$0, fef $$1, ws $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      int $$9 = $$1.a($$2);
      int $$10 = ($$5 + $$7 - 9) / 2 + 1;
      int $$11 = $$6 - $$4;
      if ($$9 > $$11) {
         int $$12 = $$9 - $$11;
         double $$13 = (double)ac.b() / 1000.0;
         double $$14 = Math.max((double)$$12 * 0.5, 3.0);
         double $$15 = Math.sin((Math.PI / 2) * Math.cos((Math.PI * 2) * $$13 / $$14)) / 2.0 + 0.5;
         double $$16 = axw.d($$15, 0.0, (double)$$12);
         $$0.c($$4, $$5, $$6, $$7);
         $$0.b($$1, $$2, $$4 - (int)$$16, $$10, $$8);
         $$0.f();
      } else {
         int $$17 = axw.a($$3, $$4 + $$9 / 2, $$6 - $$9 / 2);
         $$0.a($$1, $$2, $$17, $$10, $$8);
      }
   }

   protected void a(feh $$0, fef $$1, int $$2, int $$3) {
      int $$4 = this.C() + $$2;
      int $$5 = this.C() + this.x() - $$2;
      a($$0, $$1, this.y(), $$4, this.D(), $$5, this.D() + this.v(), $$3);
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
         if (this.j($$2)) {
            boolean $$3 = this.d($$0, $$1);
            if ($$3) {
               this.a(fcu.Q().ak());
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
      if (this.j($$2)) {
         this.a_($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   protected boolean j(int $$0) {
      return $$0 == 0;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.j($$2)) {
         this.b($$0, $$1, $$3, $$4);
         return true;
      } else {
         return false;
      }
   }

   protected boolean d(double $$0, double $$1) {
      return this.j
         && this.k
         && $$0 >= (double)this.C()
         && $$1 >= (double)this.D()
         && $$0 < (double)(this.C() + this.x())
         && $$1 < (double)(this.D() + this.v());
   }

   @Nullable
   @Override
   public fee a(fiw $$0) {
      if (!this.j || !this.k) {
         return null;
      } else {
         return !this.aI_() ? fee.a(this) : null;
      }
   }

   @Override
   public boolean c(double $$0, double $$1) {
      return this.j && this.k && $$0 >= (double)this.C() && $$1 >= (double)this.D() && $$0 < (double)(this.C() + this.g) && $$1 < (double)(this.D() + this.h);
   }

   public void a(grf $$0) {
      $$0.a(gpw.a(auz.Ac, 1.0F));
   }

   @Override
   public int x() {
      return this.g;
   }

   public void k(int $$0) {
      this.g = $$0;
   }

   public void l(int $$0) {
      this.h = $$0;
   }

   public void a(float $$0) {
      this.l = $$0;
   }

   public void b(ws $$0) {
      this.e = $$0;
   }

   public ws y() {
      return this.e;
   }

   @Override
   public boolean aI_() {
      return this.m;
   }

   public boolean z() {
      return this.i;
   }

   public boolean A() {
      return this.z() || this.aI_();
   }

   @Override
   public boolean B() {
      return this.k && this.j;
   }

   @Override
   public void a(boolean $$0) {
      this.m = $$0;
   }

   @Override
   public fio.a t() {
      if (this.aI_()) {
         return fio.a.c;
      } else {
         return this.i ? fio.a.b : fio.a.a;
      }
   }

   @Override
   public final void b(fiq $$0) {
      this.a($$0);
      this.n.a($$0);
   }

   protected abstract void a(fiq var1);

   protected void c(fiq $$0) {
      $$0.a(fip.a, this.aK_());
      if (this.j) {
         if (this.aI_()) {
            $$0.a(fip.d, ws.c("narration.button.usage.focused"));
         } else {
            $$0.a(fip.d, ws.c("narration.button.usage.hovered"));
         }
      }
   }

   @Override
   public int C() {
      return this.c;
   }

   @Override
   public void m(int $$0) {
      this.c = $$0;
   }

   @Override
   public int D() {
      return this.d;
   }

   @Override
   public void n(int $$0) {
      this.d = $$0;
   }

   public int E() {
      return this.C() + this.x();
   }

   public int F() {
      return this.D() + this.v();
   }

   @Override
   public void a(Consumer<fes> $$0) {
      $$0.accept(this);
   }

   public void b(int $$0, int $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public fja G() {
      return fij.super.G();
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.b($$0, $$1);
      this.c($$2, $$3);
   }

   @Override
   public int H() {
      return this.f;
   }

   public void o(int $$0) {
      this.f = $$0;
   }
}
