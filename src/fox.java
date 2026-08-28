import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fox<T> extends fof {
   public static final BooleanSupplier a = fui::u;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final wo c;
   private int d;
   private T f;
   private final fox.c<T> m;
   private final Function<T, wo> n;
   private final Function<fox<T>, xc> o;
   private final fox.b<T> p;
   private final boolean q;
   private final flk.l<T> r;

   fox(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      wo $$4,
      wo $$5,
      int $$6,
      T $$7,
      fox.c<T> $$8,
      Function<T, wo> $$9,
      Function<fox<T>, xc> $$10,
      fox.b<T> $$11,
      flk.l<T> $$12,
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
      if (fui.t()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = ayy.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(ayy.b(this.d + $$0, $$1.size()));
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
      wo $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.g();
   }

   private wo c(T $$0) {
      return (wo)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private xc d(T $$0) {
      return wn.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected xc d() {
      return this.o.apply(this);
   }

   @Override
   public void a(fsn $$0) {
      $$0.a(fsm.a, this.d());
      if (this.j) {
         T $$1 = this.b(1);
         wo $$2 = this.c($$1);
         if (this.aM_()) {
            $$0.a(fsm.d, wo.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fsm.d, wo.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public xc c() {
      return a_((wo)(this.q ? this.d(this.f) : this.B()));
   }

   public static <T> fox.a<T> a(Function<T, wo> $$0) {
      return new fox.a<>($$0);
   }

   public static fox.a<Boolean> a(wo $$0, wo $$1) {
      return new fox.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fox.a<Boolean> e() {
      return new fox.a<Boolean>($$0 -> $$0 ? wn.b : wn.c).a(b);
   }

   public static fox.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, wo> c;
      private flk.l<T> d = $$0x -> null;
      private Function<fox<T>, xc> e = fox::c;
      private fox.c<T> f = fox.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, wo> $$0) {
         this.c = $$0;
      }

      public fox.a<T> a(Collection<T> $$0) {
         return this.a(fox.c.a($$0));
      }

      @SafeVarargs
      public final fox.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fox.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fox.c.a(fox.a, $$0, $$1));
      }

      public fox.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fox.c.a($$0, $$1, $$2));
      }

      public fox.a<T> a(fox.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fox.a<T> a(flk.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fox.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fox.a<T> a(Function<fox<T>, xc> $$0) {
         this.e = $$0;
         return this;
      }

      public fox.a<T> a() {
         this.g = true;
         return this;
      }

      public fox<T> a(wo $$0, fox.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fox<T> a(int $$0, int $$1, int $$2, int $$3, wo $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public fox<T> a(int $$0, int $$1, int $$2, int $$3, wo $$4, fox.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            wo $$8 = this.c.apply($$7);
            wo $$9 = (wo)(this.g ? $$8 : wn.a($$4, $$8));
            return new fox<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(fox<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fox.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fox.c<T>() {
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

      static <T> fox.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fox.c<T>() {
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
