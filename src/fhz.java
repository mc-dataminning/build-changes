import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fhz extends fhi<fhz.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fmt n;

   public fhz(ffd $$0, int $$1, int $$2, fmt $$3) {
      super($$0, $$1, $$3.d.d(), $$3.d.c(), 25);
      this.e = false;
      this.n = $$3;
   }

   public void a(ffg<?> $$0) {
      this.b(fhz.b.a(this.c.m, $$0, this.n));
   }

   public void a(ffg<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         ffg<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fhz.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fha> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fha $$0, @Nullable fha $$1) {
      this.b(fhz.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fha b(ffg<?> $$0) {
      for (fhz.a $$1 : this.aE_()) {
         if ($$1 instanceof fhz.b $$2) {
            fha $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public Optional<fiy> e(double $$0, double $$1) {
      for (fhz.a $$2 : this.aE_()) {
         for (fiy $$3 : $$2.aE_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fhi.a<fhz.a> {
      private final List<fha> a;
      private final fnb b;
      private static final int c = 160;

      a(List<fha> $$0, fnb $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fhz.a a(List<fha> $$0, fnb $$1) {
         return new fhz.a($$0, $$1);
      }

      public static fhz.a a(fha $$0, @Nullable fha $$1, fnb $$2) {
         return $$1 == null ? new fhz.a(ImmutableList.of($$0), $$2) : new fhz.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fha $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fiy> aE_() {
         return this.a;
      }

      @Override
      public List<? extends fkw> b() {
         return this.a;
      }
   }

   protected static class b extends fhz.a {
      final Map<ffg<?>, fha> a;

      private b(Map<ffg<?>, fha> $$0, fmt $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fhz.b a(ffh $$0, ffg<?> $$1, fmt $$2) {
         return new fhz.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fhz.b a(ffh $$0, ffg<?> $$1, @Nullable ffg<?> $$2, fmt $$3) {
         fha $$4 = $$1.a($$0);
         return $$2 == null ? new fhz.b(ImmutableMap.of($$1, $$4), $$3) : new fhz.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
