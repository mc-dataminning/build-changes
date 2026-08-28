import java.time.Duration;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class fsh implements ftm, fug, fvz, fwe {
   private static final double a = 0.5;
   private static final double b = 3.0;
   protected int g;
   protected int h;
   private int c;
   private int d;
   private wy e;
   protected boolean i;
   public boolean j = true;
   public boolean k = true;
   protected float l = 1.0F;
   private int f;
   private boolean m;
   private final ftx n = new ftx();

   public fsh(int $$0, int $$1, int $$2, int $$3, wy $$4) {
      this.c = $$0;
      this.d = $$1;
      this.g = $$2;
      this.h = $$3;
      this.e = $$4;
   }

   @Override
   public int y() {
      return this.h;
   }

   @Override
   public final void a(frv $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         this.i = $$0.a($$1, $$2) && $$1 >= this.F() && $$2 >= this.G() && $$1 < this.F() + this.g && $$2 < this.G() + this.h;
         this.b($$0, $$1, $$2, $$3);
         this.n.a(this.C(), this.aJ_(), this.J());
      }
   }

   public void a(@Nullable ftu $$0) {
      this.n.a($$0);
   }

   @Nullable
   public ftu z() {
      return this.n.a();
   }

   public void a(Duration $$0) {
      this.n.a($$0);
   }

   protected xm d() {
      return a_(this.B());
   }

   public static xm a_(wy $$0) {
      return wy.a("gui.narrate.button", $$0);
   }

   protected abstract void b(frv var1, int var2, int var3, float var4);

   protected static void a(frv $$0, frt $$1, wy $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      a($$0, $$1, $$2, ($$3 + $$5) / 2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static void a(frv $$0, frt $$1, wy $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      int $$9 = $$1.a($$2);
      int $$10 = ($$5 + $$7 - 9) / 2 + 1;
      int $$11 = $$6 - $$4;
      if ($$9 > $$11) {
         int $$12 = $$9 - $$11;
         double $$13 = (double)af.c() / 1000.0;
         double $$14 = Math.max((double)$$12 * 0.5, 3.0);
         double $$15 = Math.sin((Math.PI / 2) * Math.cos((Math.PI * 2) * $$13 / $$14)) / 2.0 + 0.5;
         double $$16 = azm.d($$15, 0.0, (double)$$12);
         $$0.c($$4, $$5, $$6, $$7);
         $$0.b($$1, $$2, $$4 - (int)$$16, $$10, $$8);
         $$0.e();
      } else {
         int $$17 = azm.a($$3, $$4 + $$9 / 2, $$6 - $$9 / 2);
         $$0.a($$1, $$2, $$17, $$10, $$8);
      }
   }

   protected void a(frv $$0, frt $$1, int $$2, int $$3) {
      int $$4 = this.F() + $$2;
      int $$5 = this.F() + this.A() - $$2;
      a($$0, $$1, this.B(), $$4, this.G(), $$5, this.G() + this.y(), $$3);
   }

   public void a(double $$0, double $$1) {
   }

   public void b(double $$0, double $$1) {
   }

   protected void b(double $$0, double $$1, double $$2, double $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.j && this.k) {
         if (this.g($$2)) {
            boolean $$3 = this.a_($$0, $$1);
            if ($$3) {
               this.a(foz.Q().ak());
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
      if (this.g($$2)) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   protected boolean g(int $$0) {
      return $$0 == 0;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.g($$2)) {
         this.b($$0, $$1, $$3, $$4);
         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public frs a(fwm $$0) {
      if (!this.j || !this.k) {
         return null;
      } else {
         return !this.aJ_() ? frs.a(this) : null;
      }
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return this.j && this.k && $$0 >= (double)this.F() && $$1 >= (double)this.G() && $$0 < (double)this.H() && $$1 < (double)this.I();
   }

   public void a(hoa $$0) {
      b($$0);
   }

   public static void b(hoa $$0) {
      $$0.a(hmp.a(awn.Bv, 1.0F));
   }

   @Override
   public int A() {
      return this.g;
   }

   public void h(int $$0) {
      this.g = $$0;
   }

   public void i(int $$0) {
      this.h = $$0;
   }

   public void a(float $$0) {
      this.l = $$0;
   }

   public void b(wy $$0) {
      this.e = $$0;
   }

   public wy B() {
      return this.e;
   }

   @Override
   public boolean aJ_() {
      return this.m;
   }

   public boolean C() {
      return this.i;
   }

   public boolean D() {
      return this.C() || this.aJ_();
   }

   @Override
   public boolean E() {
      return this.k && this.j;
   }

   @Override
   public void a(boolean $$0) {
      this.m = $$0;
   }

   @Override
   public fwe.a w() {
      if (this.aJ_()) {
         return fwe.a.c;
      } else {
         return this.i ? fwe.a.b : fwe.a.a;
      }
   }

   @Override
   public final void b(fwg $$0) {
      this.a($$0);
      this.n.a($$0);
   }

   protected abstract void a(fwg var1);

   protected void c(fwg $$0) {
      $$0.a(fwf.a, this.d());
      if (this.j) {
         if (this.aJ_()) {
            $$0.a(fwf.d, wy.c("narration.button.usage.focused"));
         } else {
            $$0.a(fwf.d, wy.c("narration.button.usage.hovered"));
         }
      }
   }

   @Override
   public int F() {
      return this.c;
   }

   @Override
   public void j(int $$0) {
      this.c = $$0;
   }

   @Override
   public int G() {
      return this.d;
   }

   @Override
   public void k(int $$0) {
      this.d = $$0;
   }

   public int H() {
      return this.F() + this.A();
   }

   public int I() {
      return this.G() + this.y();
   }

   @Override
   public void a(Consumer<fsh> $$0) {
      $$0.accept(this);
   }

   public void b(int $$0, int $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public fwq J() {
      return fvz.super.J();
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.b($$0, $$1);
      this.c($$2, $$3);
   }

   @Override
   public int K() {
      return this.f;
   }

   public void l(int $$0) {
      this.f = $$0;
   }
}
