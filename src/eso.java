import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class eso<T> extends erz {
   public static final BooleanSupplier a = exz::r;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final tf c;
   private int d;
   private T l;
   private final eso.c<T> m;
   private final Function<T, tf> n;
   private final Function<eso<T>, ts> o;
   private final eso.b<T> p;
   private final boolean q;
   private final eqp.l<T> s;

   eso(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      tf $$4,
      tf $$5,
      int $$6,
      T $$7,
      eso.c<T> $$8,
      Function<T, tf> $$9,
      Function<eso<T>, ts> $$10,
      eso.b<T> $$11,
      eqp.l<T> $$12,
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
      if (exz.q()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = arp.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T h(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(arp.b(this.d + $$0, $$1.size()));
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
      tf $$1 = this.c($$0);
      this.b($$1);
      this.l = $$0;
      this.f();
   }

   private tf c(T $$0) {
      return (tf)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private ts d(T $$0) {
      return te.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.l;
   }

   @Override
   protected ts aB_() {
      return this.o.apply(this);
   }

   @Override
   public void a(evx $$0) {
      $$0.a(evw.a, this.aB_());
      if (this.i) {
         T $$1 = this.h(1);
         tf $$2 = this.c($$1);
         if (this.ax_()) {
            $$0.a(evw.d, tf.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(evw.d, tf.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public ts b() {
      return a((tf)(this.q ? this.d(this.l) : this.l()));
   }

   public static <T> eso.a<T> a(Function<T, tf> $$0) {
      return new eso.a<>($$0);
   }

   public static eso.a<Boolean> a(tf $$0, tf $$1) {
      return new eso.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static eso.a<Boolean> e() {
      return new eso.a<Boolean>($$0 -> $$0 ? te.b : te.c).a(b);
   }

   public static eso.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, tf> c;
      private eqp.l<T> d = $$0x -> null;
      private Function<eso<T>, ts> e = eso::b;
      private eso.c<T> f = eso.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, tf> $$0) {
         this.c = $$0;
      }

      public eso.a<T> a(Collection<T> $$0) {
         return this.a(eso.c.a($$0));
      }

      @SafeVarargs
      public final eso.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public eso.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(eso.c.a(eso.a, $$0, $$1));
      }

      public eso.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(eso.c.a($$0, $$1, $$2));
      }

      public eso.a<T> a(eso.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public eso.a<T> a(eqp.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public eso.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public eso.a<T> a(Function<eso<T>, ts> $$0) {
         this.e = $$0;
         return this;
      }

      public eso.a<T> a() {
         this.g = true;
         return this;
      }

      public eso<T> a(int $$0, int $$1, int $$2, int $$3, tf $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public eso<T> a(int $$0, int $$1, int $$2, int $$3, tf $$4, eso.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            tf $$8 = this.c.apply($$7);
            tf $$9 = (tf)(this.g ? $$8 : te.a($$4, $$8));
            return new eso<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(eso<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> eso.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new eso.c<T>() {
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

      static <T> eso.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new eso.c<T>() {
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
