import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class flg<T> extends fkq {
   public static final BooleanSupplier a = fqs::u;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final xh c;
   private int d;
   private T f;
   private final flg.c<T> m;
   private final Function<T, xh> n;
   private final Function<flg<T>, xv> o;
   private final flg.b<T> p;
   private final boolean q;
   private final fjd.l<T> r;

   flg(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      xh $$4,
      xh $$5,
      int $$6,
      T $$7,
      flg.c<T> $$8,
      Function<T, xh> $$9,
      Function<flg<T>, xv> $$10,
      flg.b<T> $$11,
      fjd.l<T> $$12,
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
      if (fqs.t()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = azj.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(azj.b(this.d + $$0, $$1.size()));
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
      xh $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private xh c(T $$0) {
      return (xh)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xv d(T $$0) {
      return xg.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xv aP_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fox $$0) {
      $$0.a(fow.a, this.aP_());
      if (this.j) {
         T $$1 = this.b(1);
         xh $$2 = this.c($$1);
         if (this.aN_()) {
            $$0.a(fow.d, xh.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fow.d, xh.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xv c() {
      return a_((xh)(this.q ? this.d(this.f) : this.z()));
   }

   public static <T> flg.a<T> a(Function<T, xh> $$0) {
      return new flg.a<>($$0);
   }

   public static flg.a<Boolean> a(xh $$0, xh $$1) {
      return new flg.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static flg.a<Boolean> e() {
      return new flg.a<Boolean>($$0 -> $$0 ? xg.b : xg.c).a(b);
   }

   public static flg.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, xh> c;
      private fjd.l<T> d = $$0x -> null;
      private Function<flg<T>, xv> e = flg::c;
      private flg.c<T> f = flg.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, xh> $$0) {
         this.c = $$0;
      }

      public flg.a<T> a(Collection<T> $$0) {
         return this.a(flg.c.a($$0));
      }

      @SafeVarargs
      public final flg.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public flg.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(flg.c.a(flg.a, $$0, $$1));
      }

      public flg.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(flg.c.a($$0, $$1, $$2));
      }

      public flg.a<T> a(flg.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public flg.a<T> a(fjd.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public flg.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public flg.a<T> a(Function<flg<T>, xv> $$0) {
         this.e = $$0;
         return this;
      }

      public flg.a<T> a() {
         this.g = true;
         return this;
      }

      public flg<T> a(xh $$0, flg.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public flg<T> a(int $$0, int $$1, int $$2, int $$3, xh $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public flg<T> a(int $$0, int $$1, int $$2, int $$3, xh $$4, flg.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            xh $$8 = this.c.apply($$7);
            xh $$9 = (xh)(this.g ? $$8 : xg.a($$4, $$8));
            return new flg<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(flg<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> flg.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new flg.c<T>() {
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

      static <T> flg.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new flg.c<T>() {
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
