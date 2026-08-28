import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fmd<T> extends fln {
   public static final BooleanSupplier a = frp::u;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final xl c;
   private int d;
   private T f;
   private final fmd.c<T> m;
   private final Function<T, xl> n;
   private final Function<fmd<T>, xz> o;
   private final fmd.b<T> p;
   private final boolean q;
   private final fka.l<T> r;

   fmd(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      xl $$4,
      xl $$5,
      int $$6,
      T $$7,
      fmd.c<T> $$8,
      Function<T, xl> $$9,
      Function<fmd<T>, xz> $$10,
      fmd.b<T> $$11,
      fka.l<T> $$12,
      boolean $$13
   ) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.f = $$7;
      this.m = $$8;
      this.n = $$9;
      this.o = $$10;
      this.p = $$11;
      this.q = $$13;
      this.r = $$12;
      this.f();
   }

   private void f() {
      this.a(this.r.apply(this.f));
   }

   @Override
   public void b() {
      if (frp.t()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = azn.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(azn.b(this.d + $$0, $$1.size()));
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if ($$3 > 0.0) {
         this.a(-1);
      } else if ($$3 < 0.0) {
         this.a(1);
      }

      return true;
   }

   public void a(T $$0) {
      List<T> $$1 = this.m.a();
      int $$2 = $$1.indexOf($$0);
      if ($$2 != -1) {
         this.d = $$2;
      }

      this.b($$0);
   }

   private void b(T $$0) {
      xl $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private xl c(T $$0) {
      return (xl)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xz d(T $$0) {
      return xk.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xz aO_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fpu $$0) {
      $$0.a(fpt.a, this.aO_());
      if (this.j) {
         T $$1 = this.b(1);
         xl $$2 = this.c($$1);
         if (this.aM_()) {
            $$0.a(fpt.d, xl.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fpt.d, xl.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xz c() {
      return a_((xl)(this.q ? this.d(this.f) : this.z()));
   }

   public static <T> fmd.a<T> a(Function<T, xl> $$0) {
      return new fmd.a<>($$0);
   }

   public static fmd.a<Boolean> a(xl $$0, xl $$1) {
      return new fmd.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fmd.a<Boolean> e() {
      return new fmd.a<Boolean>($$0 -> $$0 ? xk.b : xk.c).a(b);
   }

   public static fmd.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, xl> c;
      private fka.l<T> d = $$0x -> null;
      private Function<fmd<T>, xz> e = fmd::c;
      private fmd.c<T> f = fmd.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, xl> $$0) {
         this.c = $$0;
      }

      public fmd.a<T> a(Collection<T> $$0) {
         return this.a(fmd.c.a($$0));
      }

      @SafeVarargs
      public final fmd.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fmd.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fmd.c.a(fmd.a, $$0, $$1));
      }

      public fmd.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fmd.c.a($$0, $$1, $$2));
      }

      public fmd.a<T> a(fmd.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fmd.a<T> a(fka.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fmd.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fmd.a<T> a(Function<fmd<T>, xz> $$0) {
         this.e = $$0;
         return this;
      }

      public fmd.a<T> a() {
         this.g = true;
         return this;
      }

      public fmd<T> a(xl $$0, fmd.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fmd<T> a(int $$0, int $$1, int $$2, int $$3, xl $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fmd<T> a(int $$0, int $$1, int $$2, int $$3, xl $$4, fmd.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            xl $$8 = this.c.apply($$7);
            xl $$9 = (xl)(this.g ? $$8 : xk.a($$4, $$8));
            return new fmd<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fmd<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fmd.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fmd.c<T>() {
            @Override
            public List<T> a() {
               return $$1;
            }

            @Override
            public List<T> b() {
               return $$1;
            }
         };
      }

      static <T> fmd.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fmd.c<T>() {
            @Override
            public List<T> a() {
               return $$0.getAsBoolean() ? $$4 : $$3;
            }

            @Override
            public List<T> b() {
               return $$3;
            }
         };
      }
   }
}
