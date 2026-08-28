import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fhk<T> extends fgu {
   public static final BooleanSupplier a = fnc::u;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final xo c;
   private int d;
   private T f;
   private final fhk.c<T> m;
   private final Function<T, xo> n;
   private final Function<fhk<T>, yc> o;
   private final fhk.b<T> p;
   private final boolean q;
   private final ffh.l<T> r;

   fhk(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      xo $$4,
      xo $$5,
      int $$6,
      T $$7,
      fhk.c<T> $$8,
      Function<T, xo> $$9,
      Function<fhk<T>, yc> $$10,
      fhk.b<T> $$11,
      ffh.l<T> $$12,
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
      if (fnc.t()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = ayy.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(ayy.b(this.d + $$0, $$1.size()));
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
      xo $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private xo c(T $$0) {
      return (xo)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private yc d(T $$0) {
      return xn.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected yc aJ_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fkz $$0) {
      $$0.a(fky.a, this.aJ_());
      if (this.j) {
         T $$1 = this.b(1);
         xo $$2 = this.c($$1);
         if (this.aH_()) {
            $$0.a(fky.d, xo.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fky.d, xo.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public yc c() {
      return a_((xo)(this.q ? this.d(this.f) : this.y()));
   }

   public static <T> fhk.a<T> a(Function<T, xo> $$0) {
      return new fhk.a<>($$0);
   }

   public static fhk.a<Boolean> a(xo $$0, xo $$1) {
      return new fhk.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fhk.a<Boolean> e() {
      return new fhk.a<Boolean>($$0 -> $$0 ? xn.b : xn.c).a(b);
   }

   public static fhk.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, xo> c;
      private ffh.l<T> d = $$0x -> null;
      private Function<fhk<T>, yc> e = fhk::c;
      private fhk.c<T> f = fhk.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, xo> $$0) {
         this.c = $$0;
      }

      public fhk.a<T> a(Collection<T> $$0) {
         return this.a(fhk.c.a($$0));
      }

      @SafeVarargs
      public final fhk.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fhk.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fhk.c.a(fhk.a, $$0, $$1));
      }

      public fhk.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fhk.c.a($$0, $$1, $$2));
      }

      public fhk.a<T> a(fhk.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fhk.a<T> a(ffh.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fhk.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fhk.a<T> a(Function<fhk<T>, yc> $$0) {
         this.e = $$0;
         return this;
      }

      public fhk.a<T> a() {
         this.g = true;
         return this;
      }

      public fhk<T> a(xo $$0, fhk.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fhk<T> a(int $$0, int $$1, int $$2, int $$3, xo $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fhk<T> a(int $$0, int $$1, int $$2, int $$3, xo $$4, fhk.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            xo $$8 = this.c.apply($$7);
            xo $$9 = (xo)(this.g ? $$8 : xn.a($$4, $$8));
            return new fhk<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fhk<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fhk.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fhk.c<T>() {
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

      static <T> fhk.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fhk.c<T>() {
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
