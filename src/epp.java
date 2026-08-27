import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class epp<T> extends eoz {
   public static final BooleanSupplier a = euq::r;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final sw c;
   private int d;
   private T e;
   private final epp.c<T> f;
   private final Function<T, sw> u;
   private final Function<epp<T>, tj> v;
   private final epp.b<T> w;
   private final boolean x;
   private final enq.l<T> y;

   epp(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      sw $$4,
      sw $$5,
      int $$6,
      T $$7,
      epp.c<T> $$8,
      Function<T, sw> $$9,
      Function<epp<T>, tj> $$10,
      epp.b<T> $$11,
      enq.l<T> $$12,
      boolean $$13
   ) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
      this.u = $$9;
      this.v = $$10;
      this.w = $$11;
      this.x = $$13;
      this.y = $$12;
      this.f();
   }

   private void f() {
      this.a(this.y.apply(this.e));
   }

   @Override
   public void c() {
      if (euq.q()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.f.a();
      this.d = apa.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.w.onValueChange(this, $$2);
   }

   private T h(int $$0) {
      List<T> $$1 = this.f.a();
      return $$1.get(apa.b(this.d + $$0, $$1.size()));
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2) {
      if ($$2 > 0.0) {
         this.a(-1);
      } else if ($$2 < 0.0) {
         this.a(1);
      }

      return true;
   }

   public void a(T $$0) {
      List<T> $$1 = this.f.a();
      int $$2 = $$1.indexOf($$0);
      if ($$2 != -1) {
         this.d = $$2;
      }

      this.b($$0);
   }

   private void b(T $$0) {
      sw $$1 = this.c($$0);
      this.b($$1);
      this.e = $$0;
      this.f();
   }

   private sw c(T $$0) {
      return (sw)(this.x ? this.u.apply($$0) : this.d($$0));
   }

   private tj d(T $$0) {
      return sv.a(this.c, this.u.apply($$0));
   }

   public T a() {
      return this.e;
   }

   @Override
   protected tj aE_() {
      return this.v.apply(this);
   }

   @Override
   public void a(esp $$0) {
      $$0.a(eso.a, this.aE_());
      if (this.r) {
         T $$1 = this.h(1);
         sw $$2 = this.c($$1);
         if (this.aB_()) {
            $$0.a(eso.d, sw.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(eso.d, sw.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public tj b() {
      return a((sw)(this.x ? this.d(this.e) : this.l()));
   }

   public static <T> epp.a<T> a(Function<T, sw> $$0) {
      return new epp.a<>($$0);
   }

   public static epp.a<Boolean> a(sw $$0, sw $$1) {
      return new epp.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static epp.a<Boolean> e() {
      return new epp.a<Boolean>($$0 -> $$0 ? sv.b : sv.c).a(b);
   }

   public static epp.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, sw> c;
      private enq.l<T> d = $$0x -> null;
      private Function<epp<T>, tj> e = epp::b;
      private epp.c<T> f = epp.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, sw> $$0) {
         this.c = $$0;
      }

      public epp.a<T> a(Collection<T> $$0) {
         return this.a(epp.c.a($$0));
      }

      @SafeVarargs
      public final epp.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public epp.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(epp.c.a(epp.a, $$0, $$1));
      }

      public epp.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(epp.c.a($$0, $$1, $$2));
      }

      public epp.a<T> a(epp.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public epp.a<T> a(enq.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public epp.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public epp.a<T> a(Function<epp<T>, tj> $$0) {
         this.e = $$0;
         return this;
      }

      public epp.a<T> a() {
         this.g = true;
         return this;
      }

      public epp<T> a(int $$0, int $$1, int $$2, int $$3, sw $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public epp<T> a(int $$0, int $$1, int $$2, int $$3, sw $$4, epp.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            sw $$8 = this.c.apply($$7);
            sw $$9 = (sw)(this.g ? $$8 : sv.a($$4, $$8));
            return new epp<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(epp<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> epp.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new epp.c<T>() {
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

      static <T> epp.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new epp.c<T>() {
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
