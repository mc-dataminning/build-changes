import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fpq extends foz<fpq.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fxp n;

   public fpq(flj $$0, int $$1, fxp $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(flm<?> $$0) {
      this.b(fpq.b.a(this.c.n, $$0, this.n));
   }

   public void a(flm<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         flm<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fpq.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<foq> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(foq $$0, @Nullable foq $$1) {
      this.b(fpq.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public foq b(flm<?> $$0) {
      for (fpq.a $$1 : this.aH_()) {
         if ($$1 instanceof fpq.b $$2) {
            foq $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fpq.a $$0 : this.aH_()) {
         if ($$0 instanceof fpq.b) {
            fpq.b $$1 = (fpq.b)$$0;

            for (foq $$2 : $$1.a.values()) {
               if ($$2 instanceof flm.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fqq> e(double $$0, double $$1) {
      for (fpq.a $$2 : this.aH_()) {
         for (fqq $$3 : $$2.aH_()) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends foz.a<fpq.a> {
      private final List<foq> a;
      private final ful b;
      private static final int c = 160;

      a(List<foq> $$0, ful $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fpq.a a(List<foq> $$0, ful $$1) {
         return new fpq.a($$0, $$1);
      }

      public static fpq.a a(foq $$0, @Nullable foq $$1, ful $$2) {
         return $$1 == null ? new fpq.a(ImmutableList.of($$0), $$2) : new fpq.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (foq $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fqq> aH_() {
         return this.a;
      }

      @Override
      public List<? extends fso> b() {
         return this.a;
      }
   }

   protected static class b extends fpq.a {
      final Map<flm<?>, foq> a;

      private b(Map<flm<?>, foq> $$0, fxp $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fpq.b a(fln $$0, flm<?> $$1, fxp $$2) {
         return new fpq.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fpq.b a(fln $$0, flm<?> $$1, @Nullable flm<?> $$2, fxp $$3) {
         foq $$4 = $$1.a($$0);
         return $$2 == null ? new fpq.b(ImmutableMap.of($$1, $$4), $$3) : new fpq.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
