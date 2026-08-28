import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fpb<T> extends foj {
   public static final BooleanSupplier a = fum::u;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final wp c;
   private int d;
   private T f;
   private final fpb.c<T> m;
   private final Function<T, wp> n;
   private final Function<fpb<T>, xd> o;
   private final fpb.b<T> p;
   private final boolean q;
   private final fln.l<T> r;

   fpb(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      wp $$4,
      wp $$5,
      int $$6,
      T $$7,
      fpb.c<T> $$8,
      Function<T, wp> $$9,
      Function<fpb<T>, xd> $$10,
      fpb.b<T> $$11,
      fln.l<T> $$12,
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
      if (fum.t()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = ayz.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(ayz.b(this.d + $$0, $$1.size()));
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
      wp $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.g();
   }

   private wp c(T $$0) {
      return (wp)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xd d(T $$0) {
      return wo.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xd d() {
      return this.o.apply(this);
   }

   @Override
   public void a(fsr $$0) {
      $$0.a(fsq.a, this.d());
      if (this.j) {
         T $$1 = this.b(1);
         wp $$2 = this.c($$1);
         if (this.aM_()) {
            $$0.a(fsq.d, wp.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fsq.d, wp.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xd c() {
      return a_((wp)(this.q ? this.d(this.f) : this.B()));
   }

   public static <T> fpb.a<T> a(Function<T, wp> $$0) {
      return new fpb.a<>($$0);
   }

   public static fpb.a<Boolean> a(wp $$0, wp $$1) {
      return new fpb.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fpb.a<Boolean> e() {
      return new fpb.a<Boolean>($$0 -> $$0 ? wo.b : wo.c).a(b);
   }

   public static fpb.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, wp> c;
      private fln.l<T> d = $$0x -> null;
      private Function<fpb<T>, xd> e = fpb::c;
      private fpb.c<T> f = fpb.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, wp> $$0) {
         this.c = $$0;
      }

      public fpb.a<T> a(Collection<T> $$0) {
         return this.a(fpb.c.a($$0));
      }

      @SafeVarargs
      public final fpb.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fpb.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fpb.c.a(fpb.a, $$0, $$1));
      }

      public fpb.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fpb.c.a($$0, $$1, $$2));
      }

      public fpb.a<T> a(fpb.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fpb.a<T> a(fln.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fpb.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fpb.a<T> a(Function<fpb<T>, xd> $$0) {
         this.e = $$0;
         return this;
      }

      public fpb.a<T> a() {
         this.g = true;
         return this;
      }

      public fpb<T> a(wp $$0, fpb.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fpb<T> a(int $$0, int $$1, int $$2, int $$3, wp $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fpb<T> a(int $$0, int $$1, int $$2, int $$3, wp $$4, fpb.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            wp $$8 = this.c.apply($$7);
            wp $$9 = (wp)(this.g ? $$8 : wo.a($$4, $$8));
            return new fpb<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fpb<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fpb.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fpb.c<T>() {
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

      static <T> fpb.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fpb.c<T>() {
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
