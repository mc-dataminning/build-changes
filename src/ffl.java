import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ffl<T> extends fev {
   public static final BooleanSupplier a = fld::t;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final wu c;
   private int d;
   private T f;
   private final ffl.c<T> m;
   private final Function<T, wu> n;
   private final Function<ffl<T>, xi> o;
   private final ffl.b<T> p;
   private final boolean q;
   private final fdh.l<T> r;

   ffl(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      wu $$4,
      wu $$5,
      int $$6,
      T $$7,
      ffl.c<T> $$8,
      Function<T, wu> $$9,
      Function<ffl<T>, xi> $$10,
      ffl.b<T> $$11,
      fdh.l<T> $$12,
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
      if (fld.s()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = axz.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(axz.b(this.d + $$0, $$1.size()));
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
      wu $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private wu c(T $$0) {
      return (wu)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xi d(T $$0) {
      return wt.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xi aK_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fja $$0) {
      $$0.a(fiz.a, this.aK_());
      if (this.j) {
         T $$1 = this.b(1);
         wu $$2 = this.c($$1);
         if (this.aI_()) {
            $$0.a(fiz.d, wu.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fiz.d, wu.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xi d() {
      return a_((wu)(this.q ? this.d(this.f) : this.y()));
   }

   public static <T> ffl.a<T> a(Function<T, wu> $$0) {
      return new ffl.a<>($$0);
   }

   public static ffl.a<Boolean> a(wu $$0, wu $$1) {
      return new ffl.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static ffl.a<Boolean> e() {
      return new ffl.a<Boolean>($$0 -> $$0 ? wt.b : wt.c).a(b);
   }

   public static ffl.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, wu> c;
      private fdh.l<T> d = $$0x -> null;
      private Function<ffl<T>, xi> e = ffl::d;
      private ffl.c<T> f = ffl.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, wu> $$0) {
         this.c = $$0;
      }

      public ffl.a<T> a(Collection<T> $$0) {
         return this.a(ffl.c.a($$0));
      }

      @SafeVarargs
      public final ffl.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public ffl.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(ffl.c.a(ffl.a, $$0, $$1));
      }

      public ffl.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(ffl.c.a($$0, $$1, $$2));
      }

      public ffl.a<T> a(ffl.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public ffl.a<T> a(fdh.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public ffl.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public ffl.a<T> a(Function<ffl<T>, xi> $$0) {
         this.e = $$0;
         return this;
      }

      public ffl.a<T> a() {
         this.g = true;
         return this;
      }

      public ffl<T> a(wu $$0, ffl.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public ffl<T> a(int $$0, int $$1, int $$2, int $$3, wu $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public ffl<T> a(int $$0, int $$1, int $$2, int $$3, wu $$4, ffl.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            wu $$8 = this.c.apply($$7);
            wu $$9 = (wu)(this.g ? $$8 : wt.a($$4, $$8));
            return new ffl<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(ffl<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> ffl.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new ffl.c<T>() {
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

      static <T> ffl.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new ffl.c<T>() {
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
