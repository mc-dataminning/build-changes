import java.time.Duration;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class fie implements fjj, fkc, flv, fma {
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
   private final fju n = new fju();

   public fie(int $$0, int $$1, int $$2, int $$3, wy $$4) {
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
   public final void a(fht $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         this.i = $$0.a($$1, $$2) && $$1 >= this.D() && $$2 >= this.E() && $$1 < this.D() + this.g && $$2 < this.E() + this.h;
         this.b($$0, $$1, $$2, $$3);
         this.n.a(this.A(), this.aK_(), this.H());
      }
   }

   public void a(@Nullable fjr $$0) {
      this.n.a($$0);
   }

   @Nullable
   public fjr x() {
      return this.n.a();
   }

   public void a(Duration $$0) {
      this.n.a($$0);
   }

   protected xm aM_() {
      return a_(this.z());
   }

   public static xm a_(wy $$0) {
      return wy.a("gui.narrate.button", $$0);
   }

   protected abstract void b(fht var1, int var2, int var3, float var4);

   protected static void a(fht $$0, fhr $$1, wy $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      a($$0, $$1, $$2, ($$3 + $$5) / 2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static void a(fht $$0, fhr $$1, wy $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      int $$9 = $$1.a($$2);
      int $$10 = ($$5 + $$7 - 9) / 2 + 1;
      int $$11 = $$6 - $$4;
      if ($$9 > $$11) {
         int $$12 = $$9 - $$11;
         double $$13 = (double)ad.c() / 1000.0;
         double $$14 = Math.max((double)$$12 * 0.5, 3.0);
         double $$15 = Math.sin((Math.PI / 2) * Math.cos((Math.PI * 2) * $$13 / $$14)) / 2.0 + 0.5;
         double $$16 = ayn.d($$15, 0.0, (double)$$12);
         $$0.c($$4, $$5, $$6, $$7);
         $$0.b($$1, $$2, $$4 - (int)$$16, $$10, $$8);
         $$0.f();
      } else {
         int $$17 = ayn.a($$3, $$4 + $$9 / 2, $$6 - $$9 / 2);
         $$0.a($$1, $$2, $$17, $$10, $$8);
      }
   }

   protected void a(fht $$0, fhr $$1, int $$2, int $$3) {
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
               this.a(fgi.Q().aj());
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
   public fhq a(fmi $$0) {
      if (!this.j || !this.k) {
         return null;
      } else {
         return !this.aK_() ? fhq.a(this) : null;
      }
   }

   @Override
   public boolean c(double $$0, double $$1) {
      return this.j && this.k && $$0 >= (double)this.D() && $$1 >= (double)this.E() && $$0 < (double)(this.D() + this.g) && $$1 < (double)(this.E() + this.h);
   }

   public void a(guy $$0) {
      $$0.a(gto.a(avo.Ar, 1.0F));
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

   public void b(wy $$0) {
      this.e = $$0;
   }

   public wy z() {
      return this.e;
   }

   @Override
   public boolean aK_() {
      return this.m;
   }

   public boolean A() {
      return this.i;
   }

   public boolean B() {
      return this.A() || this.aK_();
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
   public fma.a u() {
      if (this.aK_()) {
         return fma.a.c;
      } else {
         return this.i ? fma.a.b : fma.a.a;
      }
   }

   @Override
   public final void b(fmc $$0) {
      this.a($$0);
      this.n.a($$0);
   }

   protected abstract void a(fmc var1);

   protected void c(fmc $$0) {
      $$0.a(fmb.a, this.aM_());
      if (this.j) {
         if (this.aK_()) {
            $$0.a(fmb.d, wy.c("narration.button.usage.focused"));
         } else {
            $$0.a(fmb.d, wy.c("narration.button.usage.hovered"));
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
   public void a(Consumer<fie> $$0) {
      $$0.accept(this);
   }

   public void b(int $$0, int $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public fmm H() {
      return flv.super.H();
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
