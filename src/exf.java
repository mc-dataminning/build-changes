import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class exf<T> extends ewp {
   public static final BooleanSupplier a = fct::t;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final vd c;
   private int d;
   private T f;
   private final exf.c<T> m;
   private final Function<T, vd> n;
   private final Function<exf<T>, vr> o;
   private final exf.b<T> p;
   private final boolean q;
   private final evd.l<T> r;

   exf(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      vd $$4,
      vd $$5,
      int $$6,
      T $$7,
      exf.c<T> $$8,
      Function<T, vd> $$9,
      Function<exf<T>, vr> $$10,
      exf.b<T> $$11,
      evd.l<T> $$12,
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
      if (fct.s()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = aui.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(aui.b(this.d + $$0, $$1.size()));
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
      vd $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private vd c(T $$0) {
      return (vd)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private vr d(T $$0) {
      return vc.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected vr aK_() {
      return this.o.apply(this);
   }

   @Override
   public void a(far $$0) {
      $$0.a(faq.a, this.aK_());
      if (this.j) {
         T $$1 = this.b(1);
         vd $$2 = this.c($$1);
         if (this.aI_()) {
            $$0.a(faq.d, vd.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(faq.d, vd.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public vr d() {
      return a_((vd)(this.q ? this.d(this.f) : this.x()));
   }

   public static <T> exf.a<T> a(Function<T, vd> $$0) {
      return new exf.a<>($$0);
   }

   public static exf.a<Boolean> a(vd $$0, vd $$1) {
      return new exf.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static exf.a<Boolean> e() {
      return new exf.a<Boolean>($$0 -> $$0 ? vc.b : vc.c).a(b);
   }

   public static exf.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, vd> c;
      private evd.l<T> d = $$0x -> null;
      private Function<exf<T>, vr> e = exf::d;
      private exf.c<T> f = exf.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, vd> $$0) {
         this.c = $$0;
      }

      public exf.a<T> a(Collection<T> $$0) {
         return this.a(exf.c.a($$0));
      }

      @SafeVarargs
      public final exf.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public exf.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(exf.c.a(exf.a, $$0, $$1));
      }

      public exf.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(exf.c.a($$0, $$1, $$2));
      }

      public exf.a<T> a(exf.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public exf.a<T> a(evd.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public exf.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public exf.a<T> a(Function<exf<T>, vr> $$0) {
         this.e = $$0;
         return this;
      }

      public exf.a<T> a() {
         this.g = true;
         return this;
      }

      public exf<T> a(int $$0, int $$1, int $$2, int $$3, vd $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public exf<T> a(int $$0, int $$1, int $$2, int $$3, vd $$4, exf.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            vd $$8 = this.c.apply($$7);
            vd $$9 = (vd)(this.g ? $$8 : vc.a($$4, $$8));
            return new exf<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(exf<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> exf.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new exf.c<T>() {
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

      static <T> exf.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new exf.c<T>() {
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
