import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class exy<T> extends exi {
   public static final BooleanSupplier a = fdm::w;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final vg c;
   private int d;
   private T f;
   private final exy.c<T> m;
   private final Function<T, vg> n;
   private final Function<exy<T>, vu> o;
   private final exy.b<T> p;
   private final boolean q;
   private final evu.l<T> r;

   exy(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      vg $$4,
      vg $$5,
      int $$6,
      T $$7,
      exy.c<T> $$8,
      Function<T, vg> $$9,
      Function<exy<T>, vu> $$10,
      exy.b<T> $$11,
      evu.l<T> $$12,
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
      if (fdm.v()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = aup.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(aup.b(this.d + $$0, $$1.size()));
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
      vg $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.f();
   }

   private vg c(T $$0) {
      return (vg)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private vu d(T $$0) {
      return vf.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected vu aM_() {
      return this.o.apply(this);
   }

   @Override
   public void a(fbk $$0) {
      $$0.a(fbj.a, this.aM_());
      if (this.j) {
         T $$1 = this.b(1);
         vg $$2 = this.c($$1);
         if (this.aK_()) {
            $$0.a(fbj.d, vg.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(fbj.d, vg.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public vu d() {
      return a_((vg)(this.q ? this.d(this.f) : this.x()));
   }

   public static <T> exy.a<T> a(Function<T, vg> $$0) {
      return new exy.a<>($$0);
   }

   public static exy.a<Boolean> a(vg $$0, vg $$1) {
      return new exy.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static exy.a<Boolean> e() {
      return new exy.a<Boolean>($$0 -> $$0 ? vf.b : vf.c).a(b);
   }

   public static exy.a<Boolean> b(boolean $$0) {
      return e().a($$0);
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, vg> c;
      private evu.l<T> d = $$0x -> null;
      private Function<exy<T>, vu> e = exy::d;
      private exy.c<T> f = exy.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, vg> $$0) {
         this.c = $$0;
      }

      public exy.a<T> a(Collection<T> $$0) {
         return this.a(exy.c.a($$0));
      }

      @SafeVarargs
      public final exy.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public exy.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(exy.c.a(exy.a, $$0, $$1));
      }

      public exy.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(exy.c.a($$0, $$1, $$2));
      }

      public exy.a<T> a(exy.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public exy.a<T> a(evu.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public exy.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public exy.a<T> a(Function<exy<T>, vu> $$0) {
         this.e = $$0;
         return this;
      }

      public exy.a<T> a() {
         this.g = true;
         return this;
      }

      public exy<T> a(int $$0, int $$1, int $$2, int $$3, vg $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {
         });
      }

      public exy<T> a(int $$0, int $$1, int $$2, int $$3, vg $$4, exy.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            vg $$8 = this.c.apply($$7);
            vg $$9 = (vg)(this.g ? $$8 : vf.a($$4, $$8));
            return new exy<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   public interface b<T> {
      void onValueChange(exy<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> exy.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new exy.c<T>() {
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

      static <T> exy.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new exy.c<T>() {
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
