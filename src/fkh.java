import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fkh<T> extends fjr {
   public static final BooleanSupplier a = fpt::u;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final xd c;
   private int d;
   private T f;
   private final fkh.c<T> m;
   private final Function<T, xd> n;
   private final Function<fkh<T>, xr> o;
   private final fkh.b<T> p;
   private final boolean q;
   private final fie.l<T> r;

   fkh(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      xd $$4,
      xd $$5,
      int $$6,
      T $$7,
      fkh.c<T> $$8,
      Function<T, xd> $$9,
      Function<fkh<T>, xr> $$10,
      fkh.b<T> $$11,
      fie.l<T> $$12,
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
      if (fpt.t()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = azc.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(azc.b(this.d + $$0, $$1.size()));
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
      xd $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private xd c(T $$0) {
      return (xd)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xr d(T $$0) {
      return xc.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xr aQ_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fnx $$0) {
      $$0.a(fnw.a, this.aQ_());
      if (this.j) {
         T $$1 = this.b(1);
         xd $$2 = this.c($$1);
         if (this.aO_()) {
            $$0.a(fnw.d, xd.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fnw.d, xd.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xr c() {
      return a_((xd)(this.q ? this.d(this.f) : this.z()));
   }

   public static <T> fkh.a<T> a(Function<T, xd> $$0) {
      return new fkh.a<>($$0);
   }

   public static fkh.a<Boolean> a(xd $$0, xd $$1) {
      return new fkh.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fkh.a<Boolean> e() {
      return new fkh.a<Boolean>($$0 -> $$0 ? xc.b : xc.c).a(b);
   }

   public static fkh.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, xd> c;
      private fie.l<T> d = $$0x -> null;
      private Function<fkh<T>, xr> e = fkh::c;
      private fkh.c<T> f = fkh.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, xd> $$0) {
         this.c = $$0;
      }

      public fkh.a<T> a(Collection<T> $$0) {
         return this.a(fkh.c.a($$0));
      }

      @SafeVarargs
      public final fkh.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fkh.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fkh.c.a(fkh.a, $$0, $$1));
      }

      public fkh.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fkh.c.a($$0, $$1, $$2));
      }

      public fkh.a<T> a(fkh.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fkh.a<T> a(fie.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fkh.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fkh.a<T> a(Function<fkh<T>, xr> $$0) {
         this.e = $$0;
         return this;
      }

      public fkh.a<T> a() {
         this.g = true;
         return this;
      }

      public fkh<T> a(xd $$0, fkh.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fkh<T> a(int $$0, int $$1, int $$2, int $$3, xd $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fkh<T> a(int $$0, int $$1, int $$2, int $$3, xd $$4, fkh.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            xd $$8 = this.c.apply($$7);
            xd $$9 = (xd)(this.g ? $$8 : xc.a($$4, $$8));
            return new fkh<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fkh<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fkh.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fkh.c<T>() {
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

      static <T> fkh.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fkh.c<T>() {
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
