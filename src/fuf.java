import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fuf<T> extends fto {
   public static final BooleanSupplier a = fzq::u;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final xg c;
   private int d;
   private T f;
   private final fuf.c<T> m;
   private final Function<T, xg> n;
   private final Function<fuf<T>, xu> o;
   private final fuf.b<T> p;
   private final boolean q;
   private final fqt.l<T> r;

   fuf(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      xg $$4,
      xg $$5,
      int $$6,
      T $$7,
      fuf.c<T> $$8,
      Function<T, xg> $$9,
      Function<fuf<T>, xu> $$10,
      fuf.b<T> $$11,
      fqt.l<T> $$12,
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
      if (fzq.t()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = azz.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(azz.b(this.d + $$0, $$1.size()));
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
      xg $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.g();
   }

   private xg c(T $$0) {
      return (xg)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xu d(T $$0) {
      return xf.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xu d() {
      return this.o.apply(this);
   }

   @Override
   public void a(fxv $$0) {
      $$0.a(fxu.a, this.d());
      if (this.j) {
         T $$1 = this.b(1);
         xg $$2 = this.c($$1);
         if (this.aO_()) {
            $$0.a(fxu.d, xg.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fxu.d, xg.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xu c() {
      return a_((xg)(this.q ? this.d(this.f) : this.B()));
   }

   public static <T> fuf.a<T> a(Function<T, xg> $$0) {
      return new fuf.a<>($$0);
   }

   public static fuf.a<Boolean> a(xg $$0, xg $$1) {
      return new fuf.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fuf.a<Boolean> e() {
      return new fuf.a<Boolean>($$0 -> $$0 ? xf.b : xf.c).a(b);
   }

   public static fuf.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, xg> c;
      private fqt.l<T> d = $$0x -> null;
      private Function<fuf<T>, xu> e = fuf::c;
      private fuf.c<T> f = fuf.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, xg> $$0) {
         this.c = $$0;
      }

      public fuf.a<T> a(Collection<T> $$0) {
         return this.a(fuf.c.a($$0));
      }

      @SafeVarargs
      public final fuf.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fuf.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fuf.c.a(fuf.a, $$0, $$1));
      }

      public fuf.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fuf.c.a($$0, $$1, $$2));
      }

      public fuf.a<T> a(fuf.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fuf.a<T> a(fqt.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fuf.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fuf.a<T> a(Function<fuf<T>, xu> $$0) {
         this.e = $$0;
         return this;
      }

      public fuf.a<T> a() {
         this.g = true;
         return this;
      }

      public fuf<T> a(xg $$0, fuf.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fuf<T> a(int $$0, int $$1, int $$2, int $$3, xg $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fuf<T> a(int $$0, int $$1, int $$2, int $$3, xg $$4, fuf.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            xg $$8 = this.c.apply($$7);
            xg $$9 = (xg)(this.g ? $$8 : xf.a($$4, $$8));
            return new fuf<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fuf<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fuf.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fuf.c<T>() {
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

      static <T> fuf.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fuf.c<T>() {
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
