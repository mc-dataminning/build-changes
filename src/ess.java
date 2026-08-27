import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ess<T> extends esd {
   public static final BooleanSupplier a = eyf::r;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final ti c;
   private int d;
   private T l;
   private final ess.c<T> m;
   private final Function<T, ti> n;
   private final Function<ess<T>, tv> o;
   private final ess.b<T> p;
   private final boolean q;
   private final eqt.l<T> s;

   ess(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      ti $$4,
      ti $$5,
      int $$6,
      T $$7,
      ess.c<T> $$8,
      Function<T, ti> $$9,
      Function<ess<T>, tv> $$10,
      ess.b<T> $$11,
      eqt.l<T> $$12,
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
      if (eyf.q()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = ars.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T i(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(ars.b(this.d + $$0, $$1.size()));
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
      ti $$1 = this.c($$0);
      this.b($$1);
      this.l = $$0;
      this.f();
   }

   private ti c(T $$0) {
      return (ti)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private tv d(T $$0) {
      return th.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.l;
   }

   @Override
   protected tv aA_() {
      return this.o.apply(this);
   }

   @Override
   public void a(ewd $$0) {
      $$0.a(ewc.a, this.aA_());
      if (this.i) {
         T $$1 = this.i(1);
         ti $$2 = this.c($$1);
         if (this.ay_()) {
            $$0.a(ewc.d, ti.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(ewc.d, ti.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public tv b() {
      return a((ti)(this.q ? this.d(this.l) : this.m()));
   }

   public static <T> ess.a<T> a(Function<T, ti> $$0) {
      return new ess.a<>($$0);
   }

   public static ess.a<Boolean> a(ti $$0, ti $$1) {
      return new ess.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static ess.a<Boolean> e() {
      return new ess.a<Boolean>($$0 -> $$0 ? th.b : th.c).a(b);
   }

   public static ess.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, ti> c;
      private eqt.l<T> d = $$0x -> null;
      private Function<ess<T>, tv> e = ess::b;
      private ess.c<T> f = ess.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, ti> $$0) {
         this.c = $$0;
      }

      public ess.a<T> a(Collection<T> $$0) {
         return this.a(ess.c.a($$0));
      }

      @SafeVarargs
      public final ess.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public ess.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(ess.c.a(ess.a, $$0, $$1));
      }

      public ess.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(ess.c.a($$0, $$1, $$2));
      }

      public ess.a<T> a(ess.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public ess.a<T> a(eqt.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public ess.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public ess.a<T> a(Function<ess<T>, tv> $$0) {
         this.e = $$0;
         return this;
      }

      public ess.a<T> a() {
         this.g = true;
         return this;
      }

      public ess<T> a(int $$0, int $$1, int $$2, int $$3, ti $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public ess<T> a(int $$0, int $$1, int $$2, int $$3, ti $$4, ess.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            ti $$8 = this.c.apply($$7);
            ti $$9 = (ti)(this.g ? $$8 : th.a($$4, $$8));
            return new ess<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(ess<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> ess.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new ess.c<T>() {
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

      static <T> ess.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new ess.c<T>() {
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
