import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fna extends fmj<fna.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fva n;

   public fna(fke $$0, int $$1, fva $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fkh<?> $$0) {
      this.b(fna.b.a(this.c.n, $$0, this.n));
   }

   public void a(fkh<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fkh<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fna.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fmb> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fmb $$0, @Nullable fmb $$1) {
      this.b(fna.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fmb b(fkh<?> $$0) {
      for (fna.a $$1 : this.aH_()) {
         if ($$1 instanceof fna.b $$2) {
            fmb $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (fna.a $$0 : this.aH_()) {
         if ($$0 instanceof fna.b) {
            fna.b $$1 = (fna.b)$$0;

            for (fmb $$2 : $$1.a.values()) {
               if ($$2 instanceof fkh.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<foa> e(double $$0, double $$1) {
      for (fna.a $$2 : this.aH_()) {
         for (foa $$3 : $$2.aH_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fmj.a<fna.a> {
      private final List<fmb> a;
      private final frw b;
      private static final int c = 160;

      a(List<fmb> $$0, frw $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fna.a a(List<fmb> $$0, frw $$1) {
         return new fna.a($$0, $$1);
      }

      public static fna.a a(fmb $$0, @Nullable fmb $$1, frw $$2) {
         return $$1 == null ? new fna.a(ImmutableList.of($$0), $$2) : new fna.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fmb $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends foa> aH_() {
         return this.a;
      }

      @Override
      public List<? extends fpz> b() {
         return this.a;
      }
   }

   protected static class b extends fna.a {
      final Map<fkh<?>, fmb> a;

      private b(Map<fkh<?>, fmb> $$0, fva $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fna.b a(fki $$0, fkh<?> $$1, fva $$2) {
         return new fna.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fna.b a(fki $$0, fkh<?> $$1, @Nullable fkh<?> $$2, fva $$3) {
         fmb $$4 = $$1.a($$0);
         return $$2 == null ? new fna.b(ImmutableMap.of($$1, $$4), $$3) : new fna.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
