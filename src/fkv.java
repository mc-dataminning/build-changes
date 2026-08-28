import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fkv<T> extends fkf {
   public static final BooleanSupplier a = fqh::u;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final xe c;
   private int d;
   private T f;
   private final fkv.c<T> m;
   private final Function<T, xe> n;
   private final Function<fkv<T>, xs> o;
   private final fkv.b<T> p;
   private final boolean q;
   private final fis.l<T> r;

   fkv(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      xe $$4,
      xe $$5,
      int $$6,
      T $$7,
      fkv.c<T> $$8,
      Function<T, xe> $$9,
      Function<fkv<T>, xs> $$10,
      fkv.b<T> $$11,
      fis.l<T> $$12,
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
      if (fqh.t()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = azf.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(azf.b(this.d + $$0, $$1.size()));
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
      xe $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private xe c(T $$0) {
      return (xe)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xs d(T $$0) {
      return xd.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xs aP_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fol $$0) {
      $$0.a(fok.a, this.aP_());
      if (this.j) {
         T $$1 = this.b(1);
         xe $$2 = this.c($$1);
         if (this.aN_()) {
            $$0.a(fok.d, xe.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fok.d, xe.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xs c() {
      return a_((xe)(this.q ? this.d(this.f) : this.z()));
   }

   public static <T> fkv.a<T> a(Function<T, xe> $$0) {
      return new fkv.a<>($$0);
   }

   public static fkv.a<Boolean> a(xe $$0, xe $$1) {
      return new fkv.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fkv.a<Boolean> e() {
      return new fkv.a<Boolean>($$0 -> $$0 ? xd.b : xd.c).a(b);
   }

   public static fkv.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, xe> c;
      private fis.l<T> d = $$0x -> null;
      private Function<fkv<T>, xs> e = fkv::c;
      private fkv.c<T> f = fkv.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, xe> $$0) {
         this.c = $$0;
      }

      public fkv.a<T> a(Collection<T> $$0) {
         return this.a(fkv.c.a($$0));
      }

      @SafeVarargs
      public final fkv.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fkv.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fkv.c.a(fkv.a, $$0, $$1));
      }

      public fkv.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fkv.c.a($$0, $$1, $$2));
      }

      public fkv.a<T> a(fkv.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fkv.a<T> a(fis.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fkv.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fkv.a<T> a(Function<fkv<T>, xs> $$0) {
         this.e = $$0;
         return this;
      }

      public fkv.a<T> a() {
         this.g = true;
         return this;
      }

      public fkv<T> a(xe $$0, fkv.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fkv<T> a(int $$0, int $$1, int $$2, int $$3, xe $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fkv<T> a(int $$0, int $$1, int $$2, int $$3, xe $$4, fkv.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            xe $$8 = this.c.apply($$7);
            xe $$9 = (xe)(this.g ? $$8 : xd.a($$4, $$8));
            return new fkv<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fkv<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fkv.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fkv.c<T>() {
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

      static <T> fkv.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fkv.c<T>() {
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
