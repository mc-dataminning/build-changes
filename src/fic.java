import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fic extends fhl<fic.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fmw n;

   public fic(ffg $$0, int $$1, int $$2, fmw $$3) {
      super($$0, $$1, $$3.d.d(), $$3.d.c(), 25);
      this.e = false;
      this.n = $$3;
   }

   public void a(ffj<?> $$0) {
      this.b(fic.b.a(this.c.m, $$0, this.n));
   }

   public void a(ffj<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         ffj<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fic.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fhd> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fhd $$0, @Nullable fhd $$1) {
      this.b(fic.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fhd b(ffj<?> $$0) {
      for (fic.a $$1 : this.aD_()) {
         if ($$1 instanceof fic.b $$2) {
            fhd $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (fic.a $$0 : this.aD_()) {
         if ($$0 instanceof fic.b) {
            fic.b $$1 = (fic.b)$$0;

            for (fhd $$2 : $$1.a.values()) {
               if ($$2 instanceof ffj.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fjb> e(double $$0, double $$1) {
      for (fic.a $$2 : this.aD_()) {
         for (fjb $$3 : $$2.aD_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fhl.a<fic.a> {
      private final List<fhd> a;
      private final fne b;
      private static final int c = 160;

      a(List<fhd> $$0, fne $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fic.a a(List<fhd> $$0, fne $$1) {
         return new fic.a($$0, $$1);
      }

      public static fic.a a(fhd $$0, @Nullable fhd $$1, fne $$2) {
         return $$1 == null ? new fic.a(ImmutableList.of($$0), $$2) : new fic.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fhd $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fjb> aD_() {
         return this.a;
      }

      @Override
      public List<? extends fkz> b() {
         return this.a;
      }
   }

   protected static class b extends fic.a {
      final Map<ffj<?>, fhd> a;

      private b(Map<ffj<?>, fhd> $$0, fmw $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fic.b a(ffk $$0, ffj<?> $$1, fmw $$2) {
         return new fic.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fic.b a(ffk $$0, ffj<?> $$1, @Nullable ffj<?> $$2, fmw $$3) {
         fhd $$4 = $$1.a($$0);
         return $$2 == null ? new fic.b(ImmutableMap.of($$1, $$4), $$3) : new fic.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
