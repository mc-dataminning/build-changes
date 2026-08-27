import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fdw<T> extends fdg {
   public static final BooleanSupplier a = fjo::t;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final wg c;
   private int d;
   private T f;
   private final fdw.c<T> m;
   private final Function<T, wg> n;
   private final Function<fdw<T>, wu> o;
   private final fdw.b<T> p;
   private final boolean q;
   private final fbs.l<T> r;

   fdw(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      wg $$4,
      wg $$5,
      int $$6,
      T $$7,
      fdw.c<T> $$8,
      Function<T, wg> $$9,
      Function<fdw<T>, wu> $$10,
      fdw.b<T> $$11,
      fbs.l<T> $$12,
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
      if (fjo.s()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = axk.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(axk.b(this.d + $$0, $$1.size()));
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
      wg $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private wg c(T $$0) {
      return (wg)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private wu d(T $$0) {
      return wf.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected wu aL_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fhl $$0) {
      $$0.a(fhk.a, this.aL_());
      if (this.j) {
         T $$1 = this.b(1);
         wg $$2 = this.c($$1);
         if (this.aJ_()) {
            $$0.a(fhk.d, wg.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fhk.d, wg.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public wu d() {
      return a_((wg)(this.q ? this.d(this.f) : this.y()));
   }

   public static <T> fdw.a<T> a(Function<T, wg> $$0) {
      return new fdw.a<>($$0);
   }

   public static fdw.a<Boolean> a(wg $$0, wg $$1) {
      return new fdw.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fdw.a<Boolean> e() {
      return new fdw.a<Boolean>($$0 -> $$0 ? wf.b : wf.c).a(b);
   }

   public static fdw.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, wg> c;
      private fbs.l<T> d = $$0x -> null;
      private Function<fdw<T>, wu> e = fdw::d;
      private fdw.c<T> f = fdw.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, wg> $$0) {
         this.c = $$0;
      }

      public fdw.a<T> a(Collection<T> $$0) {
         return this.a(fdw.c.a($$0));
      }

      @SafeVarargs
      public final fdw.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fdw.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fdw.c.a(fdw.a, $$0, $$1));
      }

      public fdw.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fdw.c.a($$0, $$1, $$2));
      }

      public fdw.a<T> a(fdw.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fdw.a<T> a(fbs.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fdw.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fdw.a<T> a(Function<fdw<T>, wu> $$0) {
         this.e = $$0;
         return this;
      }

      public fdw.a<T> a() {
         this.g = true;
         return this;
      }

      public fdw<T> a(wg $$0, fdw.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fdw<T> a(int $$0, int $$1, int $$2, int $$3, wg $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fdw<T> a(int $$0, int $$1, int $$2, int $$3, wg $$4, fdw.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            wg $$8 = this.c.apply($$7);
            wg $$9 = (wg)(this.g ? $$8 : wf.a($$4, $$8));
            return new fdw<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fdw<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fdw.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fdw.c<T>() {
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

      static <T> fdw.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fdw.c<T>() {
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
