import java.time.Duration;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class flf implements fmk, fne, foy, fpd {
   private static final double a = 0.5;
   private static final double b = 3.0;
   protected int g;
   protected int h;
   private int c;
   private int d;
   private xi e;
   protected boolean i;
   public boolean j = true;
   public boolean k = true;
   protected float l = 1.0F;
   private int f;
   private boolean m;
   private final fmv n = new fmv();

   public flf(int $$0, int $$1, int $$2, int $$3, xi $$4) {
      this.c = $$0;
      this.d = $$1;
      this.g = $$2;
      this.h = $$3;
      this.e = $$4;
   }

   @Override
   public int w() {
      return this.h;
   }

   @Override
   public final void a(fku $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         this.i = $$0.a($$1, $$2) && $$1 >= this.D() && $$2 >= this.E() && $$1 < this.D() + this.g && $$2 < this.E() + this.h;
         this.b($$0, $$1, $$2, $$3);
         this.n.a(this.A(), this.aM_(), this.H());
      }
   }

   public void a(@Nullable fms $$0) {
      this.n.a($$0);
   }

   @Nullable
   public fms x() {
      return this.n.a();
   }

   public void a(Duration $$0) {
      this.n.a($$0);
   }

   protected xw aO_() {
      return a_(this.z());
   }

   public static xw a_(xi $$0) {
      return xi.a("gui.narrate.button", $$0);
   }

   protected abstract void b(fku var1, int var2, int var3, float var4);

   protected static void a(fku $$0, fks $$1, xi $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      a($$0, $$1, $$2, ($$3 + $$5) / 2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static void a(fku $$0, fks $$1, xi $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      int $$9 = $$1.a($$2);
      int $$10 = ($$5 + $$7 - 9) / 2 + 1;
      int $$11 = $$6 - $$4;
      if ($$9 > $$11) {
         int $$12 = $$9 - $$11;
         double $$13 = (double)ae.c() / 1000.0;
         double $$14 = Math.max((double)$$12 * 0.5, 3.0);
         double $$15 = Math.sin((Math.PI / 2) * Math.cos((Math.PI * 2) * $$13 / $$14)) / 2.0 + 0.5;
         double $$16 = azk.d($$15, 0.0, (double)$$12);
         $$0.c($$4, $$5, $$6, $$7);
         $$0.b($$1, $$2, $$4 - (int)$$16, $$10, $$8);
         $$0.e();
      } else {
         int $$17 = azk.a($$3, $$4 + $$9 / 2, $$6 - $$9 / 2);
         $$0.a($$1, $$2, $$17, $$10, $$8);
      }
   }

   protected void a(fku $$0, fks $$1, int $$2, int $$3) {
      int $$4 = this.D() + $$2;
      int $$5 = this.D() + this.y() - $$2;
      a($$0, $$1, this.z(), $$4, this.E(), $$5, this.E() + this.w(), $$3);
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
               this.a(fji.Q().ak());
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
         && $$0 >= (double)this.D()
         && $$1 >= (double)this.E()
         && $$0 < (double)(this.D() + this.y())
         && $$1 < (double)(this.E() + this.w());
   }

   @Nullable
   @Override
   public fkr a(fpl $$0) {
      if (!this.j || !this.k) {
         return null;
      } else {
         return !this.aM_() ? fkr.a(this) : null;
      }
   }

   @Override
   public boolean c(double $$0, double $$1) {
      return this.j && this.k && $$0 >= (double)this.D() && $$1 >= (double)this.E() && $$0 < (double)(this.D() + this.g) && $$1 < (double)(this.E() + this.h);
   }

   public void a(hdf $$0) {
      b($$0);
   }

   public static void b(hdf $$0) {
      $$0.a(hbv.a(awl.Av, 1.0F));
   }

   @Override
   public int y() {
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

   public void b(xi $$0) {
      this.e = $$0;
   }

   public xi z() {
      return this.e;
   }

   @Override
   public boolean aM_() {
      return this.m;
   }

   public boolean A() {
      return this.i;
   }

   public boolean B() {
      return this.A() || this.aM_();
   }

   @Override
   public boolean C() {
      return this.k && this.j;
   }

   @Override
   public void a(boolean $$0) {
      this.m = $$0;
   }

   @Override
   public fpd.a u() {
      if (this.aM_()) {
         return fpd.a.c;
      } else {
         return this.i ? fpd.a.b : fpd.a.a;
      }
   }

   @Override
   public final void b(fpf $$0) {
      this.a($$0);
      this.n.a($$0);
   }

   protected abstract void a(fpf var1);

   protected void c(fpf $$0) {
      $$0.a(fpe.a, this.aO_());
      if (this.j) {
         if (this.aM_()) {
            $$0.a(fpe.d, xi.c("narration.button.usage.focused"));
         } else {
            $$0.a(fpe.d, xi.c("narration.button.usage.hovered"));
         }
      }
   }

   @Override
   public int D() {
      return this.c;
   }

   @Override
   public void m(int $$0) {
      this.c = $$0;
   }

   @Override
   public int E() {
      return this.d;
   }

   @Override
   public void n(int $$0) {
      this.d = $$0;
   }

   public int F() {
      return this.D() + this.y();
   }

   public int G() {
      return this.E() + this.w();
   }

   @Override
   public void a(Consumer<flf> $$0) {
      $$0.accept(this);
   }

   public void b(int $$0, int $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public fpp H() {
      return foy.super.H();
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.b($$0, $$1);
      this.c($$2, $$3);
   }

   @Override
   public int I() {
      return this.f;
   }

   public void o(int $$0) {
      this.f = $$0;
   }
}
