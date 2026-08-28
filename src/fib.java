import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fib<T> extends fhl {
   public static final BooleanSupplier a = fnl::t;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final wu c;
   private int d;
   private T f;
   private final fib.c<T> m;
   private final Function<T, wu> n;
   private final Function<fib<T>, xi> o;
   private final fib.b<T> p;
   private final boolean q;
   private final ffz.l<T> r;

   fib(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      wu $$4,
      wu $$5,
      int $$6,
      T $$7,
      fib.c<T> $$8,
      Function<T, wu> $$9,
      Function<fib<T>, xi> $$10,
      fib.b<T> $$11,
      ffz.l<T> $$12,
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
      if (fnl.s()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = ayg.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(ayg.b(this.d + $$0, $$1.size()));
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
      wu $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private wu c(T $$0) {
      return (wu)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xi d(T $$0) {
      return wt.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xi aM_() {
      return this.o.apply(this);
   }

   @Override
   public void a(flq $$0) {
      $$0.a(flp.a, this.aM_());
      if (this.j) {
         T $$1 = this.b(1);
         wu $$2 = this.c($$1);
         if (this.aK_()) {
            $$0.a(flp.d, wu.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(flp.d, wu.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xi c() {
      return a_((wu)(this.q ? this.d(this.f) : this.z()));
   }

   public static <T> fib.a<T> a(Function<T, wu> $$0) {
      return new fib.a<>($$0);
   }

   public static fib.a<Boolean> a(wu $$0, wu $$1) {
      return new fib.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fib.a<Boolean> e() {
      return new fib.a<Boolean>($$0 -> $$0 ? wt.b : wt.c).a(b);
   }

   public static fib.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, wu> c;
      private ffz.l<T> d = $$0x -> null;
      private Function<fib<T>, xi> e = fib::c;
      private fib.c<T> f = fib.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, wu> $$0) {
         this.c = $$0;
      }

      public fib.a<T> a(Collection<T> $$0) {
         return this.a(fib.c.a($$0));
      }

      @SafeVarargs
      public final fib.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fib.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fib.c.a(fib.a, $$0, $$1));
      }

      public fib.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fib.c.a($$0, $$1, $$2));
      }

      public fib.a<T> a(fib.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fib.a<T> a(ffz.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fib.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fib.a<T> a(Function<fib<T>, xi> $$0) {
         this.e = $$0;
         return this;
      }

      public fib.a<T> a() {
         this.g = true;
         return this;
      }

      public fib<T> a(wu $$0, fib.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fib<T> a(int $$0, int $$1, int $$2, int $$3, wu $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fib<T> a(int $$0, int $$1, int $$2, int $$3, wu $$4, fib.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            wu $$8 = this.c.apply($$7);
            wu $$9 = (wu)(this.g ? $$8 : wt.a($$4, $$8));
            return new fib<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fib<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fib.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fib.c<T>() {
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

      static <T> fib.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fib.c<T>() {
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
