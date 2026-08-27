import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fgx extends fgg<fgx.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final flr n;

   public fgx(feb $$0, int $$1, int $$2, flr $$3) {
      super($$0, $$1, $$3.d.d(), $$3.d.c(), 25);
      this.e = false;
      this.n = $$3;
   }

   public void a(fee<?> $$0) {
      this.b(fgx.b.a(this.c.m, $$0, this.n));
   }

   public void a(fee<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fee<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fgx.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<ffy> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(ffy $$0, @Nullable ffy $$1) {
      this.b(fgx.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public ffy b(fee<?> $$0) {
      for (fgx.a $$1 : this.aF_()) {
         if ($$1 instanceof fgx.b $$2) {
            ffy $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public Optional<fhw> e(double $$0, double $$1) {
      for (fgx.a $$2 : this.aF_()) {
         for (fhw $$3 : $$2.aF_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fgg.a<fgx.a> {
      private final List<ffy> a;
      private final flz b;
      private static final int c = 160;

      a(List<ffy> $$0, flz $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fgx.a a(List<ffy> $$0, flz $$1) {
         return new fgx.a($$0, $$1);
      }

      public static fgx.a a(ffy $$0, @Nullable ffy $$1, flz $$2) {
         return $$1 == null ? new fgx.a(ImmutableList.of($$0), $$2) : new fgx.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (ffy $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fhw> aF_() {
         return this.a;
      }

      @Override
      public List<? extends fju> b() {
         return this.a;
      }
   }

   protected static class b extends fgx.a {
      final Map<fee<?>, ffy> a;

      private b(Map<fee<?>, ffy> $$0, flr $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fgx.b a(fef $$0, fee<?> $$1, flr $$2) {
         return new fgx.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fgx.b a(fef $$0, fee<?> $$1, @Nullable fee<?> $$2, flr $$3) {
         ffy $$4 = $$1.a($$0);
         return $$2 == null ? new fgx.b(ImmutableMap.of($$1, $$4), $$3) : new fgx.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
