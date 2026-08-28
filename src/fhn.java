import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fhn<T> extends fgx {
   public static final BooleanSupplier a = fnf::u;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final xp c;
   private int d;
   private T f;
   private final fhn.c<T> m;
   private final Function<T, xp> n;
   private final Function<fhn<T>, yd> o;
   private final fhn.b<T> p;
   private final boolean q;
   private final ffk.l<T> r;

   fhn(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      xp $$4,
      xp $$5,
      int $$6,
      T $$7,
      fhn.c<T> $$8,
      Function<T, xp> $$9,
      Function<fhn<T>, yd> $$10,
      fhn.b<T> $$11,
      ffk.l<T> $$12,
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
      if (fnf.t()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = ayz.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(ayz.b(this.d + $$0, $$1.size()));
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
      xp $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private xp c(T $$0) {
      return (xp)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private yd d(T $$0) {
      return xo.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected yd aJ_() {
      return this.o.apply(this);
   }

   @Override
   public void a(flc $$0) {
      $$0.a(flb.a, this.aJ_());
      if (this.j) {
         T $$1 = this.b(1);
         xp $$2 = this.c($$1);
         if (this.aH_()) {
            $$0.a(flb.d, xp.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(flb.d, xp.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public yd c() {
      return a_((xp)(this.q ? this.d(this.f) : this.y()));
   }

   public static <T> fhn.a<T> a(Function<T, xp> $$0) {
      return new fhn.a<>($$0);
   }

   public static fhn.a<Boolean> a(xp $$0, xp $$1) {
      return new fhn.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fhn.a<Boolean> e() {
      return new fhn.a<Boolean>($$0 -> $$0 ? xo.b : xo.c).a(b);
   }

   public static fhn.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, xp> c;
      private ffk.l<T> d = $$0x -> null;
      private Function<fhn<T>, yd> e = fhn::c;
      private fhn.c<T> f = fhn.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, xp> $$0) {
         this.c = $$0;
      }

      public fhn.a<T> a(Collection<T> $$0) {
         return this.a(fhn.c.a($$0));
      }

      @SafeVarargs
      public final fhn.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fhn.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fhn.c.a(fhn.a, $$0, $$1));
      }

      public fhn.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fhn.c.a($$0, $$1, $$2));
      }

      public fhn.a<T> a(fhn.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fhn.a<T> a(ffk.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fhn.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fhn.a<T> a(Function<fhn<T>, yd> $$0) {
         this.e = $$0;
         return this;
      }

      public fhn.a<T> a() {
         this.g = true;
         return this;
      }

      public fhn<T> a(xp $$0, fhn.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fhn<T> a(int $$0, int $$1, int $$2, int $$3, xp $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fhn<T> a(int $$0, int $$1, int $$2, int $$3, xp $$4, fhn.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            xp $$8 = this.c.apply($$7);
            xp $$9 = (xp)(this.g ? $$8 : xo.a($$4, $$8));
            return new fhn<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fhn<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fhn.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fhn.c<T>() {
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

      static <T> fhn.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fhn.c<T>() {
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
