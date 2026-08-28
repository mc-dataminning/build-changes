import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fhj<T> extends fgt {
   public static final BooleanSupplier a = fnb::t;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final xo c;
   private int d;
   private T f;
   private final fhj.c<T> m;
   private final Function<T, xo> n;
   private final Function<fhj<T>, yc> o;
   private final fhj.b<T> p;
   private final boolean q;
   private final ffg.l<T> r;

   fhj(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      xo $$4,
      xo $$5,
      int $$6,
      T $$7,
      fhj.c<T> $$8,
      Function<T, xo> $$9,
      Function<fhj<T>, yc> $$10,
      fhj.b<T> $$11,
      ffg.l<T> $$12,
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
      if (fnb.s()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = ayx.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(ayx.b(this.d + $$0, $$1.size()));
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
   protected yc aK_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fky $$0) {
      $$0.a(fkx.a, this.aK_());
      if (this.j) {
         T $$1 = this.b(1);
         xo $$2 = this.c($$1);
         if (this.aI_()) {
            $$0.a(fkx.d, xo.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fkx.d, xo.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public yc d() {
      return a_((xo)(this.q ? this.d(this.f) : this.y()));
   }

   public static <T> fhj.a<T> a(Function<T, xo> $$0) {
      return new fhj.a<>($$0);
   }

   public static fhj.a<Boolean> a(xo $$0, xo $$1) {
      return new fhj.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fhj.a<Boolean> e() {
      return new fhj.a<Boolean>($$0 -> $$0 ? xn.b : xn.c).a(b);
   }

   public static fhj.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, xo> c;
      private ffg.l<T> d = $$0x -> null;
      private Function<fhj<T>, yc> e = fhj::d;
      private fhj.c<T> f = fhj.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, xo> $$0) {
         this.c = $$0;
      }

      public fhj.a<T> a(Collection<T> $$0) {
         return this.a(fhj.c.a($$0));
      }

      @SafeVarargs
      public final fhj.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fhj.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fhj.c.a(fhj.a, $$0, $$1));
      }

      public fhj.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fhj.c.a($$0, $$1, $$2));
      }

      public fhj.a<T> a(fhj.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fhj.a<T> a(ffg.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fhj.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fhj.a<T> a(Function<fhj<T>, yc> $$0) {
         this.e = $$0;
         return this;
      }

      public fhj.a<T> a() {
         this.g = true;
         return this;
      }

      public fhj<T> a(xo $$0, fhj.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fhj<T> a(int $$0, int $$1, int $$2, int $$3, xo $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fhj<T> a(int $$0, int $$1, int $$2, int $$3, xo $$4, fhj.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            xo $$8 = this.c.apply($$7);
            xo $$9 = (xo)(this.g ? $$8 : xn.a($$4, $$8));
            return new fhj<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fhj<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fhj.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fhj.c<T>() {
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

      static <T> fhj.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fhj.c<T>() {
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
