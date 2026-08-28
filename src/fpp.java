import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fpp extends foy<fpp.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fxo n;

   public fpp(flj $$0, int $$1, fxo $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(flm<?> $$0) {
      this.b(fpp.b.a(this.c.n, $$0, this.n));
   }

   public void a(flm<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         flm<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fpp.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fop> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fop $$0, @Nullable fop $$1) {
      this.b(fpp.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public fop b(flm<?> $$0) {
      for (fpp.a $$1 : this.aH_()) {
         if ($$1 instanceof fpp.b $$2) {
            fop $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fpp.a $$0 : this.aH_()) {
         if ($$0 instanceof fpp.b) {
            fpp.b $$1 = (fpp.b)$$0;

            for (fop $$2 : $$1.a.values()) {
               if ($$2 instanceof flm.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fqp> e(double $$0, double $$1) {
      for (fpp.a $$2 : this.aH_()) {
         for (fqp $$3 : $$2.aH_()) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends foy.a<fpp.a> {
      private final List<fop> a;
      private final fuk b;
      private static final int c = 160;

      a(List<fop> $$0, fuk $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fpp.a a(List<fop> $$0, fuk $$1) {
         return new fpp.a($$0, $$1);
      }

      public static fpp.a a(fop $$0, @Nullable fop $$1, fuk $$2) {
         return $$1 == null ? new fpp.a(ImmutableList.of($$0), $$2) : new fpp.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fop $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fqp> aH_() {
         return this.a;
      }

      @Override
      public List<? extends fsn> b() {
         return this.a;
      }
   }

   protected static class b extends fpp.a {
      final Map<flm<?>, fop> a;

      private b(Map<flm<?>, fop> $$0, fxo $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fpp.b a(fln $$0, flm<?> $$1, fxo $$2) {
         return new fpp.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fpp.b a(fln $$0, flm<?> $$1, @Nullable flm<?> $$2, fxo $$3) {
         fop $$4 = $$1.a($$0);
         return $$2 == null ? new fpp.b(ImmutableMap.of($$1, $$4), $$3) : new fpp.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
