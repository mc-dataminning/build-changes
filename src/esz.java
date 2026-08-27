import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class esz<T> extends esk {
   public static final BooleanSupplier a = eym::r;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final tn c;
   private int d;
   private T l;
   private final esz.c<T> m;
   private final Function<T, tn> n;
   private final Function<esz<T>, ua> o;
   private final esz.b<T> p;
   private final boolean q;
   private final era.l<T> s;

   esz(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      tn $$4,
      tn $$5,
      int $$6,
      T $$7,
      esz.c<T> $$8,
      Function<T, tn> $$9,
      Function<esz<T>, ua> $$10,
      esz.b<T> $$11,
      era.l<T> $$12,
      boolean $$13
   ) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.l = $$7;
      this.m = $$8;
      this.n = $$9;
      this.o = $$10;
      this.p = $$11;
      this.q = $$13;
      this.s = $$12;
      this.f();
   }

   private void f() {
      this.a(this.s.apply(this.l));
   }

   @Override
   public void c() {
      if (eym.q()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = ary.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T i(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(ary.b(this.d + $$0, $$1.size()));
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
      tn $$1 = this.c($$0);
      this.b($$1);
      this.l = $$0;
      this.f();
   }

   private tn c(T $$0) {
      return (tn)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private ua d(T $$0) {
      return tm.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.l;
   }

   @Override
   protected ua aE_() {
      return this.o.apply(this);
   }

   @Override
   public void a(ewk $$0) {
      $$0.a(ewj.a, this.aE_());
      if (this.i) {
         T $$1 = this.i(1);
         tn $$2 = this.c($$1);
         if (this.aC_()) {
            $$0.a(ewj.d, tn.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(ewj.d, tn.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public ua b() {
      return a((tn)(this.q ? this.d(this.l) : this.m()));
   }

   public static <T> esz.a<T> a(Function<T, tn> $$0) {
      return new esz.a<>($$0);
   }

   public static esz.a<Boolean> a(tn $$0, tn $$1) {
      return new esz.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static esz.a<Boolean> e() {
      return new esz.a<Boolean>($$0 -> $$0 ? tm.b : tm.c).a(b);
   }

   public static esz.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, tn> c;
      private era.l<T> d = $$0x -> null;
      private Function<esz<T>, ua> e = esz::b;
      private esz.c<T> f = esz.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, tn> $$0) {
         this.c = $$0;
      }

      public esz.a<T> a(Collection<T> $$0) {
         return this.a(esz.c.a($$0));
      }

      @SafeVarargs
      public final esz.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public esz.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(esz.c.a(esz.a, $$0, $$1));
      }

      public esz.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(esz.c.a($$0, $$1, $$2));
      }

      public esz.a<T> a(esz.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public esz.a<T> a(era.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public esz.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public esz.a<T> a(Function<esz<T>, ua> $$0) {
         this.e = $$0;
         return this;
      }

      public esz.a<T> a() {
         this.g = true;
         return this;
      }

      public esz<T> a(int $$0, int $$1, int $$2, int $$3, tn $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public esz<T> a(int $$0, int $$1, int $$2, int $$3, tn $$4, esz.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            tn $$8 = this.c.apply($$7);
            tn $$9 = (tn)(this.g ? $$8 : tm.a($$4, $$8));
            return new esz<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(esz<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> esz.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new esz.c<T>() {
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

      static <T> esz.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new esz.c<T>() {
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
