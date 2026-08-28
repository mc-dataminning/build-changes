import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class fuh<E extends fuh.a<E>> extends fue {
   private static final alk a = alk.b("textures/gui/menu_list_background.png");
   private static final alk m = alk.b("textures/gui/inworld_menu_list_background.png");
   protected final frf c;
   protected final int d;
   private final List<E> n = new fuh.b();
   protected boolean e = true;
   private boolean o;
   protected int f;
   @Nullable
   private E p;
   @Nullable
   private E q;

   public fuh(frf $$0, int $$1, int $$2, int $$3, int $$4) {
      super(0, $$3, $$1, $$2, xb.a);
      this.c = $$0;
      this.d = $$4;
   }

   public fuh(frf $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this($$0, $$1, $$2, $$3, $$4);
      this.o = true;
      this.f = $$5;
   }

   @Nullable
   public E p() {
      return this.p;
   }

   public void a(int $$0) {
      if ($$0 == -1) {
         this.a(null);
      } else if (this.t() != 0) {
         this.a(this.b($$0));
      }
   }

   public void a(@Nullable E $$0) {
      this.p = $$0;
   }

   public E q() {
      return this.n.get(0);
   }

   @Nullable
   public E r() {
      return (E)super.aM_();
   }

   @Override
   public final List<E> aI_() {
      return this.n;
   }

   protected void s() {
      this.n.clear();
      this.p = null;
   }

   public void a(Collection<E> $$0) {
      this.s();
      this.n.addAll($$0);
   }

   protected E b(int $$0) {
      return this.aI_().get($$0);
   }

   protected int b(E $$0) {
      this.n.add($$0);
      return this.n.size() - 1;
   }

   protected void c(E $$0) {
      double $$1 = (double)this.i() - this.g();
      this.n.add(0, $$0);
      this.a((double)this.i() - $$1);
   }

   protected boolean d(E $$0) {
      double $$1 = (double)this.i() - this.g();
      boolean $$2 = this.g($$0);
      this.a((double)this.i() - $$1);
      return $$2;
   }

   protected int t() {
      return this.aI_().size();
   }

   protected boolean c(int $$0) {
      return Objects.equals(this.p(), this.aI_().get($$0));
   }

   @Nullable
   protected final E c(double $$0, double $$1) {
      int $$2 = this.a() / 2;
      int $$3 = this.F() + this.g / 2;
      int $$4 = $$3 - $$2;
      int $$5 = $$3 + $$2;
      int $$6 = azq.a($$1 - (double)this.G()) - this.f + (int)this.g() - 4;
      int $$7 = $$6 / this.d;
      return $$0 >= (double)$$4 && $$0 <= (double)$$5 && $$7 >= 0 && $$6 >= 0 && $$7 < this.t() ? this.aI_().get($$7) : null;
   }

   public void a(int $$0, fyb $$1) {
      this.b($$0, $$1.d(), $$1.c());
   }

   public void b(int $$0, int $$1, int $$2) {
      this.b($$0, $$1);
      this.c(0, $$2);
      this.h();
   }

   @Override
   protected int n() {
      return this.t() * this.d + this.f + 4;
   }

   protected void a(ftz $$0, int $$1, int $$2) {
   }

   protected void b(ftz $$0, int $$1, int $$2) {
   }

   @Override
   public void b(ftz $$0, int $$1, int $$2, float $$3) {
      this.q = this.a_((double)$$1, (double)$$2) ? this.c((double)$$1, (double)$$2) : null;
      this.c($$0);
      this.d($$0);
      if (this.o) {
         int $$4 = this.u();
         int $$5 = this.G() + 4 - (int)this.g();
         this.a($$0, $$4, $$5);
      }

      this.c($$0, $$1, $$2, $$3);
      $$0.e();
      this.b($$0);
      this.a($$0);
      this.b($$0, $$1, $$2);
   }

   protected void b(ftz $$0) {
      alk $$1 = this.c.s == null ? gaf.h : gaf.j;
      alk $$2 = this.c.s == null ? gaf.i : gaf.k;
      $$0.a(gsn::H, $$1, this.F(), this.G() - 2, 0.0F, 0.0F, this.A(), 2, 32, 2);
      $$0.a(gsn::H, $$2, this.F(), this.I(), 0.0F, 0.0F, this.A(), 2, 32, 2);
   }

   protected void c(ftz $$0) {
      alk $$1 = this.c.s == null ? a : m;
      $$0.a(gsn::H, $$1, this.F(), this.G(), (float)this.H(), (float)(this.I() + (int)this.g()), this.A(), this.y(), 32, 32);
   }

   protected void d(ftz $$0) {
      $$0.c(this.F(), this.G(), this.H(), this.I());
   }

   protected void e(E $$0) {
      this.a((double)(this.aI_().indexOf($$0) * this.d + this.d / 2 - this.h / 2));
   }

   protected void f(E $$0) {
      int $$1 = this.d(this.aI_().indexOf($$0));
      int $$2 = $$1 - this.G() - 4 - this.d;
      if ($$2 < 0) {
         this.m($$2);
      }

      int $$3 = this.I() - $$1 - this.d - this.d;
      if ($$3 < 0) {
         this.m(-$$3);
      }
   }

   private void m(int $$0) {
      this.a(this.g() + (double)$$0);
   }

   @Override
   protected double o() {
      return (double)this.d / 2.0;
   }

   @Override
   protected int l() {
      return this.v() + 6 + 2;
   }

   @Override
   public Optional<fwk> d(double $$0, double $$1) {
      return Optional.ofNullable(this.c($$0, $$1));
   }

   @Override
   public void a(@Nullable fwk $$0) {
      E $$1 = this.r();
      if ($$1 != $$0 && $$1 instanceof fwj $$2) {
         $$2.a(null);
      }

      super.a($$0);
      int $$3 = this.n.indexOf($$0);
      if ($$3 >= 0) {
         E $$4 = this.n.get($$3);
         this.a($$4);
         if (this.c.aX().b()) {
            this.f($$4);
         }
      }
   }

   @Nullable
   protected E a(fys $$0) {
      return this.a($$0, $$0x -> true);
   }

   @Nullable
   protected E a(fys $$0, Predicate<E> $$1) {
      return this.a($$0, $$1, this.p());
   }

   @Nullable
   protected E a(fys $$0, Predicate<E> $$1, @Nullable E $$2) {
      int $$3 = switch ($$0) {
         case d, c -> 0;
         case a -> -1;
         case b -> 1;
      };
      if (!this.aI_().isEmpty() && $$3 != 0) {
         int $$4;
         if ($$2 == null) {
            $$4 = $$3 > 0 ? 0 : this.aI_().size() - 1;
         } else {
            $$4 = this.aI_().indexOf($$2) + $$3;
         }

         for (int $$6 = $$4; $$6 >= 0 && $$6 < this.n.size(); $$6 += $$3) {
            E $$7 = this.aI_().get($$6);
            if ($$1.test($$7)) {
               return $$7;
            }
         }
      }

      return null;
   }

   protected void c(ftz $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.u();
      int $$5 = this.a();
      int $$6 = this.d - 4;
      int $$7 = this.t();

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         int $$9 = this.d($$8);
         int $$10 = this.e($$8);
         if ($$10 >= this.G() && $$9 <= this.I()) {
            this.a($$0, $$1, $$2, $$3, $$8, $$4, $$9, $$5, $$6);
         }
      }
   }

   protected void a(ftz $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      E $$9 = this.b($$4);
      $$9.b($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, Objects.equals(this.q, $$9), $$3);
      if (this.c($$4)) {
         int $$10 = this.aN_() ? -1 : -8355712;
         this.a($$0, $$6, $$7, $$8, $$10, -16777216);
      }

      $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, Objects.equals(this.q, $$9), $$3);
   }

   protected void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = this.F() + (this.g - $$2) / 2;
      int $$7 = this.F() + (this.g + $$2) / 2;
      $$0.a($$6, $$1 - 2, $$7, $$1 + $$3 + 2, $$4);
      $$0.a($$6 + 1, $$1 - 1, $$7 - 1, $$1 + $$3 + 1, $$5);
   }

   public int u() {
      return this.F() + this.g / 2 - this.a() / 2 + 2;
   }

   public int v() {
      return this.u() + this.a();
   }

   public int d(int $$0) {
      return this.G() + 4 - (int)this.g() + $$0 * this.d + this.f;
   }

   public int e(int $$0) {
      return this.d($$0) + this.d;
   }

   public int a() {
      return 220;
   }

   @Override
   public fyi.a w() {
      if (this.aN_()) {
         return fyi.a.c;
      } else {
         return this.q != null ? fyi.a.b : fyi.a.a;
      }
   }

   @Nullable
   protected E f(int $$0) {
      E $$1 = this.n.get($$0);
      return this.g(this.n.get($$0)) ? $$1 : null;
   }

   protected boolean g(E $$0) {
      boolean $$1 = this.n.remove($$0);
      if ($$1 && $$0 == this.p()) {
         this.a(null);
      }

      return $$1;
   }

   @Nullable
   protected E x() {
      return this.q;
   }

   void h(fuh.a<E> $$0) {
      $$0.a = this;
   }

   protected void a(fyk $$0, E $$1) {
      List<E> $$2 = this.aI_();
      if ($$2.size() > 1) {
         int $$3 = $$2.indexOf($$1);
         if ($$3 != -1) {
            $$0.a(fyj.b, xc.a("narrator.position.list", $$3 + 1, $$2.size()));
         }
      }
   }

   protected abstract static class a<E extends fuh.a<E>> implements fwk {
      @Deprecated
      fuh<E> a;

      @Override
      public void a(boolean $$0) {
      }

      @Override
      public boolean aN_() {
         return this.a.r() == this;
      }

      public abstract void a(ftz var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10);

      public void b(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public boolean a_(double $$0, double $$1) {
         return Objects.equals(this.a.c($$0, $$1), this);
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
         fuh.this.h($$1);
         return $$2;
      }

      public void b(int $$0, E $$1) {
         this.b.add($$0, $$1);
         fuh.this.h($$1);
      }

      public E b(int $$0) {
         return this.b.remove($$0);
      }
   }
}
