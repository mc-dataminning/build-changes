import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class exl<T> extends ewv {
   public static final BooleanSupplier a = fcz::t;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final vf c;
   private int d;
   private T f;
   private final exl.c<T> m;
   private final Function<T, vf> n;
   private final Function<exl<T>, vt> o;
   private final exl.b<T> p;
   private final boolean q;
   private final evj.l<T> r;

   exl(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      vf $$4,
      vf $$5,
      int $$6,
      T $$7,
      exl.c<T> $$8,
      Function<T, vf> $$9,
      Function<exl<T>, vt> $$10,
      exl.b<T> $$11,
      evj.l<T> $$12,
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
      if (fcz.s()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = aun.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(aun.b(this.d + $$0, $$1.size()));
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
      vf $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private vf c(T $$0) {
      return (vf)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private vt d(T $$0) {
      return ve.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected vt aK_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fax $$0) {
      $$0.a(faw.a, this.aK_());
      if (this.j) {
         T $$1 = this.b(1);
         vf $$2 = this.c($$1);
         if (this.aI_()) {
            $$0.a(faw.d, vf.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(faw.d, vf.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public vt d() {
      return a_((vf)(this.q ? this.d(this.f) : this.x()));
   }

   public static <T> exl.a<T> a(Function<T, vf> $$0) {
      return new exl.a<>($$0);
   }

   public static exl.a<Boolean> a(vf $$0, vf $$1) {
      return new exl.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static exl.a<Boolean> e() {
      return new exl.a<Boolean>($$0 -> $$0 ? ve.b : ve.c).a(b);
   }

   public static exl.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, vf> c;
      private evj.l<T> d = $$0x -> null;
      private Function<exl<T>, vt> e = exl::d;
      private exl.c<T> f = exl.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, vf> $$0) {
         this.c = $$0;
      }

      public exl.a<T> a(Collection<T> $$0) {
         return this.a(exl.c.a($$0));
      }

      @SafeVarargs
      public final exl.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public exl.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(exl.c.a(exl.a, $$0, $$1));
      }

      public exl.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(exl.c.a($$0, $$1, $$2));
      }

      public exl.a<T> a(exl.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public exl.a<T> a(evj.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public exl.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public exl.a<T> a(Function<exl<T>, vt> $$0) {
         this.e = $$0;
         return this;
      }

      public exl.a<T> a() {
         this.g = true;
         return this;
      }

      public exl<T> a(int $$0, int $$1, int $$2, int $$3, vf $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public exl<T> a(int $$0, int $$1, int $$2, int $$3, vf $$4, exl.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            vf $$8 = this.c.apply($$7);
            vf $$9 = (vf)(this.g ? $$8 : ve.a($$4, $$8));
            return new exl<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(exl<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> exl.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new exl.c<T>() {
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

      static <T> exl.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new exl.c<T>() {
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
