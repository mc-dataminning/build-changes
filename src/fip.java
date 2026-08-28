import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fip extends fhy<fip.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fql n;

   public fip(fft $$0, int $$1, fql $$2) {
      super($$0, $$1, $$2.r.d(), $$2.r.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(ffw<?> $$0) {
      this.b(fip.b.a(this.c.m, $$0, this.n));
   }

   public void a(ffw<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         ffw<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fip.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fhq> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fhq $$0, @Nullable fhq $$1) {
      this.b(fip.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fhq b(ffw<?> $$0) {
      for (fip.a $$1 : this.aG_()) {
         if ($$1 instanceof fip.b $$2) {
            fhq $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (fip.a $$0 : this.aG_()) {
         if ($$0 instanceof fip.b) {
            fip.b $$1 = (fip.b)$$0;

            for (fhq $$2 : $$1.a.values()) {
               if ($$2 instanceof ffw.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fjo> e(double $$0, double $$1) {
      for (fip.a $$2 : this.aG_()) {
         for (fjo $$3 : $$2.aG_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fhy.a<fip.a> {
      private final List<fhq> a;
      private final fnj b;
      private static final int c = 160;

      a(List<fhq> $$0, fnj $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fip.a a(List<fhq> $$0, fnj $$1) {
         return new fip.a($$0, $$1);
      }

      public static fip.a a(fhq $$0, @Nullable fhq $$1, fnj $$2) {
         return $$1 == null ? new fip.a(ImmutableList.of($$0), $$2) : new fip.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.m / 2 - 155;

         for (fhq $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fjo> aG_() {
         return this.a;
      }

      @Override
      public List<? extends flm> b() {
         return this.a;
      }
   }

   protected static class b extends fip.a {
      final Map<ffw<?>, fhq> a;

      private b(Map<ffw<?>, fhq> $$0, fql $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fip.b a(ffx $$0, ffw<?> $$1, fql $$2) {
         return new fip.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fip.b a(ffx $$0, ffw<?> $$1, @Nullable ffw<?> $$2, fql $$3) {
         fhq $$4 = $$1.a($$0);
         return $$2 == null ? new fip.b(ImmutableMap.of($$1, $$4), $$3) : new fip.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
