import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fin<T> extends fhx {
   public static final BooleanSupplier a = fnx::t;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final wy c;
   private int d;
   private T f;
   private final fin.c<T> m;
   private final Function<T, wy> n;
   private final Function<fin<T>, xm> o;
   private final fin.b<T> p;
   private final boolean q;
   private final fgl.l<T> r;

   fin(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      wy $$4,
      wy $$5,
      int $$6,
      T $$7,
      fin.c<T> $$8,
      Function<T, wy> $$9,
      Function<fin<T>, xm> $$10,
      fin.b<T> $$11,
      fgl.l<T> $$12,
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
      if (fnx.s()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = ayn.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(ayn.b(this.d + $$0, $$1.size()));
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
      wy $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private wy c(T $$0) {
      return (wy)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xm d(T $$0) {
      return wx.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xm aM_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fmc $$0) {
      $$0.a(fmb.a, this.aM_());
      if (this.j) {
         T $$1 = this.b(1);
         wy $$2 = this.c($$1);
         if (this.aK_()) {
            $$0.a(fmb.d, wy.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fmb.d, wy.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xm c() {
      return a_((wy)(this.q ? this.d(this.f) : this.z()));
   }

   public static <T> fin.a<T> a(Function<T, wy> $$0) {
      return new fin.a<>($$0);
   }

   public static fin.a<Boolean> a(wy $$0, wy $$1) {
      return new fin.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fin.a<Boolean> e() {
      return new fin.a<Boolean>($$0 -> $$0 ? wx.b : wx.c).a(b);
   }

   public static fin.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, wy> c;
      private fgl.l<T> d = $$0x -> null;
      private Function<fin<T>, xm> e = fin::c;
      private fin.c<T> f = fin.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, wy> $$0) {
         this.c = $$0;
      }

      public fin.a<T> a(Collection<T> $$0) {
         return this.a(fin.c.a($$0));
      }

      @SafeVarargs
      public final fin.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fin.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fin.c.a(fin.a, $$0, $$1));
      }

      public fin.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fin.c.a($$0, $$1, $$2));
      }

      public fin.a<T> a(fin.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fin.a<T> a(fgl.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fin.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fin.a<T> a(Function<fin<T>, xm> $$0) {
         this.e = $$0;
         return this;
      }

      public fin.a<T> a() {
         this.g = true;
         return this;
      }

      public fin<T> a(wy $$0, fin.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fin<T> a(int $$0, int $$1, int $$2, int $$3, wy $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fin<T> a(int $$0, int $$1, int $$2, int $$3, wy $$4, fin.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            wy $$8 = this.c.apply($$7);
            wy $$9 = (wy)(this.g ? $$8 : wx.a($$4, $$8));
            return new fin<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fin<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fin.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fin.c<T>() {
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

      static <T> fin.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fin.c<T>() {
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
