import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fll extends fku<fll.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final ftk n;

   public fll(fip $$0, int $$1, ftk $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fis<?> $$0) {
      this.b(fll.b.a(this.c.n, $$0, this.n));
   }

   public void a(fis<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fis<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fll.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fkm> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fkm $$0, @Nullable fkm $$1) {
      this.b(fll.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fkm b(fis<?> $$0) {
      for (fll.a $$1 : this.aJ_()) {
         if ($$1 instanceof fll.b $$2) {
            fkm $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (fll.a $$0 : this.aJ_()) {
         if ($$0 instanceof fll.b) {
            fll.b $$1 = (fll.b)$$0;

            for (fkm $$2 : $$1.a.values()) {
               if ($$2 instanceof fis.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fml> e(double $$0, double $$1) {
      for (fll.a $$2 : this.aJ_()) {
         for (fml $$3 : $$2.aJ_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fku.a<fll.a> {
      private final List<fkm> a;
      private final fqh b;
      private static final int c = 160;

      a(List<fkm> $$0, fqh $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fll.a a(List<fkm> $$0, fqh $$1) {
         return new fll.a($$0, $$1);
      }

      public static fll.a a(fkm $$0, @Nullable fkm $$1, fqh $$2) {
         return $$1 == null ? new fll.a(ImmutableList.of($$0), $$2) : new fll.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fkm $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fml> aJ_() {
         return this.a;
      }

      @Override
      public List<? extends foj> b() {
         return this.a;
      }
   }

   protected static class b extends fll.a {
      final Map<fis<?>, fkm> a;

      private b(Map<fis<?>, fkm> $$0, ftk $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fll.b a(fit $$0, fis<?> $$1, ftk $$2) {
         return new fll.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fll.b a(fit $$0, fis<?> $$1, @Nullable fis<?> $$2, ftk $$3) {
         fkm $$4 = $$1.a($$0);
         return $$2 == null ? new fll.b(ImmutableMap.of($$1, $$4), $$3) : new fll.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
