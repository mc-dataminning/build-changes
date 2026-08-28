import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fts extends ftb<fts.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final gbt n;

   public fts(fpo $$0, int $$1, gbt $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fpr<?> $$0) {
      this.b(fts.b.a(this.c.n, $$0, this.n));
   }

   public void a(fpr<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fpr<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fts.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fst> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fst $$0, @Nullable fst $$1) {
      this.b(fts.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public fst b(fpr<?> $$0) {
      for (fts.a $$1 : this.aE_()) {
         if ($$1 instanceof fts.b $$2) {
            fst $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fts.a $$0 : this.aE_()) {
         if ($$0 instanceof fts.b) {
            fts.b $$1 = (fts.b)$$0;

            for (fst $$2 : $$1.a.values()) {
               if ($$2 instanceof fpr.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fus> e(double $$0, double $$1) {
      for (fts.a $$2 : this.aE_()) {
         for (fus $$3 : $$2.aE_()) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends ftb.a<fts.a> {
      private final List<fst> a;
      private final fyn b;
      private static final int c = 160;

      a(List<fst> $$0, fyn $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fts.a a(List<fst> $$0, fyn $$1) {
         return new fts.a($$0, $$1);
      }

      public static fts.a a(fst $$0, @Nullable fst $$1, fyn $$2) {
         return $$1 == null ? new fts.a(ImmutableList.of($$0), $$2) : new fts.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fsh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fst $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fus> aE_() {
         return this.a;
      }

      @Override
      public List<? extends fwq> b() {
         return this.a;
      }
   }

   protected static class b extends fts.a {
      final Map<fpr<?>, fst> a;

      private b(Map<fpr<?>, fst> $$0, gbt $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fts.b a(fps $$0, fpr<?> $$1, gbt $$2) {
         return new fts.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fts.b a(fps $$0, fpr<?> $$1, @Nullable fpr<?> $$2, gbt $$3) {
         fst $$4 = $$1.a($$0);
         return $$2 == null ? new fts.b(ImmutableMap.of($$1, $$4), $$3) : new fts.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
