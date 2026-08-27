import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fgg<T> extends ffq {
   public static final BooleanSupplier a = fly::t;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final wx c;
   private int d;
   private T f;
   private final fgg.c<T> m;
   private final Function<T, wx> n;
   private final Function<fgg<T>, xl> o;
   private final fgg.b<T> p;
   private final boolean q;
   private final fec.l<T> r;

   fgg(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      wx $$4,
      wx $$5,
      int $$6,
      T $$7,
      fgg.c<T> $$8,
      Function<T, wx> $$9,
      Function<fgg<T>, xl> $$10,
      fgg.b<T> $$11,
      fec.l<T> $$12,
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
      if (fly.s()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = ayd.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(ayd.b(this.d + $$0, $$1.size()));
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
      wx $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private wx c(T $$0) {
      return (wx)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xl d(T $$0) {
      return ww.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xl aK_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fjv $$0) {
      $$0.a(fju.a, this.aK_());
      if (this.j) {
         T $$1 = this.b(1);
         wx $$2 = this.c($$1);
         if (this.aI_()) {
            $$0.a(fju.d, wx.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fju.d, wx.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xl d() {
      return a_((wx)(this.q ? this.d(this.f) : this.y()));
   }

   public static <T> fgg.a<T> a(Function<T, wx> $$0) {
      return new fgg.a<>($$0);
   }

   public static fgg.a<Boolean> a(wx $$0, wx $$1) {
      return new fgg.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fgg.a<Boolean> e() {
      return new fgg.a<Boolean>($$0 -> $$0 ? ww.b : ww.c).a(b);
   }

   public static fgg.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, wx> c;
      private fec.l<T> d = $$0x -> null;
      private Function<fgg<T>, xl> e = fgg::d;
      private fgg.c<T> f = fgg.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, wx> $$0) {
         this.c = $$0;
      }

      public fgg.a<T> a(Collection<T> $$0) {
         return this.a(fgg.c.a($$0));
      }

      @SafeVarargs
      public final fgg.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fgg.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fgg.c.a(fgg.a, $$0, $$1));
      }

      public fgg.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fgg.c.a($$0, $$1, $$2));
      }

      public fgg.a<T> a(fgg.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fgg.a<T> a(fec.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fgg.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fgg.a<T> a(Function<fgg<T>, xl> $$0) {
         this.e = $$0;
         return this;
      }

      public fgg.a<T> a() {
         this.g = true;
         return this;
      }

      public fgg<T> a(wx $$0, fgg.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fgg<T> a(int $$0, int $$1, int $$2, int $$3, wx $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fgg<T> a(int $$0, int $$1, int $$2, int $$3, wx $$4, fgg.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            wx $$8 = this.c.apply($$7);
            wx $$9 = (wx)(this.g ? $$8 : ww.a($$4, $$8));
            return new fgg<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fgg<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fgg.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fgg.c<T>() {
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

      static <T> fgg.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fgg.c<T>() {
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
