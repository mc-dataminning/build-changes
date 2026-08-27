import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fef<T> extends fdp {
   public static final BooleanSupplier a = fjx::t;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final wi c;
   private int d;
   private T f;
   private final fef.c<T> m;
   private final Function<T, wi> n;
   private final Function<fef<T>, ww> o;
   private final fef.b<T> p;
   private final boolean q;
   private final fcb.l<T> r;

   fef(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      wi $$4,
      wi $$5,
      int $$6,
      T $$7,
      fef.c<T> $$8,
      Function<T, wi> $$9,
      Function<fef<T>, ww> $$10,
      fef.b<T> $$11,
      fcb.l<T> $$12,
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
      if (fjx.s()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = axm.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(axm.b(this.d + $$0, $$1.size()));
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
      wi $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private wi c(T $$0) {
      return (wi)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private ww d(T $$0) {
      return wh.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected ww aK_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fhu $$0) {
      $$0.a(fht.a, this.aK_());
      if (this.j) {
         T $$1 = this.b(1);
         wi $$2 = this.c($$1);
         if (this.aI_()) {
            $$0.a(fht.d, wi.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fht.d, wi.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public ww d() {
      return a_((wi)(this.q ? this.d(this.f) : this.y()));
   }

   public static <T> fef.a<T> a(Function<T, wi> $$0) {
      return new fef.a<>($$0);
   }

   public static fef.a<Boolean> a(wi $$0, wi $$1) {
      return new fef.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fef.a<Boolean> e() {
      return new fef.a<Boolean>($$0 -> $$0 ? wh.b : wh.c).a(b);
   }

   public static fef.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, wi> c;
      private fcb.l<T> d = $$0x -> null;
      private Function<fef<T>, ww> e = fef::d;
      private fef.c<T> f = fef.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, wi> $$0) {
         this.c = $$0;
      }

      public fef.a<T> a(Collection<T> $$0) {
         return this.a(fef.c.a($$0));
      }

      @SafeVarargs
      public final fef.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fef.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fef.c.a(fef.a, $$0, $$1));
      }

      public fef.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fef.c.a($$0, $$1, $$2));
      }

      public fef.a<T> a(fef.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fef.a<T> a(fcb.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fef.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fef.a<T> a(Function<fef<T>, ww> $$0) {
         this.e = $$0;
         return this;
      }

      public fef.a<T> a() {
         this.g = true;
         return this;
      }

      public fef<T> a(wi $$0, fef.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fef<T> a(int $$0, int $$1, int $$2, int $$3, wi $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fef<T> a(int $$0, int $$1, int $$2, int $$3, wi $$4, fef.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            wi $$8 = this.c.apply($$7);
            wi $$9 = (wi)(this.g ? $$8 : wh.a($$4, $$8));
            return new fef<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fef<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fef.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fef.c<T>() {
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

      static <T> fef.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fef.c<T>() {
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
