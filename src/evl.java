import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class evl<T> extends euw {
   public static final BooleanSupplier a = faz::r;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final uv c;
   private int d;
   private T l;
   private final evl.c<T> m;
   private final Function<T, uv> n;
   private final Function<evl<T>, vj> o;
   private final evl.b<T> p;
   private final boolean q;
   private final etl.l<T> r;

   evl(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      uv $$4,
      uv $$5,
      int $$6,
      T $$7,
      evl.c<T> $$8,
      Function<T, uv> $$9,
      Function<evl<T>, vj> $$10,
      evl.b<T> $$11,
      etl.l<T> $$12,
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
      this.r = $$12;
      this.g();
   }

   private void g() {
      this.a(this.r.apply(this.l));
   }

   @Override
   public void b() {
      if (faz.q()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = atq.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T i(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(atq.b(this.d + $$0, $$1.size()));
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
      uv $$1 = this.c($$0);
      this.b($$1);
      this.l = $$0;
      this.g();
   }

   private uv c(T $$0) {
      return (uv)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private vj d(T $$0) {
      return uu.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.l;
   }

   @Override
   protected vj aN_() {
      return this.o.apply(this);
   }

   @Override
   public void a(eyx $$0) {
      $$0.a(eyw.a, this.aN_());
      if (this.i) {
         T $$1 = this.i(1);
         uv $$2 = this.c($$1);
         if (this.aK_()) {
            $$0.a(eyw.d, uv.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(eyw.d, uv.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public vj e() {
      return a((uv)(this.q ? this.d(this.l) : this.l()));
   }

   public static <T> evl.a<T> a(Function<T, uv> $$0) {
      return new evl.a<>($$0);
   }

   public static evl.a<Boolean> a(uv $$0, uv $$1) {
      return new evl.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static evl.a<Boolean> f() {
      return new evl.a<Boolean>($$0 -> $$0 ? uu.b : uu.c).a(b);
   }

   public static evl.a<Boolean> b(boolean $$0) {
      return f().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, uv> c;
      private etl.l<T> d = $$0x -> null;
      private Function<evl<T>, vj> e = evl::e;
      private evl.c<T> f = evl.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, uv> $$0) {
         this.c = $$0;
      }

      public evl.a<T> a(Collection<T> $$0) {
         return this.a(evl.c.a($$0));
      }

      @SafeVarargs
      public final evl.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public evl.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(evl.c.a(evl.a, $$0, $$1));
      }

      public evl.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(evl.c.a($$0, $$1, $$2));
      }

      public evl.a<T> a(evl.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public evl.a<T> a(etl.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public evl.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public evl.a<T> a(Function<evl<T>, vj> $$0) {
         this.e = $$0;
         return this;
      }

      public evl.a<T> a() {
         this.g = true;
         return this;
      }

      public evl<T> a(int $$0, int $$1, int $$2, int $$3, uv $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public evl<T> a(int $$0, int $$1, int $$2, int $$3, uv $$4, evl.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            uv $$8 = this.c.apply($$7);
            uv $$9 = (uv)(this.g ? $$8 : uu.a($$4, $$8));
            return new evl<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(evl<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> evl.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new evl.c<T>() {
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

      static <T> evl.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new evl.c<T>() {
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
