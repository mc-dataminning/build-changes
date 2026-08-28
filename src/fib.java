import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fib extends fhk<fib.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fmv n;

   public fib(fff $$0, int $$1, int $$2, fmv $$3) {
      super($$0, $$1, $$3.d.d(), $$3.d.c(), 25);
      this.e = false;
      this.n = $$3;
   }

   public void a(ffi<?> $$0) {
      this.b(fib.b.a(this.c.m, $$0, this.n));
   }

   public void a(ffi<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         ffi<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fib.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fhc> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fhc $$0, @Nullable fhc $$1) {
      this.b(fib.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fhc b(ffi<?> $$0) {
      for (fib.a $$1 : this.aD_()) {
         if ($$1 instanceof fib.b $$2) {
            fhc $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (fib.a $$0 : this.aD_()) {
         if ($$0 instanceof fib.b) {
            fib.b $$1 = (fib.b)$$0;

            for (fhc $$2 : $$1.a.values()) {
               if ($$2 instanceof ffi.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fja> e(double $$0, double $$1) {
      for (fib.a $$2 : this.aD_()) {
         for (fja $$3 : $$2.aD_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fhk.a<fib.a> {
      private final List<fhc> a;
      private final fnd b;
      private static final int c = 160;

      a(List<fhc> $$0, fnd $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fib.a a(List<fhc> $$0, fnd $$1) {
         return new fib.a($$0, $$1);
      }

      public static fib.a a(fhc $$0, @Nullable fhc $$1, fnd $$2) {
         return $$1 == null ? new fib.a(ImmutableList.of($$0), $$2) : new fib.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fgr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fhc $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fja> aD_() {
         return this.a;
      }

      @Override
      public List<? extends fky> b() {
         return this.a;
      }
   }

   protected static class b extends fib.a {
      final Map<ffi<?>, fhc> a;

      private b(Map<ffi<?>, fhc> $$0, fmv $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fib.b a(ffj $$0, ffi<?> $$1, fmv $$2) {
         return new fib.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fib.b a(ffj $$0, ffi<?> $$1, @Nullable ffi<?> $$2, fmv $$3) {
         fhc $$4 = $$1.a($$0);
         return $$2 == null ? new fib.b(ImmutableMap.of($$1, $$4), $$3) : new fib.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
