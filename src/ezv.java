import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ezv<T> extends ezf {
   public static final BooleanSupplier a = ffl::w;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final vq c;
   private int d;
   private T f;
   private final ezv.c<T> m;
   private final Function<T, vq> n;
   private final Function<ezv<T>, we> o;
   private final ezv.b<T> p;
   private final boolean q;
   private final exr.l<T> r;

   ezv(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      vq $$4,
      vq $$5,
      int $$6,
      T $$7,
      ezv.c<T> $$8,
      Function<T, vq> $$9,
      Function<ezv<T>, we> $$10,
      ezv.b<T> $$11,
      exr.l<T> $$12,
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
      if (ffl.v()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = awi.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(awi.b(this.d + $$0, $$1.size()));
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
      vq $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private vq c(T $$0) {
      return (vq)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private we d(T $$0) {
      return vp.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected we aN_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fdj $$0) {
      $$0.a(fdi.a, this.aN_());
      if (this.j) {
         T $$1 = this.b(1);
         vq $$2 = this.c($$1);
         if (this.aL_()) {
            $$0.a(fdi.d, vq.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fdi.d, vq.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public we d() {
      return a_((vq)(this.q ? this.d(this.f) : this.x()));
   }

   public static <T> ezv.a<T> a(Function<T, vq> $$0) {
      return new ezv.a<>($$0);
   }

   public static ezv.a<Boolean> a(vq $$0, vq $$1) {
      return new ezv.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static ezv.a<Boolean> e() {
      return new ezv.a<Boolean>($$0 -> $$0 ? vp.b : vp.c).a(b);
   }

   public static ezv.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, vq> c;
      private exr.l<T> d = $$0x -> null;
      private Function<ezv<T>, we> e = ezv::d;
      private ezv.c<T> f = ezv.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, vq> $$0) {
         this.c = $$0;
      }

      public ezv.a<T> a(Collection<T> $$0) {
         return this.a(ezv.c.a($$0));
      }

      @SafeVarargs
      public final ezv.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public ezv.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(ezv.c.a(ezv.a, $$0, $$1));
      }

      public ezv.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(ezv.c.a($$0, $$1, $$2));
      }

      public ezv.a<T> a(ezv.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public ezv.a<T> a(exr.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public ezv.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public ezv.a<T> a(Function<ezv<T>, we> $$0) {
         this.e = $$0;
         return this;
      }

      public ezv.a<T> a() {
         this.g = true;
         return this;
      }

      public ezv<T> a(int $$0, int $$1, int $$2, int $$3, vq $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public ezv<T> a(int $$0, int $$1, int $$2, int $$3, vq $$4, ezv.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            vq $$8 = this.c.apply($$7);
            vq $$9 = (vq)(this.g ? $$8 : vp.a($$4, $$8));
            return new ezv<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(ezv<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> ezv.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new ezv.c<T>() {
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

      static <T> ezv.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new ezv.c<T>() {
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
