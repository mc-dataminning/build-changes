import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class flo<T> extends fky {
   public static final BooleanSupplier a = fra::u;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final xi c;
   private int d;
   private T f;
   private final flo.c<T> m;
   private final Function<T, xi> n;
   private final Function<flo<T>, xw> o;
   private final flo.b<T> p;
   private final boolean q;
   private final fjl.l<T> r;

   flo(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      xi $$4,
      xi $$5,
      int $$6,
      T $$7,
      flo.c<T> $$8,
      Function<T, xi> $$9,
      Function<flo<T>, xw> $$10,
      flo.b<T> $$11,
      fjl.l<T> $$12,
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
      if (fra.t()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = azk.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(azk.b(this.d + $$0, $$1.size()));
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
      xi $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private xi c(T $$0) {
      return (xi)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xw d(T $$0) {
      return xh.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xw aO_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fpf $$0) {
      $$0.a(fpe.a, this.aO_());
      if (this.j) {
         T $$1 = this.b(1);
         xi $$2 = this.c($$1);
         if (this.aM_()) {
            $$0.a(fpe.d, xi.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fpe.d, xi.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xw c() {
      return a_((xi)(this.q ? this.d(this.f) : this.z()));
   }

   public static <T> flo.a<T> a(Function<T, xi> $$0) {
      return new flo.a<>($$0);
   }

   public static flo.a<Boolean> a(xi $$0, xi $$1) {
      return new flo.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static flo.a<Boolean> e() {
      return new flo.a<Boolean>($$0 -> $$0 ? xh.b : xh.c).a(b);
   }

   public static flo.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, xi> c;
      private fjl.l<T> d = $$0x -> null;
      private Function<flo<T>, xw> e = flo::c;
      private flo.c<T> f = flo.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, xi> $$0) {
         this.c = $$0;
      }

      public flo.a<T> a(Collection<T> $$0) {
         return this.a(flo.c.a($$0));
      }

      @SafeVarargs
      public final flo.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public flo.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(flo.c.a(flo.a, $$0, $$1));
      }

      public flo.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(flo.c.a($$0, $$1, $$2));
      }

      public flo.a<T> a(flo.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public flo.a<T> a(fjl.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public flo.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public flo.a<T> a(Function<flo<T>, xw> $$0) {
         this.e = $$0;
         return this;
      }

      public flo.a<T> a() {
         this.g = true;
         return this;
      }

      public flo<T> a(xi $$0, flo.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public flo<T> a(int $$0, int $$1, int $$2, int $$3, xi $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public flo<T> a(int $$0, int $$1, int $$2, int $$3, xi $$4, flo.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            xi $$8 = this.c.apply($$7);
            xi $$9 = (xi)(this.g ? $$8 : xh.a($$4, $$8));
            return new flo<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(flo<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> flo.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new flo.c<T>() {
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

      static <T> flo.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new flo.c<T>() {
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
