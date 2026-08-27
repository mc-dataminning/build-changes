import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class ezc<E extends ezc.a<E>> extends eyz {
   protected static final int b = 6;
   private static final aiy a = new aiy("widget/scroller");
   protected final exh c;
   protected final int d;
   private final List<E> m = new ezc.b();
   protected boolean e = true;
   private double n;
   private boolean o;
   protected int f;
   private boolean p;
   @Nullable
   private E q;
   private boolean r = true;
   @Nullable
   private E t;

   public ezc(exh $$0, int $$1, int $$2, int $$3, int $$4) {
      super(0, $$3, $$1, $$2, vp.a);
      this.c = $$0;
      this.d = $$4;
   }

   protected void a(boolean $$0, int $$1) {
      this.o = $$0;
      this.f = $$1;
      if (!$$0) {
         this.f = 0;
      }
   }

   public int b() {
      return 220;
   }

   @Nullable
   public E i() {
      return this.q;
   }

   public void a(@Nullable E $$0) {
      this.q = $$0;
   }

   public E j() {
      return this.m.get(0);
   }

   public void c(boolean $$0) {
      this.r = $$0;
   }

   @Nullable
   public E k() {
      return (E)super.aK_();
   }

   @Override
   public final List<E> l() {
      return this.m;
   }

   protected void m() {
      this.m.clear();
      this.q = null;
   }

   protected void a(Collection<E> $$0) {
      this.m();
      this.m.addAll($$0);
   }

   protected E d(int $$0) {
      return this.l().get($$0);
   }

   protected int b(E $$0) {
      this.m.add($$0);
      return this.m.size() - 1;
   }

   protected void c(E $$0) {
      double $$1 = (double)this.p() - this.o();
      this.m.add(0, $$0);
      this.a((double)this.p() - $$1);
   }

   protected boolean d(E $$0) {
      double $$1 = (double)this.p() - this.o();
      boolean $$2 = this.g($$0);
      this.a((double)this.p() - $$1);
      return $$2;
   }

   protected int n() {
      return this.l().size();
   }

   protected boolean e(int $$0) {
      return Objects.equals(this.i(), this.l().get($$0));
   }

   @Nullable
   protected final E b(double $$0, double $$1) {
      int $$2 = this.b() / 2;
      int $$3 = this.B() + this.g / 2;
      int $$4 = $$3 - $$2;
      int $$5 = $$3 + $$2;
      int $$6 = awh.a($$1 - (double)this.C()) - this.f + (int)this.o() - 4;
      int $$7 = $$6 / this.d;
      return $$0 < (double)this.c() && $$0 >= (double)$$4 && $$0 <= (double)$$5 && $$7 >= 0 && $$6 >= 0 && $$7 < this.n() ? this.l().get($$7) : null;
   }

   protected int a() {
      return this.n() * this.d + this.f;
   }

   protected boolean a(int $$0, int $$1) {
      return false;
   }

   protected void a(eyu $$0, int $$1, int $$2) {
   }

   protected void b(eyu $$0, int $$1, int $$2) {
   }

   @Override
   public void b(eyu $$0, int $$1, int $$2, float $$3) {
      this.t = this.c((double)$$1, (double)$$2) ? this.b((double)$$1, (double)$$2) : null;
      if (this.r) {
         $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
         int $$4 = 32;
         $$0.a(ffe.d, this.B(), this.C(), (float)this.D(), (float)(this.E() + (int)this.o()), this.g, this.h, 32, 32);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      this.a($$0);
      if (this.o) {
         int $$5 = this.q();
         int $$6 = this.C() + 4 - (int)this.o();
         this.a($$0, $$5, $$6);
      }

      this.c($$0, $$1, $$2, $$3);
      $$0.f();
      if (this.r) {
         int $$7 = 4;
         $$0.a(fvu.C(), this.B(), this.C(), this.D(), this.C() + 4, -16777216, 0, 0);
         $$0.a(fvu.C(), this.B(), this.E() - 4, this.D(), this.E(), 0, -16777216, 0);
      }

      int $$8 = this.p();
      if ($$8 > 0) {
         int $$9 = this.c();
         int $$10 = (int)((float)(this.h * this.h) / (float)this.a());
         $$10 = awh.a($$10, 32, this.h - 8);
         int $$11 = (int)this.o() * (this.h - $$10) / $$8 + this.C();
         if ($$11 < this.C()) {
            $$11 = this.C();
         }

         $$0.a($$9, this.C(), $$9 + 6, this.E(), -16777216);
         $$0.a(a, $$9, $$11, 6, $$10);
      }

      this.b($$0, $$1, $$2);
      RenderSystem.disableBlend();
   }

   protected void a(eyu $$0) {
      $$0.c(this.B(), this.C(), this.D(), this.E());
   }

   protected void e(E $$0) {
      this.a((double)(this.l().indexOf($$0) * this.d + this.d / 2 - this.h / 2));
   }

   protected void f(E $$0) {
      int $$1 = this.g(this.l().indexOf($$0));
      int $$2 = $$1 - this.C() - 4 - this.d;
      if ($$2 < 0) {
         this.a($$2);
      }

      int $$3 = this.E() - $$1 - this.d - this.d;
      if ($$3 < 0) {
         this.a(-$$3);
      }
   }

   private void a(int $$0) {
      this.a(this.o() + (double)$$0);
   }

   public double o() {
      return this.n;
   }

   public void a(double $$0) {
      this.n = awh.a($$0, 0.0, (double)this.p());
   }

   public int p() {
      return Math.max(0, this.a() - (this.h - 4));
   }

   protected void c(double $$0, double $$1, int $$2) {
      this.p = $$2 == 0 && $$0 >= (double)this.c() && $$0 < (double)(this.c() + 6);
   }

   protected int c() {
      return this.g / 2 + 124;
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
                  E $$4 = this.k();
                  if ($$4 != $$3 && $$4 instanceof fbc $$5) {
                     $$5.a(null);
                  }

                  this.a($$3);
                  this.b(true);
                  return true;
               }
            } else if (this.a((int)($$0 - (double)(this.B() + this.g / 2 - this.b() / 2)), (int)($$1 - (double)this.C()) + (int)this.o() - 4)) {
               return true;
            }

            return this.p;
         }
      }
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if (this.k() != null) {
         this.k().b($$0, $$1, $$2);
      }

      return false;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else if ($$2 == 0 && this.p) {
         if ($$1 < (double)this.C()) {
            this.a(0.0);
         } else if ($$1 > (double)this.E()) {
            this.a((double)this.p());
         } else {
            double $$5 = (double)Math.max(1, this.p());
            int $$6 = this.h;
            int $$7 = awh.a((int)((float)($$6 * $$6) / (float)this.a()), 32, $$6 - 8);
            double $$8 = Math.max(1.0, $$5 / (double)($$6 - $$7));
            this.a(this.o() + $$4 * $$8);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      this.a(this.o() - $$3 * (double)this.d / 2.0);
      return true;
   }

   @Override
   public void a(@Nullable fbd $$0) {
      super.a($$0);
      int $$1 = this.m.indexOf($$0);
      if ($$1 >= 0) {
         E $$2 = this.m.get($$1);
         this.a($$2);
         if (this.c.aV().b()) {
            this.f($$2);
         }
      }
   }

   @Nullable
   protected E a(fdk $$0) {
      return this.a($$0, $$0x -> true);
   }

   @Nullable
   protected E a(fdk $$0, Predicate<E> $$1) {
      return this.a($$0, $$1, this.i());
   }

   @Nullable
   protected E a(fdk $$0, Predicate<E> $$1, @Nullable E $$2) {
      int $$3 = switch ($$0) {
         case d, c -> 0;
         case a -> -1;
         case b -> 1;
      };
      if (!this.l().isEmpty() && $$3 != 0) {
         int $$4;
         if ($$2 == null) {
            $$4 = $$3 > 0 ? 0 : this.l().size() - 1;
         } else {
            $$4 = this.l().indexOf($$2) + $$3;
         }

         for (int $$6 = $$4; $$6 >= 0 && $$6 < this.m.size(); $$6 += $$3) {
            E $$7 = this.l().get($$6);
            if ($$1.test($$7)) {
               return $$7;
            }
         }
      }

      return null;
   }

   @Override
   public boolean c(double $$0, double $$1) {
      return $$1 >= (double)this.C() && $$1 <= (double)this.E() && $$0 >= (double)this.B() && $$0 <= (double)this.D();
   }

   protected void c(eyu $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.q();
      int $$5 = this.b();
      int $$6 = this.d - 4;
      int $$7 = this.n();

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         int $$9 = this.g($$8);
         int $$10 = this.h($$8);
         if ($$10 >= this.C() && $$9 <= this.E()) {
            this.a($$0, $$1, $$2, $$3, $$8, $$4, $$9, $$5, $$6);
         }
      }
   }

   protected void a(eyu $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      E $$9 = this.d($$4);
      $$9.b($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, Objects.equals(this.t, $$9), $$3);
      if (this.e($$4)) {
         int $$10 = this.aL_() ? -1 : -8355712;
         this.a($$0, $$6, $$7, $$8, $$10, -16777216);
      }

      $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, Objects.equals(this.t, $$9), $$3);
   }

   protected void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = this.B() + (this.g - $$2) / 2;
      int $$7 = this.B() + (this.g + $$2) / 2;
      $$0.a($$6, $$1 - 2, $$7, $$1 + $$3 + 2, $$4);
      $$0.a($$6 + 1, $$1 - 1, $$7 - 1, $$1 + $$3 + 1, $$5);
   }

   public int q() {
      return this.B() + this.g / 2 - this.b() / 2 + 2;
   }

   public int r() {
      return this.q() + this.b();
   }

   protected int g(int $$0) {
      return this.C() + 4 - (int)this.o() + $$0 * this.d + this.f;
   }

   protected int h(int $$0) {
      return this.g($$0) + this.d;
   }

   @Override
   public fda.a s() {
      if (this.aL_()) {
         return fda.a.c;
      } else {
         return this.t != null ? fda.a.b : fda.a.a;
      }
   }

   @Nullable
   protected E i(int $$0) {
      E $$1 = this.m.get($$0);
      return this.g(this.m.get($$0)) ? $$1 : null;
   }

   protected boolean g(E $$0) {
      boolean $$1 = this.m.remove($$0);
      if ($$1 && $$0 == this.i()) {
         this.a(null);
      }

      return $$1;
   }

   @Nullable
   protected E t() {
      return this.t;
   }

   void h(ezc.a<E> $$0) {
      $$0.a = this;
   }

   protected void a(fdc $$0, E $$1) {
      List<E> $$2 = this.l();
      if ($$2.size() > 1) {
         int $$3 = $$2.indexOf($$1);
         if ($$3 != -1) {
            $$0.a(fdb.b, vq.a("narrator.position.list", $$3 + 1, $$2.size()));
         }
      }
   }

   protected abstract static class a<E extends ezc.a<E>> implements fbd {
      @Deprecated
      ezc<E> a;

      @Override
      public void a(boolean $$0) {
      }

      @Override
      public boolean aL_() {
         return this.a.k() == this;
      }

      public abstract void a(eyu var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10);

      public void b(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
         ezc.this.h($$1);
         return $$2;
      }

      public void b(int $$0, E $$1) {
         this.b.add($$0, $$1);
         ezc.this.h($$1);
      }

      public E b(int $$0) {
         return this.b.remove($$0);
      }
   }
}
