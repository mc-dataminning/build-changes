import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fqu<T> extends fqd {
   public static final BooleanSupplier a = fwf::u;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final wv c;
   private int d;
   private T f;
   private final fqu.c<T> m;
   private final Function<T, wv> n;
   private final Function<fqu<T>, xj> o;
   private final fqu.b<T> p;
   private final boolean q;
   private final fng.l<T> r;

   fqu(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      wv $$4,
      wv $$5,
      int $$6,
      T $$7,
      fqu.c<T> $$8,
      Function<T, wv> $$9,
      Function<fqu<T>, xj> $$10,
      fqu.b<T> $$11,
      fng.l<T> $$12,
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
      if (fwf.t()) {
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
      wv $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.g();
   }

   private wv c(T $$0) {
      return (wv)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xj d(T $$0) {
      return wu.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xj d() {
      return this.o.apply(this);
   }

   @Override
   public void a(fuk $$0) {
      $$0.a(fuj.a, this.d());
      if (this.j) {
         T $$1 = this.b(1);
         wv $$2 = this.c($$1);
         if (this.aI_()) {
            $$0.a(fuj.d, wv.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fuj.d, wv.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xj c() {
      return a_((wv)(this.q ? this.d(this.f) : this.B()));
   }

   public static <T> fqu.a<T> a(Function<T, wv> $$0) {
      return new fqu.a<>($$0);
   }

   public static fqu.a<Boolean> a(wv $$0, wv $$1) {
      return new fqu.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fqu.a<Boolean> e() {
      return new fqu.a<Boolean>($$0 -> $$0 ? wu.b : wu.c).a(b);
   }

   public static fqu.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, wv> c;
      private fng.l<T> d = $$0x -> null;
      private Function<fqu<T>, xj> e = fqu::c;
      private fqu.c<T> f = fqu.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, wv> $$0) {
         this.c = $$0;
      }

      public fqu.a<T> a(Collection<T> $$0) {
         return this.a(fqu.c.a($$0));
      }

      @SafeVarargs
      public final fqu.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fqu.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fqu.c.a(fqu.a, $$0, $$1));
      }

      public fqu.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fqu.c.a($$0, $$1, $$2));
      }

      public fqu.a<T> a(fqu.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fqu.a<T> a(fng.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fqu.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fqu.a<T> a(Function<fqu<T>, xj> $$0) {
         this.e = $$0;
         return this;
      }

      public fqu.a<T> a() {
         this.g = true;
         return this;
      }

      public fqu<T> a(wv $$0, fqu.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fqu<T> a(int $$0, int $$1, int $$2, int $$3, wv $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fqu<T> a(int $$0, int $$1, int $$2, int $$3, wv $$4, fqu.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            wv $$8 = this.c.apply($$7);
            wv $$9 = (wv)(this.g ? $$8 : wu.a($$4, $$8));
            return new fqu<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fqu<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fqu.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fqu.c<T>() {
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

      static <T> fqu.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fqu.c<T>() {
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
