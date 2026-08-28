import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fof<T> extends fnp {
   public static final BooleanSupplier a = ftr::t;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final xk c;
   private int d;
   private T f;
   private final fof.c<T> m;
   private final Function<T, xk> n;
   private final Function<fof<T>, xy> o;
   private final fof.b<T> p;
   private final boolean q;
   private final fmc.l<T> r;

   fof(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      xk $$4,
      xk $$5,
      int $$6,
      T $$7,
      fof.c<T> $$8,
      Function<T, xk> $$9,
      Function<fof<T>, xy> $$10,
      fof.b<T> $$11,
      fmc.l<T> $$12,
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
      if (ftr.s()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = azu.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(azu.b(this.d + $$0, $$1.size()));
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
      xk $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.g();
   }

   private xk c(T $$0) {
      return (xk)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xy d(T $$0) {
      return xj.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xy aR_() {
      return this.o.apply(this);
   }

   @Override
   public void a(frw $$0) {
      $$0.a(frv.a, this.aR_());
      if (this.j) {
         T $$1 = this.b(1);
         xk $$2 = this.c($$1);
         if (this.aN_()) {
            $$0.a(frv.d, xk.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(frv.d, xk.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xy c() {
      return a_((xk)(this.q ? this.d(this.f) : this.z()));
   }

   public static <T> fof.a<T> a(Function<T, xk> $$0) {
      return new fof.a<>($$0);
   }

   public static fof.a<Boolean> a(xk $$0, xk $$1) {
      return new fof.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fof.a<Boolean> e() {
      return new fof.a<Boolean>($$0 -> $$0 ? xj.b : xj.c).a(b);
   }

   public static fof.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, xk> c;
      private fmc.l<T> d = $$0x -> null;
      private Function<fof<T>, xy> e = fof::c;
      private fof.c<T> f = fof.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, xk> $$0) {
         this.c = $$0;
      }

      public fof.a<T> a(Collection<T> $$0) {
         return this.a(fof.c.a($$0));
      }

      @SafeVarargs
      public final fof.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fof.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fof.c.a(fof.a, $$0, $$1));
      }

      public fof.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fof.c.a($$0, $$1, $$2));
      }

      public fof.a<T> a(fof.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fof.a<T> a(fmc.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fof.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fof.a<T> a(Function<fof<T>, xy> $$0) {
         this.e = $$0;
         return this;
      }

      public fof.a<T> a() {
         this.g = true;
         return this;
      }

      public fof<T> a(xk $$0, fof.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fof<T> a(int $$0, int $$1, int $$2, int $$3, xk $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fof<T> a(int $$0, int $$1, int $$2, int $$3, xk $$4, fof.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            xk $$8 = this.c.apply($$7);
            xk $$9 = (xk)(this.g ? $$8 : xj.a($$4, $$8));
            return new fof<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fof<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fof.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fof.c<T>() {
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

      static <T> fof.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fof.c<T>() {
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
