import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class etq<T> extends etb {
   public static final BooleanSupplier a = ezd::r;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final ui c;
   private int d;
   private T l;
   private final etq.c<T> m;
   private final Function<T, ui> n;
   private final Function<etq<T>, uw> o;
   private final etq.b<T> p;
   private final boolean q;
   private final err.l<T> s;

   etq(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      ui $$4,
      ui $$5,
      int $$6,
      T $$7,
      etq.c<T> $$8,
      Function<T, ui> $$9,
      Function<etq<T>, uw> $$10,
      etq.b<T> $$11,
      err.l<T> $$12,
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
      if (ezd.q()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = asy.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T i(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(asy.b(this.d + $$0, $$1.size()));
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
      ui $$1 = this.c($$0);
      this.b($$1);
      this.l = $$0;
      this.f();
   }

   private ui c(T $$0) {
      return (ui)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private uw d(T $$0) {
      return uh.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.l;
   }

   @Override
   protected uw aI_() {
      return this.o.apply(this);
   }

   @Override
   public void a(exc $$0) {
      $$0.a(exb.a, this.aI_());
      if (this.i) {
         T $$1 = this.i(1);
         ui $$2 = this.c($$1);
         if (this.aG_()) {
            $$0.a(exb.d, ui.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(exb.d, ui.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public uw b() {
      return a((ui)(this.q ? this.d(this.l) : this.l()));
   }

   public static <T> etq.a<T> a(Function<T, ui> $$0) {
      return new etq.a<>($$0);
   }

   public static etq.a<Boolean> a(ui $$0, ui $$1) {
      return new etq.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static etq.a<Boolean> e() {
      return new etq.a<Boolean>($$0 -> $$0 ? uh.b : uh.c).a(b);
   }

   public static etq.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, ui> c;
      private err.l<T> d = $$0x -> null;
      private Function<etq<T>, uw> e = etq::b;
      private etq.c<T> f = etq.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, ui> $$0) {
         this.c = $$0;
      }

      public etq.a<T> a(Collection<T> $$0) {
         return this.a(etq.c.a($$0));
      }

      @SafeVarargs
      public final etq.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public etq.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(etq.c.a(etq.a, $$0, $$1));
      }

      public etq.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(etq.c.a($$0, $$1, $$2));
      }

      public etq.a<T> a(etq.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public etq.a<T> a(err.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public etq.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public etq.a<T> a(Function<etq<T>, uw> $$0) {
         this.e = $$0;
         return this;
      }

      public etq.a<T> a() {
         this.g = true;
         return this;
      }

      public etq<T> a(int $$0, int $$1, int $$2, int $$3, ui $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public etq<T> a(int $$0, int $$1, int $$2, int $$3, ui $$4, etq.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            ui $$8 = this.c.apply($$7);
            ui $$9 = (ui)(this.g ? $$8 : uh.a($$4, $$8));
            return new etq<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(etq<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> etq.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new etq.c<T>() {
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

      static <T> etq.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new etq.c<T>() {
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
