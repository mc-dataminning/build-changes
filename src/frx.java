import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class frx<T> extends frg {
   public static final BooleanSupplier a = fxi::u;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final ww c;
   private int d;
   private T f;
   private final frx.c<T> m;
   private final Function<T, ww> n;
   private final Function<frx<T>, xk> o;
   private final frx.b<T> p;
   private final boolean q;
   private final foi.l<T> r;

   frx(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      ww $$4,
      ww $$5,
      int $$6,
      T $$7,
      frx.c<T> $$8,
      Function<T, ww> $$9,
      Function<frx<T>, xk> $$10,
      frx.b<T> $$11,
      foi.l<T> $$12,
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
      this.g();
   }

   private void g() {
      this.a(this.r.apply(this.f));
   }

   @Override
   public void b() {
      if (fxi.t()) {
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
      ww $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.g();
   }

   private ww c(T $$0) {
      return (ww)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xk d(T $$0) {
      return wv.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xk d() {
      return this.o.apply(this);
   }

   @Override
   public void a(fvn $$0) {
      $$0.a(fvm.a, this.d());
      if (this.j) {
         T $$1 = this.b(1);
         ww $$2 = this.c($$1);
         if (this.aI_()) {
            $$0.a(fvm.d, ww.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fvm.d, ww.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xk c() {
      return a_((ww)(this.q ? this.d(this.f) : this.B()));
   }

   public static <T> frx.a<T> a(Function<T, ww> $$0) {
      return new frx.a<>($$0);
   }

   public static frx.a<Boolean> a(ww $$0, ww $$1) {
      return new frx.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static frx.a<Boolean> e() {
      return new frx.a<Boolean>($$0 -> $$0 ? wv.b : wv.c).a(b);
   }

   public static frx.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, ww> c;
      private foi.l<T> d = $$0x -> null;
      private Function<frx<T>, xk> e = frx::c;
      private frx.c<T> f = frx.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, ww> $$0) {
         this.c = $$0;
      }

      public frx.a<T> a(Collection<T> $$0) {
         return this.a(frx.c.a($$0));
      }

      @SafeVarargs
      public final frx.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public frx.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(frx.c.a(frx.a, $$0, $$1));
      }

      public frx.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(frx.c.a($$0, $$1, $$2));
      }

      public frx.a<T> a(frx.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public frx.a<T> a(foi.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public frx.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public frx.a<T> a(Function<frx<T>, xk> $$0) {
         this.e = $$0;
         return this;
      }

      public frx.a<T> a() {
         this.g = true;
         return this;
      }

      public frx<T> a(ww $$0, frx.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public frx<T> a(int $$0, int $$1, int $$2, int $$3, ww $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public frx<T> a(int $$0, int $$1, int $$2, int $$3, ww $$4, frx.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            ww $$8 = this.c.apply($$7);
            ww $$9 = (ww)(this.g ? $$8 : wv.a($$4, $$8));
            return new frx<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(frx<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> frx.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new frx.c<T>() {
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

      static <T> frx.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new frx.c<T>() {
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
