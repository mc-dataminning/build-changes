import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fij extends fhs<fij.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fqf n;

   public fij(ffn $$0, int $$1, fqf $$2) {
      super($$0, $$1, $$2.r.d(), $$2.r.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(ffq<?> $$0) {
      this.b(fij.b.a(this.c.m, $$0, this.n));
   }

   public void a(ffq<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         ffq<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fij.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fhk> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fhk $$0, @Nullable fhk $$1) {
      this.b(fij.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fhk b(ffq<?> $$0) {
      for (fij.a $$1 : this.aF_()) {
         if ($$1 instanceof fij.b $$2) {
            fhk $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (fij.a $$0 : this.aF_()) {
         if ($$0 instanceof fij.b) {
            fij.b $$1 = (fij.b)$$0;

            for (fhk $$2 : $$1.a.values()) {
               if ($$2 instanceof ffq.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fji> e(double $$0, double $$1) {
      for (fij.a $$2 : this.aF_()) {
         for (fji $$3 : $$2.aF_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fhs.a<fij.a> {
      private final List<fhk> a;
      private final fnd b;
      private static final int c = 160;

      a(List<fhk> $$0, fnd $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fij.a a(List<fhk> $$0, fnd $$1) {
         return new fij.a($$0, $$1);
      }

      public static fij.a a(fhk $$0, @Nullable fhk $$1, fnd $$2) {
         return $$1 == null ? new fij.a(ImmutableList.of($$0), $$2) : new fij.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.m / 2 - 155;

         for (fhk $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fji> aF_() {
         return this.a;
      }

      @Override
      public List<? extends flg> b() {
         return this.a;
      }
   }

   protected static class b extends fij.a {
      final Map<ffq<?>, fhk> a;

      private b(Map<ffq<?>, fhk> $$0, fqf $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fij.b a(ffr $$0, ffq<?> $$1, fqf $$2) {
         return new fij.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fij.b a(ffr $$0, ffq<?> $$1, @Nullable ffq<?> $$2, fqf $$3) {
         fhk $$4 = $$1.a($$0);
         return $$2 == null ? new fij.b(ImmutableMap.of($$1, $$4), $$3) : new fij.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
