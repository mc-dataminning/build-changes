import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fgw extends fgf<fgw.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final flq n;

   public fgw(fdz $$0, int $$1, int $$2, flq $$3) {
      super($$0, $$1, $$3.d.d(), $$3.d.c(), 25);
      this.e = false;
      this.n = $$3;
   }

   public void a(fec<?> $$0) {
      this.b(fgw.b.a(this.c.m, $$0, this.n));
   }

   public void a(fec<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fec<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fgw.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<ffx> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(ffx $$0, @Nullable ffx $$1) {
      this.b(fgw.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public ffx b(fec<?> $$0) {
      for (fgw.a $$1 : this.aE_()) {
         if ($$1 instanceof fgw.b $$2) {
            ffx $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public Optional<fhv> e(double $$0, double $$1) {
      for (fgw.a $$2 : this.aE_()) {
         for (fhv $$3 : $$2.aE_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fgf.a<fgw.a> {
      private final List<ffx> a;
      private final fly b;
      private static final int c = 160;

      a(List<ffx> $$0, fly $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fgw.a a(List<ffx> $$0, fly $$1) {
         return new fgw.a($$0, $$1);
      }

      public static fgw.a a(ffx $$0, @Nullable ffx $$1, fly $$2) {
         return $$1 == null ? new fgw.a(ImmutableList.of($$0), $$2) : new fgw.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (ffx $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fhv> aE_() {
         return this.a;
      }

      @Override
      public List<? extends fjt> b() {
         return this.a;
      }
   }

   protected static class b extends fgw.a {
      final Map<fec<?>, ffx> a;

      private b(Map<fec<?>, ffx> $$0, flq $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fgw.b a(fed $$0, fec<?> $$1, flq $$2) {
         return new fgw.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fgw.b a(fed $$0, fec<?> $$1, @Nullable fec<?> $$2, flq $$3) {
         ffx $$4 = $$1.a($$0);
         return $$2 == null ? new fgw.b(ImmutableMap.of($$1, $$4), $$3) : new fgw.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
