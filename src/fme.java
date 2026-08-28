import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fme extends fln<fme.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fud n;

   public fme(fji $$0, int $$1, fud $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fjl<?> $$0) {
      this.b(fme.b.a(this.c.n, $$0, this.n));
   }

   public void a(fjl<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fjl<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fme.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<flf> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(flf $$0, @Nullable flf $$1) {
      this.b(fme.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public flf b(fjl<?> $$0) {
      for (fme.a $$1 : this.aI_()) {
         if ($$1 instanceof fme.b $$2) {
            flf $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (fme.a $$0 : this.aI_()) {
         if ($$0 instanceof fme.b) {
            fme.b $$1 = (fme.b)$$0;

            for (flf $$2 : $$1.a.values()) {
               if ($$2 instanceof fjl.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fne> e(double $$0, double $$1) {
      for (fme.a $$2 : this.aI_()) {
         for (fne $$3 : $$2.aI_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fln.a<fme.a> {
      private final List<flf> a;
      private final fra b;
      private static final int c = 160;

      a(List<flf> $$0, fra $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fme.a a(List<flf> $$0, fra $$1) {
         return new fme.a($$0, $$1);
      }

      public static fme.a a(flf $$0, @Nullable flf $$1, fra $$2) {
         return $$1 == null ? new fme.a(ImmutableList.of($$0), $$2) : new fme.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (flf $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fne> aI_() {
         return this.a;
      }

      @Override
      public List<? extends fpd> b() {
         return this.a;
      }
   }

   protected static class b extends fme.a {
      final Map<fjl<?>, flf> a;

      private b(Map<fjl<?>, flf> $$0, fud $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fme.b a(fjm $$0, fjl<?> $$1, fud $$2) {
         return new fme.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fme.b a(fjm $$0, fjl<?> $$1, @Nullable fjl<?> $$2, fud $$3) {
         flf $$4 = $$1.a($$0);
         return $$2 == null ? new fme.b(ImmutableMap.of($$1, $$4), $$3) : new fme.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
