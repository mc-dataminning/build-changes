import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fpr extends fpa<fpr.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fxq n;

   public fpr(flk $$0, int $$1, fxq $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fln<?> $$0) {
      this.b(fpr.b.a(this.c.n, $$0, this.n));
   }

   public void a(fln<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fln<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fpr.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fos> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fos $$0, @Nullable fos $$1) {
      this.b(fpr.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public fos b(fln<?> $$0) {
      for (fpr.a $$1 : this.aH_()) {
         if ($$1 instanceof fpr.b $$2) {
            fos $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fpr.a $$0 : this.aH_()) {
         if ($$0 instanceof fpr.b) {
            fpr.b $$1 = (fpr.b)$$0;

            for (fos $$2 : $$1.a.values()) {
               if ($$2 instanceof fln.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fqr> e(double $$0, double $$1) {
      for (fpr.a $$2 : this.aH_()) {
         for (fqr $$3 : $$2.aH_()) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fpa.a<fpr.a> {
      private final List<fos> a;
      private final fum b;
      private static final int c = 160;

      a(List<fos> $$0, fum $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fpr.a a(List<fos> $$0, fum $$1) {
         return new fpr.a($$0, $$1);
      }

      public static fpr.a a(fos $$0, @Nullable fos $$1, fum $$2) {
         return $$1 == null ? new fpr.a(ImmutableList.of($$0), $$2) : new fpr.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fos $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fqr> aH_() {
         return this.a;
      }

      @Override
      public List<? extends fsp> b() {
         return this.a;
      }
   }

   protected static class b extends fpr.a {
      final Map<fln<?>, fos> a;

      private b(Map<fln<?>, fos> $$0, fxq $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fpr.b a(flo $$0, fln<?> $$1, fxq $$2) {
         return new fpr.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fpr.b a(flo $$0, fln<?> $$1, @Nullable fln<?> $$2, fxq $$3) {
         fos $$4 = $$1.a($$0);
         return $$2 == null ? new fpr.b(ImmutableMap.of($$1, $$4), $$3) : new fpr.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
