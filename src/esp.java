import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class esp<T> extends esa {
   public static final BooleanSupplier a = exv::r;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final te c;
   private int d;
   private T l;
   private final esp.c<T> m;
   private final Function<T, te> n;
   private final Function<esp<T>, tr> o;
   private final esp.b<T> p;
   private final boolean q;
   private final eqq.l<T> s;

   esp(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      te $$4,
      te $$5,
      int $$6,
      T $$7,
      esp.c<T> $$8,
      Function<T, te> $$9,
      Function<esp<T>, tr> $$10,
      esp.b<T> $$11,
      eqq.l<T> $$12,
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
      if (exv.q()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = aro.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T h(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(aro.b(this.d + $$0, $$1.size()));
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
      te $$1 = this.c($$0);
      this.b($$1);
      this.l = $$0;
      this.f();
   }

   private te c(T $$0) {
      return (te)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private tr d(T $$0) {
      return td.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.l;
   }

   @Override
   protected tr aB_() {
      return this.o.apply(this);
   }

   @Override
   public void a(evt $$0) {
      $$0.a(evs.a, this.aB_());
      if (this.i) {
         T $$1 = this.h(1);
         te $$2 = this.c($$1);
         if (this.ax_()) {
            $$0.a(evs.d, te.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(evs.d, te.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public tr b() {
      return a((te)(this.q ? this.d(this.l) : this.l()));
   }

   public static <T> esp.a<T> a(Function<T, te> $$0) {
      return new esp.a<>($$0);
   }

   public static esp.a<Boolean> a(te $$0, te $$1) {
      return new esp.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static esp.a<Boolean> e() {
      return new esp.a<Boolean>($$0 -> $$0 ? td.b : td.c).a(b);
   }

   public static esp.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, te> c;
      private eqq.l<T> d = $$0x -> null;
      private Function<esp<T>, tr> e = esp::b;
      private esp.c<T> f = esp.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, te> $$0) {
         this.c = $$0;
      }

      public esp.a<T> a(Collection<T> $$0) {
         return this.a(esp.c.a($$0));
      }

      @SafeVarargs
      public final esp.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public esp.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(esp.c.a(esp.a, $$0, $$1));
      }

      public esp.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(esp.c.a($$0, $$1, $$2));
      }

      public esp.a<T> a(esp.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public esp.a<T> a(eqq.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public esp.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public esp.a<T> a(Function<esp<T>, tr> $$0) {
         this.e = $$0;
         return this;
      }

      public esp.a<T> a() {
         this.g = true;
         return this;
      }

      public esp<T> a(int $$0, int $$1, int $$2, int $$3, te $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public esp<T> a(int $$0, int $$1, int $$2, int $$3, te $$4, esp.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            te $$8 = this.c.apply($$7);
            te $$9 = (te)(this.g ? $$8 : td.a($$4, $$8));
            return new esp<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(esp<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> esp.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new esp.c<T>() {
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

      static <T> esp.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new esp.c<T>() {
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
