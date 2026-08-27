import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class esl<E extends esl.a<E>> extends eui implements ets, ewg {
   protected static final int b = 6;
   private static final aex a = new aex("widget/scroller");
   protected final eqv c;
   protected final int d;
   private final List<E> m = new esl.b();
   protected int e;
   protected int f;
   protected int g;
   protected int h;
   protected int i;
   protected int j;
   protected boolean k = true;
   private double n;
   private boolean o;
   protected int l;
   private boolean p;
   @Nullable
   private E q;
   private boolean s = true;
   @Nullable
   private E t;

   public esl(eqv $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.c = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.d = $$5;
      this.j = 0;
      this.i = $$1;
   }

   protected void a(boolean $$0, int $$1) {
      this.o = $$0;
      this.l = $$1;
      if (!$$0) {
         this.l = 0;
      }
   }

   public int b() {
      return 220;
   }

   @Nullable
   public E f() {
      return this.q;
   }

   public void a(@Nullable E $$0) {
      this.q = $$0;
   }

   public E g() {
      return this.m.get(0);
   }

   public void a(boolean $$0) {
      this.s = $$0;
   }

   @Nullable
   public E h() {
      return (E)super.t();
   }

   @Override
   public final List<E> i() {
      return this.m;
   }

   protected void j() {
      this.m.clear();
      this.q = null;
   }

   protected void a(Collection<E> $$0) {
      this.j();
      this.m.addAll($$0);
   }

   protected E d(int $$0) {
      return this.i().get($$0);
   }

   protected int b(E $$0) {
      this.m.add($$0);
      return this.m.size() - 1;
   }

   protected void c(E $$0) {
      double $$1 = (double)this.m() - this.l();
      this.m.add(0, $$0);
      this.a((double)this.m() - $$1);
   }

   protected boolean d(E $$0) {
      double $$1 = (double)this.m() - this.l();
      boolean $$2 = this.g($$0);
      this.a((double)this.m() - $$1);
      return $$2;
   }

   protected int k() {
      return this.i().size();
   }

   protected boolean e(int $$0) {
      return Objects.equals(this.f(), this.i().get($$0));
   }

   @Nullable
   protected final E a(double $$0, double $$1) {
      int $$2 = this.b() / 2;
      int $$3 = this.j + this.e / 2;
      int $$4 = $$3 - $$2;
      int $$5 = $$3 + $$2;
      int $$6 = arx.a($$1 - (double)this.g) - this.l + (int)this.l() - 4;
      int $$7 = $$6 / this.d;
      return $$0 < (double)this.c() && $$0 >= (double)$$4 && $$0 <= (double)$$5 && $$7 >= 0 && $$6 >= 0 && $$7 < this.k() ? this.i().get($$7) : null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = 0;
      this.i = $$0;
   }

   public void f(int $$0) {
      this.j = $$0;
      this.i = $$0 + this.e;
   }

   protected int a() {
      return this.k() * this.d + this.l;
   }

   protected void a(int $$0, int $$1) {
   }

   protected void a(esf $$0, int $$1, int $$2) {
   }

   protected void b(esf $$0, int $$1, int $$2) {
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      this.t = this.a_((double)$$1, (double)$$2) ? this.a((double)$$1, (double)$$2) : null;
      if (this.s) {
         $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
         int $$4 = 32;
         $$0.a(eyk.d, this.j, this.g, (float)this.i, (float)(this.h + (int)this.l()), this.i - this.j, this.h - this.g, 32, 32);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      this.a($$0);
      if (this.o) {
         int $$5 = this.o();
         int $$6 = this.g + 4 - (int)this.l();
         this.a($$0, $$5, $$6);
      }

      this.b($$0, $$1, $$2, $$3);
      $$0.f();
      if (this.s) {
         int $$7 = 4;
         $$0.a(fom.D(), this.j, this.g, this.i, this.g + 4, -16777216, 0, 0);
         $$0.a(fom.D(), this.j, this.h - 4, this.i, this.h, 0, -16777216, 0);
      }

      int $$8 = this.m();
      if ($$8 > 0) {
         int $$9 = this.c();
         int $$10 = (int)((float)((this.h - this.g) * (this.h - this.g)) / (float)this.a());
         $$10 = arx.a($$10, 32, this.h - this.g - 8);
         int $$11 = (int)this.l() * (this.h - this.g - $$10) / $$8 + this.g;
         if ($$11 < this.g) {
            $$11 = this.g;
         }

         $$0.a($$9, this.g, $$9 + 6, this.h, -16777216);
         $$0.a(a, $$9, $$11, 6, $$10);
      }

      this.b($$0, $$1, $$2);
      RenderSystem.disableBlend();
   }

   protected void a(esf $$0) {
      $$0.c(this.j, this.g, this.i, this.h);
   }

   protected void e(E $$0) {
      this.a((double)(this.i().indexOf($$0) * this.d + this.d / 2 - (this.h - this.g) / 2));
   }

   protected void f(E $$0) {
      int $$1 = this.h(this.i().indexOf($$0));
      int $$2 = $$1 - this.g - 4 - this.d;
      if ($$2 < 0) {
         this.a($$2);
      }

      int $$3 = this.h - $$1 - this.d - this.d;
      if ($$3 < 0) {
         this.a(-$$3);
      }
   }

   private void a(int $$0) {
      this.a(this.l() + (double)$$0);
   }

   public double l() {
      return this.n;
   }

   public void a(double $$0) {
      this.n = arx.a($$0, 0.0, (double)this.m());
   }

   public int m() {
      return Math.max(0, this.a() - (this.h - this.g - 4));
   }

   public int n() {
      return (int)this.l() - this.f - this.l;
   }

   protected void c(double $$0, double $$1, int $$2) {
      this.p = $$2 == 0 && $$0 >= (double)this.c() && $$0 < (double)(this.c() + 6);
   }

   protected int c() {
      return this.e / 2 + 124;
   }

   protected boolean g(int $$0) {
      return $$0 == 0;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (!this.g($$2)) {
         return false;
      } else {
         this.c($$0, $$1, $$2);
         if (!this.a_($$0, $$1)) {
            return false;
         } else {
            E $$3 = this.a($$0, $$1);
            if ($$3 != null) {
               if ($$3.a($$0, $$1, $$2)) {
                  E $$4 = this.h();
                  if ($$4 != $$3 && $$4 instanceof euj $$5) {
                     $$5.a(null);
                  }

                  this.a($$3);
                  this.b(true);
                  return true;
               } else {
                  return this.p;
               }
            } else {
               this.a((int)($$0 - (double)(this.j + this.e / 2 - this.b() / 2)), (int)($$1 - (double)this.g) + (int)this.l() - 4);
               return true;
            }
         }
      }
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if (this.h() != null) {
         this.h().b($$0, $$1, $$2);
      }

      return false;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else if ($$2 == 0 && this.p) {
         if ($$1 < (double)this.g) {
            this.a(0.0);
         } else if ($$1 > (double)this.h) {
            this.a((double)this.m());
         } else {
            double $$5 = (double)Math.max(1, this.m());
            int $$6 = this.h - this.g;
            int $$7 = arx.a((int)((float)($$6 * $$6) / (float)this.a()), 32, $$6 - 8);
            double $$8 = Math.max(1.0, $$5 / (double)($$6 - $$7));
            this.a(this.l() + $$4 * $$8);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      this.a(this.l() - $$3 * (double)this.d / 2.0);
      return true;
   }

   @Override
   public void a(@Nullable euk $$0) {
      super.a($$0);
      int $$1 = this.m.indexOf($$0);
      if ($$1 >= 0) {
         E $$2 = this.m.get($$1);
         this.a($$2);
         if (this.c.aU().b()) {
            this.f($$2);
         }
      }
   }

   @Nullable
   protected E a(ewq $$0) {
      return this.a($$0, $$0x -> true);
   }

   @Nullable
   protected E a(ewq $$0, Predicate<E> $$1) {
      return this.a($$0, $$1, this.f());
   }

   @Nullable
   protected E a(ewq $$0, Predicate<E> $$1, @Nullable E $$2) {
      int $$3 = switch ($$0) {
         case d, c -> 0;
         case a -> -1;
         case b -> 1;
      };
      if (!this.i().isEmpty() && $$3 != 0) {
         int $$4;
         if ($$2 == null) {
            $$4 = $$3 > 0 ? 0 : this.i().size() - 1;
         } else {
            $$4 = this.i().indexOf($$2) + $$3;
         }

         for (int $$6 = $$4; $$6 >= 0 && $$6 < this.m.size(); $$6 += $$3) {
            E $$7 = this.i().get($$6);
            if ($$1.test($$7)) {
               return $$7;
            }
         }
      }

      return null;
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return $$1 >= (double)this.g && $$1 <= (double)this.h && $$0 >= (double)this.j && $$0 <= (double)this.i;
   }

   protected void b(esf $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.o();
      int $$5 = this.b();
      int $$6 = this.d - 4;
      int $$7 = this.k();

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         int $$9 = this.h($$8);
         int $$10 = this.i($$8);
         if ($$10 >= this.g && $$9 <= this.h) {
            this.a($$0, $$1, $$2, $$3, $$8, $$4, $$9, $$5, $$6);
         }
      }
   }

   protected void a(esf $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      E $$9 = this.d($$4);
      $$9.b($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, Objects.equals(this.t, $$9), $$3);
      if (this.e($$4)) {
         int $$10 = this.aD_() ? -1 : -8355712;
         this.a($$0, $$6, $$7, $$8, $$10, -16777216);
      }

      $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, Objects.equals(this.t, $$9), $$3);
   }

   protected void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = this.j + (this.e - $$2) / 2;
      int $$7 = this.j + (this.e + $$2) / 2;
      $$0.a($$6, $$1 - 2, $$7, $$1 + $$3 + 2, $$4);
      $$0.a($$6 + 1, $$1 - 1, $$7 - 1, $$1 + $$3 + 1, $$5);
   }

   public int o() {
      return this.j + this.e / 2 - this.b() / 2 + 2;
   }

   public int p() {
      return this.o() + this.b();
   }

   protected int h(int $$0) {
      return this.g + 4 - (int)this.l() + $$0 * this.d + this.l;
   }

   protected int i(int $$0) {
      return this.h($$0) + this.d;
   }

   @Override
   public ewg.a q() {
      if (this.aD_()) {
         return ewg.a.c;
      } else {
         return this.t != null ? ewg.a.b : ewg.a.a;
      }
   }

   @Nullable
   protected E j(int $$0) {
      E $$1 = this.m.get($$0);
      return this.g(this.m.get($$0)) ? $$1 : null;
   }

   protected boolean g(E $$0) {
      boolean $$1 = this.m.remove($$0);
      if ($$1 && $$0 == this.f()) {
         this.a(null);
      }

      return $$1;
   }

   @Nullable
   protected E r() {
      return this.t;
   }

   void h(esl.a<E> $$0) {
      $$0.a = this;
   }

   protected void a(ewi $$0, E $$1) {
      List<E> $$2 = this.i();
      if ($$2.size() > 1) {
         int $$3 = $$2.indexOf($$1);
         if ($$3 != -1) {
            $$0.a(ewh.b, tm.a("narrator.position.list", $$3 + 1, $$2.size()));
         }
      }
   }

   @Override
   public ews s() {
      return new ews(this.j, this.g, this.i - this.j, this.h - this.g);
   }

   protected abstract static class a<E extends esl.a<E>> implements euk {
      @Deprecated
      esl<E> a;

      @Override
      public void b_(boolean $$0) {
      }

      @Override
      public boolean aD_() {
         return this.a.h() == this;
      }

      public abstract void a(esf var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10);

      public void b(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public boolean a_(double $$0, double $$1) {
         return Objects.equals(this.a.a($$0, $$1), this);
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
         esl.this.h($$1);
         return $$2;
      }

      public void b(int $$0, E $$1) {
         this.b.add($$0, $$1);
         esl.this.h($$1);
      }

      public E b(int $$0) {
         return this.b.remove($$0);
      }
   }
}
