import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fit<T> extends fid {
   public static final BooleanSupplier a = fod::t;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final wz c;
   private int d;
   private T f;
   private final fit.c<T> m;
   private final Function<T, wz> n;
   private final Function<fit<T>, xn> o;
   private final fit.b<T> p;
   private final boolean q;
   private final fgr.l<T> r;

   fit(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      wz $$4,
      wz $$5,
      int $$6,
      T $$7,
      fit.c<T> $$8,
      Function<T, wz> $$9,
      Function<fit<T>, xn> $$10,
      fit.b<T> $$11,
      fgr.l<T> $$12,
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
      if (fod.s()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = ayo.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(ayo.b(this.d + $$0, $$1.size()));
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
      wz $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private wz c(T $$0) {
      return (wz)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xn d(T $$0) {
      return wy.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xn aQ_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fmi $$0) {
      $$0.a(fmh.a, this.aQ_());
      if (this.j) {
         T $$1 = this.b(1);
         wz $$2 = this.c($$1);
         if (this.aO_()) {
            $$0.a(fmh.d, wz.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fmh.d, wz.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xn c() {
      return a_((wz)(this.q ? this.d(this.f) : this.z()));
   }

   public static <T> fit.a<T> a(Function<T, wz> $$0) {
      return new fit.a<>($$0);
   }

   public static fit.a<Boolean> a(wz $$0, wz $$1) {
      return new fit.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fit.a<Boolean> e() {
      return new fit.a<Boolean>($$0 -> $$0 ? wy.b : wy.c).a(b);
   }

   public static fit.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, wz> c;
      private fgr.l<T> d = $$0x -> null;
      private Function<fit<T>, xn> e = fit::c;
      private fit.c<T> f = fit.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, wz> $$0) {
         this.c = $$0;
      }

      public fit.a<T> a(Collection<T> $$0) {
         return this.a(fit.c.a($$0));
      }

      @SafeVarargs
      public final fit.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fit.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fit.c.a(fit.a, $$0, $$1));
      }

      public fit.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fit.c.a($$0, $$1, $$2));
      }

      public fit.a<T> a(fit.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fit.a<T> a(fgr.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fit.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fit.a<T> a(Function<fit<T>, xn> $$0) {
         this.e = $$0;
         return this;
      }

      public fit.a<T> a() {
         this.g = true;
         return this;
      }

      public fit<T> a(wz $$0, fit.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fit<T> a(int $$0, int $$1, int $$2, int $$3, wz $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fit<T> a(int $$0, int $$1, int $$2, int $$3, wz $$4, fit.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            wz $$8 = this.c.apply($$7);
            wz $$9 = (wz)(this.g ? $$8 : wy.a($$4, $$8));
            return new fit<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fit<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fit.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fit.c<T>() {
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

      static <T> fit.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fit.c<T>() {
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
