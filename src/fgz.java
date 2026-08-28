import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class fgz<E extends fgz.a<E>> extends fgw {
   protected static final int b = 6;
   private static final alf a = new alf("widget/scroller");
   private static final alf m = new alf("widget/scroller_background");
   private static final alf n = new alf("textures/gui/menu_list_background.png");
   private static final alf o = new alf("textures/gui/inworld_menu_list_background.png");
   protected final fff c;
   protected final int d;
   private final List<E> p = new fgz.b();
   protected boolean e = true;
   private double q;
   private boolean r;
   protected int f;
   private boolean s;
   @Nullable
   private E u;
   @Nullable
   private E v;

   public fgz(fff $$0, int $$1, int $$2, int $$3, int $$4) {
      super(0, $$3, $$1, $$2, xo.a);
      this.c = $$0;
      this.d = $$4;
   }

   protected void a(boolean $$0, int $$1) {
      this.r = $$0;
      this.f = $$1;
      if (!$$0) {
         this.f = 0;
      }
   }

   public int b() {
      return 220;
   }

   @Nullable
   public E h() {
      return this.u;
   }

   public void a(@Nullable E $$0) {
      this.u = $$0;
   }

   public E i() {
      return this.p.get(0);
   }

   @Nullable
   public E j() {
      return (E)super.aG_();
   }

   @Override
   public final List<E> aD_() {
      return this.p;
   }

   protected void k() {
      this.p.clear();
      this.u = null;
   }

   protected void a(Collection<E> $$0) {
      this.k();
      this.p.addAll($$0);
   }

   protected E d(int $$0) {
      return this.aD_().get($$0);
   }

   protected int b(E $$0) {
      this.p.add($$0);
      return this.p.size() - 1;
   }

   protected void c(E $$0) {
      double $$1 = (double)this.o() - this.n();
      this.p.add(0, $$0);
      this.a((double)this.o() - $$1);
   }

   protected boolean d(E $$0) {
      double $$1 = (double)this.o() - this.n();
      boolean $$2 = this.g($$0);
      this.a((double)this.o() - $$1);
      return $$2;
   }

   protected int l() {
      return this.aD_().size();
   }

   protected boolean e(int $$0) {
      return Objects.equals(this.h(), this.aD_().get($$0));
   }

   @Nullable
   protected final E b(double $$0, double $$1) {
      int $$2 = this.b() / 2;
      int $$3 = this.C() + this.g / 2;
      int $$4 = $$3 - $$2;
      int $$5 = $$3 + $$2;
      int $$6 = ayz.a($$1 - (double)this.D()) - this.f + (int)this.n() - 4;
      int $$7 = $$6 / this.d;
      return $$0 >= (double)$$4 && $$0 <= (double)$$5 && $$7 >= 0 && $$6 >= 0 && $$7 < this.l() ? this.aD_().get($$7) : null;
   }

   public void a(int $$0, fkr $$1) {
      this.b($$0, $$1.d(), $$1.c());
   }

   public void b(int $$0, int $$1, int $$2) {
      this.b($$0, $$1);
      this.c(0, $$2);
   }

   protected int a() {
      return this.l() * this.d + this.f;
   }

   protected boolean a(int $$0, int $$1) {
      return false;
   }

   protected void a(fgr $$0, int $$1, int $$2) {
   }

   protected void b(fgr $$0, int $$1, int $$2) {
   }

   @Override
   public void b(fgr $$0, int $$1, int $$2, float $$3) {
      this.v = this.c((double)$$1, (double)$$2) ? this.b((double)$$1, (double)$$2) : null;
      this.b($$0);
      this.c($$0);
      if (this.r) {
         int $$4 = this.r();
         int $$5 = this.D() + 4 - (int)this.n();
         this.a($$0, $$4, $$5);
      }

      this.c($$0, $$1, $$2, $$3);
      $$0.f();
      this.a($$0);
      if (this.m()) {
         int $$6 = this.p();
         int $$7 = (int)((float)(this.h * this.h) / (float)this.a());
         $$7 = ayz.a($$7, 32, this.h - 8);
         int $$8 = (int)this.n() * (this.h - $$7) / this.o() + this.D();
         if ($$8 < this.D()) {
            $$8 = this.D();
         }

         RenderSystem.enableBlend();
         $$0.a(m, $$6, this.D(), 6, this.v());
         $$0.a(a, $$6, $$8, 6, $$7);
         RenderSystem.disableBlend();
      }

      this.b($$0, $$1, $$2);
      RenderSystem.disableBlend();
   }

   protected boolean m() {
      return this.o() > 0;
   }

   protected void a(fgr $$0) {
      RenderSystem.enableBlend();
      alf $$1 = this.c.r == null ? fnd.h : fnd.j;
      alf $$2 = this.c.r == null ? fnd.i : fnd.k;
      $$0.a($$1, this.C(), this.D() - 2, 0.0F, 0.0F, this.x(), 2, 32, 2);
      $$0.a($$2, this.C(), this.F(), 0.0F, 0.0F, this.x(), 2, 32, 2);
      RenderSystem.disableBlend();
   }

   protected void b(fgr $$0) {
      RenderSystem.enableBlend();
      alf $$1 = this.c.r == null ? n : o;
      $$0.a($$1, this.C(), this.D(), (float)this.E(), (float)(this.F() + (int)this.n()), this.x(), this.v(), 32, 32);
      RenderSystem.disableBlend();
   }

   protected void c(fgr $$0) {
      $$0.c(this.C(), this.D(), this.E(), this.F());
   }

   protected void e(E $$0) {
      this.a((double)(this.aD_().indexOf($$0) * this.d + this.d / 2 - this.h / 2));
   }

   protected void f(E $$0) {
      int $$1 = this.g(this.aD_().indexOf($$0));
      int $$2 = $$1 - this.D() - 4 - this.d;
      if ($$2 < 0) {
         this.a($$2);
      }

      int $$3 = this.F() - $$1 - this.d - this.d;
      if ($$3 < 0) {
         this.a(-$$3);
      }
   }

   private void a(int $$0) {
      this.a(this.n() + (double)$$0);
   }

   public double n() {
      return this.q;
   }

   public void a(double $$0) {
      this.q = ayz.a($$0, 0.0, (double)this.o());
   }

   public int o() {
      return Math.max(0, this.a() - (this.h - 4));
   }

   protected void c(double $$0, double $$1, int $$2) {
      this.s = $$2 == 0 && $$0 >= (double)this.p() && $$0 < (double)(this.p() + 6);
   }

   protected int p() {
      return this.q();
   }

   protected int q() {
      return this.J() + this.c();
   }

   private int c() {
      return 10;
   }

   protected boolean f(int $$0) {
      return $$0 == 0;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (!this.f($$2)) {
         return false;
      } else {
         this.c($$0, $$1, $$2);
         if (!this.c($$0, $$1)) {
            return false;
         } else {
            E $$3 = this.b($$0, $$1);
            if ($$3 != null) {
               if ($$3.a($$0, $$1, $$2)) {
                  E $$4 = this.j();
                  if ($$4 != $$3 && $$4 instanceof fiz $$5) {
                     $$5.a(null);
                  }

                  this.a($$3);
                  this.b(true);
                  return true;
               }
            } else if (this.a((int)($$0 - (double)(this.C() + this.g / 2 - this.b() / 2)), (int)($$1 - (double)this.D()) + (int)this.n() - 4)) {
               return true;
            }

            return this.s;
         }
      }
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if (this.j() != null) {
         this.j().b($$0, $$1, $$2);
      }

      return false;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else if ($$2 == 0 && this.s) {
         if ($$1 < (double)this.D()) {
            this.a(0.0);
         } else if ($$1 > (double)this.F()) {
            this.a((double)this.o());
         } else {
            double $$5 = (double)Math.max(1, this.o());
            int $$6 = this.h;
            int $$7 = ayz.a((int)((float)($$6 * $$6) / (float)this.a()), 32, $$6 - 8);
            double $$8 = Math.max(1.0, $$5 / (double)($$6 - $$7));
            this.a(this.n() + $$4 * $$8);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      this.a(this.n() - $$3 * (double)this.d / 2.0);
      return true;
   }

   @Override
   public void a(@Nullable fja $$0) {
      super.a($$0);
      int $$1 = this.p.indexOf($$0);
      if ($$1 >= 0) {
         E $$2 = this.p.get($$1);
         this.a($$2);
         if (this.c.aW().b()) {
            this.f($$2);
         }
      }
   }

   @Nullable
   protected E a(fli $$0) {
      return this.a($$0, $$0x -> true);
   }

   @Nullable
   protected E a(fli $$0, Predicate<E> $$1) {
      return this.a($$0, $$1, this.h());
   }

   @Nullable
   protected E a(fli $$0, Predicate<E> $$1, @Nullable E $$2) {
      int $$3 = switch ($$0) {
         case d, c -> 0;
         case a -> -1;
         case b -> 1;
      };
      if (!this.aD_().isEmpty() && $$3 != 0) {
         int $$4;
         if ($$2 == null) {
            $$4 = $$3 > 0 ? 0 : this.aD_().size() - 1;
         } else {
            $$4 = this.aD_().indexOf($$2) + $$3;
         }

         for (int $$6 = $$4; $$6 >= 0 && $$6 < this.p.size(); $$6 += $$3) {
            E $$7 = this.aD_().get($$6);
            if ($$1.test($$7)) {
               return $$7;
            }
         }
      }

      return null;
   }

   @Override
   public boolean c(double $$0, double $$1) {
      return $$1 >= (double)this.D() && $$1 <= (double)this.F() && $$0 >= (double)this.C() && $$0 <= (double)this.E();
   }

   protected void c(fgr $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.r();
      int $$5 = this.b();
      int $$6 = this.d - 4;
      int $$7 = this.l();

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         int $$9 = this.g($$8);
         int $$10 = this.h($$8);
         if ($$10 >= this.D() && $$9 <= this.F()) {
            this.a($$0, $$1, $$2, $$3, $$8, $$4, $$9, $$5, $$6);
         }
      }
   }

   protected void a(fgr $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      E $$9 = this.d($$4);
      $$9.b($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, Objects.equals(this.v, $$9), $$3);
      if (this.e($$4)) {
         int $$10 = this.aH_() ? -1 : -8355712;
         this.a($$0, $$6, $$7, $$8, $$10, -16777216);
      }

      $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, Objects.equals(this.v, $$9), $$3);
   }

   protected void a(fgr $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = this.C() + (this.g - $$2) / 2;
      int $$7 = this.C() + (this.g + $$2) / 2;
      $$0.a($$6, $$1 - 2, $$7, $$1 + $$3 + 2, $$4);
      $$0.a($$6 + 1, $$1 - 1, $$7 - 1, $$1 + $$3 + 1, $$5);
   }

   public int r() {
      return this.C() + this.g / 2 - this.b() / 2 + 2;
   }

   private int I() {
      return this.C() + this.g / 2 - this.b() / 2;
   }

   public int s() {
      return this.r() + this.b();
   }

   private int J() {
      return this.I() + this.b();
   }

   protected int g(int $$0) {
      return this.D() + 4 - (int)this.n() + $$0 * this.d + this.f;
   }

   protected int h(int $$0) {
      return this.g($$0) + this.d;
   }

   @Override
   public fky.a t() {
      if (this.aH_()) {
         return fky.a.c;
      } else {
         return this.v != null ? fky.a.b : fky.a.a;
      }
   }

   @Nullable
   protected E i(int $$0) {
      E $$1 = this.p.get($$0);
      return this.g(this.p.get($$0)) ? $$1 : null;
   }

   protected boolean g(E $$0) {
      boolean $$1 = this.p.remove($$0);
      if ($$1 && $$0 == this.h()) {
         this.a(null);
      }

      return $$1;
   }

   @Nullable
   protected E u() {
      return this.v;
   }

   void h(fgz.a<E> $$0) {
      $$0.a = this;
   }

   protected void a(fla $$0, E $$1) {
      List<E> $$2 = this.aD_();
      if ($$2.size() > 1) {
         int $$3 = $$2.indexOf($$1);
         if ($$3 != -1) {
            $$0.a(fkz.b, xp.a("narrator.position.list", $$3 + 1, $$2.size()));
         }
      }
   }

   protected abstract static class a<E extends fgz.a<E>> implements fja {
      @Deprecated
      fgz<E> a;

      @Override
      public void a(boolean $$0) {
      }

      @Override
      public boolean aH_() {
         return this.a.j() == this;
      }

      public abstract void a(fgr var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10);

      public void b(fgr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public boolean c(double $$0, double $$1) {
         return Objects.equals(this.a.b($$0, $$1), this);
      }
   }

   class b extends AbstractList<E> {
      private final List<E> b = Lists.newArrayList();

      public E a(int $$0) {
         return this.b.get($$0);
      }

      @Override
      public int size() {
         return this.b.size();
      }

      public E a(int $$0, E $$1) {
         E $$2 = this.b.set($$0, $$1);
         fgz.this.h($$1);
         return $$2;
      }

      public void b(int $$0, E $$1) {
         this.b.add($$0, $$1);
         fgz.this.h($$1);
      }

      public E b(int $$0) {
         return this.b.remove($$0);
      }
   }
}
