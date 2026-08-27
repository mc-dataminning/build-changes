import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class epc<E extends epc.a<E>> extends eqr implements eqh, esn {
   protected final enn b;
   protected final int c;
   private final List<E> a = new epc.b();
   protected int d;
   protected int e;
   protected int f;
   protected int g;
   protected int h;
   protected int i;
   protected boolean j = true;
   private double l;
   private boolean m = true;
   private boolean n;
   protected int k;
   private boolean o;
   @Nullable
   private E p;
   private boolean q = true;
   private boolean r = true;
   @Nullable
   private E s;

   public epc(enn $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.c = $$5;
      this.i = 0;
      this.h = $$1;
   }

   public void a(boolean $$0) {
      this.m = $$0;
   }

   protected void a(boolean $$0, int $$1) {
      this.n = $$0;
      this.k = $$1;
      if (!$$0) {
         this.k = 0;
      }
   }

   public int b() {
      return 220;
   }

   @Nullable
   public E f() {
      return this.p;
   }

   public void a(@Nullable E $$0) {
      this.p = $$0;
   }

   public E g() {
      return this.a.get(0);
   }

   public void b(boolean $$0) {
      this.q = $$0;
   }

   public void c(boolean $$0) {
      this.r = $$0;
   }

   @Nullable
   public E h() {
      return (E)super.t();
   }

   @Override
   public final List<E> i() {
      return this.a;
   }

   protected void j() {
      this.a.clear();
      this.p = null;
   }

   protected void a(Collection<E> $$0) {
      this.j();
      this.a.addAll($$0);
   }

   protected E d(int $$0) {
      return this.i().get($$0);
   }

   protected int b(E $$0) {
      this.a.add($$0);
      return this.a.size() - 1;
   }

   protected void c(E $$0) {
      double $$1 = (double)this.m() - this.l();
      this.a.add(0, $$0);
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
      int $$3 = this.i + this.d / 2;
      int $$4 = $$3 - $$2;
      int $$5 = $$3 + $$2;
      int $$6 = apa.a($$1 - (double)this.f) - this.k + (int)this.l() - 4;
      int $$7 = $$6 / this.c;
      return $$0 < (double)this.c() && $$0 >= (double)$$4 && $$0 <= (double)$$5 && $$7 >= 0 && $$6 >= 0 && $$7 < this.k() ? this.i().get($$7) : null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.i = 0;
      this.h = $$0;
   }

   public void f(int $$0) {
      this.i = $$0;
      this.h = $$0 + this.d;
   }

   protected int a() {
      return this.k() * this.c + this.k;
   }

   protected void a(int $$0, int $$1) {
   }

   protected void a(eox $$0, int $$1, int $$2) {
   }

   protected void a(eox $$0) {
   }

   protected void b(eox $$0, int $$1, int $$2) {
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      int $$4 = this.c();
      int $$5 = $$4 + 6;
      this.s = this.a_((double)$$1, (double)$$2) ? this.a((double)$$1, (double)$$2) : null;
      if (this.q) {
         $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
         int $$6 = 32;
         $$0.a(euq.d, this.i, this.f, (float)this.h, (float)(this.g + (int)this.l()), this.h - this.i, this.g - this.f, 32, 32);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      int $$7 = this.o();
      int $$8 = this.f + 4 - (int)this.l();
      this.b($$0);
      if (this.n) {
         this.a($$0, $$7, $$8);
      }

      this.b($$0, $$1, $$2, $$3);
      $$0.f();
      if (this.r) {
         int $$9 = 32;
         $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
         $$0.a(euq.d, this.i, 0, 0.0F, 0.0F, this.d, this.f, 32, 32);
         $$0.a(euq.d, this.i, this.g, 0.0F, (float)this.g, this.d, this.e - this.g, 32, 32);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$10 = 4;
         $$0.a(fkf.D(), this.i, this.f, this.h, this.f + 4, -16777216, 0, 0);
         $$0.a(fkf.D(), this.i, this.g - 4, this.h, this.g, 0, -16777216, 0);
      }

      int $$11 = this.m();
      if ($$11 > 0) {
         int $$12 = (int)((float)((this.g - this.f) * (this.g - this.f)) / (float)this.a());
         $$12 = apa.a($$12, 32, this.g - this.f - 8);
         int $$13 = (int)this.l() * (this.g - this.f - $$12) / $$11 + this.f;
         if ($$13 < this.f) {
            $$13 = this.f;
         }

         $$0.a($$4, this.f, $$5, this.g, -16777216);
         $$0.a($$4, $$13, $$5, $$13 + $$12, -8355712);
         $$0.a($$4, $$13, $$5 - 1, $$13 + $$12 - 1, -4144960);
      }

      this.b($$0, $$1, $$2);
      RenderSystem.disableBlend();
   }

   protected void b(eox $$0) {
      $$0.c(this.i, this.f, this.h, this.g);
   }

   protected void e(E $$0) {
      this.a((double)(this.i().indexOf($$0) * this.c + this.c / 2 - (this.g - this.f) / 2));
   }

   protected void f(E $$0) {
      int $$1 = this.g(this.i().indexOf($$0));
      int $$2 = $$1 - this.f - 4 - this.c;
      if ($$2 < 0) {
         this.a($$2);
      }

      int $$3 = this.g - $$1 - this.c - this.c;
      if ($$3 < 0) {
         this.a(-$$3);
      }
   }

   private void a(int $$0) {
      this.a(this.l() + (double)$$0);
   }

   public double l() {
      return this.l;
   }

   public void a(double $$0) {
      this.l = apa.a($$0, 0.0, (double)this.m());
   }

   public int m() {
      return Math.max(0, this.a() - (this.g - this.f - 4));
   }

   public int n() {
      return (int)this.l() - this.e - this.k;
   }

   protected void c(double $$0, double $$1, int $$2) {
      this.o = $$2 == 0 && $$0 >= (double)this.c() && $$0 < (double)(this.c() + 6);
   }

   protected int c() {
      return this.d / 2 + 124;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.c($$0, $$1, $$2);
      if (!this.a_($$0, $$1)) {
         return false;
      } else {
         E $$3 = this.a($$0, $$1);
         if ($$3 != null) {
            if ($$3.a($$0, $$1, $$2)) {
               E $$4 = this.h();
               if ($$4 != $$3 && $$4 instanceof eqs $$5) {
                  $$5.a(null);
               }

               this.a($$3);
               this.c_(true);
               return true;
            }
         } else if ($$2 == 0) {
            this.a((int)($$0 - (double)(this.i + this.d / 2 - this.b() / 2)), (int)($$1 - (double)this.f) + (int)this.l() - 4);
            return true;
         }

         return this.o;
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
      } else if ($$2 == 0 && this.o) {
         if ($$1 < (double)this.f) {
            this.a(0.0);
         } else if ($$1 > (double)this.g) {
            this.a((double)this.m());
         } else {
            double $$5 = (double)Math.max(1, this.m());
            int $$6 = this.g - this.f;
            int $$7 = apa.a((int)((float)($$6 * $$6) / (float)this.a()), 32, $$6 - 8);
            double $$8 = Math.max(1.0, $$5 / (double)($$6 - $$7));
            this.a(this.l() + $$4 * $$8);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2) {
      this.a(this.l() - $$2 * (double)this.c / 2.0);
      return true;
   }

   @Override
   public void a(@Nullable eqt $$0) {
      super.a($$0);
      int $$1 = this.a.indexOf($$0);
      if ($$1 >= 0) {
         E $$2 = this.a.get($$1);
         this.a($$2);
         if (this.b.aT().b()) {
            this.f($$2);
         }
      }
   }

   @Nullable
   protected E a(esx $$0) {
      return this.a($$0, $$0x -> true);
   }

   @Nullable
   protected E a(esx $$0, Predicate<E> $$1) {
      return this.a($$0, $$1, this.f());
   }

   @Nullable
   protected E a(esx $$0, Predicate<E> $$1, @Nullable E $$2) {
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

         for (int $$6 = $$4; $$6 >= 0 && $$6 < this.a.size(); $$6 += $$3) {
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
      return $$1 >= (double)this.f && $$1 <= (double)this.g && $$0 >= (double)this.i && $$0 <= (double)this.h;
   }

   protected void b(eox $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.o();
      int $$5 = this.b();
      int $$6 = this.c - 4;
      int $$7 = this.k();

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         int $$9 = this.g($$8);
         int $$10 = this.h($$8);
         if ($$10 >= this.f && $$9 <= this.g) {
            this.a($$0, $$1, $$2, $$3, $$8, $$4, $$9, $$5, $$6);
         }
      }
   }

   protected void a(eox $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      E $$9 = this.d($$4);
      $$9.b($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, Objects.equals(this.s, $$9), $$3);
      if (this.m && this.e($$4)) {
         int $$10 = this.aB_() ? -1 : -8355712;
         this.a($$0, $$6, $$7, $$8, $$10, -16777216);
      }

      $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, Objects.equals(this.s, $$9), $$3);
   }

   protected void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = this.i + (this.d - $$2) / 2;
      int $$7 = this.i + (this.d + $$2) / 2;
      $$0.a($$6, $$1 - 2, $$7, $$1 + $$3 + 2, $$4);
      $$0.a($$6 + 1, $$1 - 1, $$7 - 1, $$1 + $$3 + 1, $$5);
   }

   public int o() {
      return this.i + this.d / 2 - this.b() / 2 + 2;
   }

   public int p() {
      return this.o() + this.b();
   }

   protected int g(int $$0) {
      return this.f + 4 - (int)this.l() + $$0 * this.c + this.k;
   }

   protected int h(int $$0) {
      return this.g($$0) + this.c;
   }

   @Override
   public esn.a q() {
      if (this.aB_()) {
         return esn.a.c;
      } else {
         return this.s != null ? esn.a.b : esn.a.a;
      }
   }

   @Nullable
   protected E i(int $$0) {
      E $$1 = this.a.get($$0);
      return this.g(this.a.get($$0)) ? $$1 : null;
   }

   protected boolean g(E $$0) {
      boolean $$1 = this.a.remove($$0);
      if ($$1 && $$0 == this.f()) {
         this.a(null);
      }

      return $$1;
   }

   @Nullable
   protected E r() {
      return this.s;
   }

   void h(epc.a<E> $$0) {
      $$0.a = this;
   }

   protected void a(esp $$0, E $$1) {
      List<E> $$2 = this.i();
      if ($$2.size() > 1) {
         int $$3 = $$2.indexOf($$1);
         if ($$3 != -1) {
            $$0.a(eso.b, sw.a("narrator.position.list", $$3 + 1, $$2.size()));
         }
      }
   }

   @Override
   public esz s() {
      return new esz(this.i, this.f, this.h - this.i, this.g - this.f);
   }

   protected abstract static class a<E extends epc.a<E>> implements eqt {
      @Deprecated
      epc<E> a;

      @Override
      public void b_(boolean $$0) {
      }

      @Override
      public boolean aB_() {
         return this.a.h() == this;
      }

      public abstract void a(eox var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10);

      public void b(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
         epc.this.h($$1);
         return $$2;
      }

      public void b(int $$0, E $$1) {
         this.b.add($$0, $$1);
         epc.this.h($$1);
      }

      public E b(int $$0) {
         return this.b.remove($$0);
      }
   }
}
