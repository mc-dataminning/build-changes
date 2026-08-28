import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fid extends fhm<fid.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fmx n;

   public fid(ffh $$0, int $$1, int $$2, fmx $$3) {
      super($$0, $$1, $$3.d.d(), $$3.d.c(), 25);
      this.e = false;
      this.n = $$3;
   }

   public void a(ffk<?> $$0) {
      this.b(fid.b.a(this.c.m, $$0, this.n));
   }

   public void a(ffk<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         ffk<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fid.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fhe> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fhe $$0, @Nullable fhe $$1) {
      this.b(fid.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fhe b(ffk<?> $$0) {
      for (fid.a $$1 : this.aD_()) {
         if ($$1 instanceof fid.b $$2) {
            fhe $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (fid.a $$0 : this.aD_()) {
         if ($$0 instanceof fid.b) {
            fid.b $$1 = (fid.b)$$0;

            for (fhe $$2 : $$1.a.values()) {
               if ($$2 instanceof ffk.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fjc> e(double $$0, double $$1) {
      for (fid.a $$2 : this.aD_()) {
         for (fjc $$3 : $$2.aD_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fhm.a<fid.a> {
      private final List<fhe> a;
      private final fnf b;
      private static final int c = 160;

      a(List<fhe> $$0, fnf $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fid.a a(List<fhe> $$0, fnf $$1) {
         return new fid.a($$0, $$1);
      }

      public static fid.a a(fhe $$0, @Nullable fhe $$1, fnf $$2) {
         return $$1 == null ? new fid.a(ImmutableList.of($$0), $$2) : new fid.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fhe $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fjc> aD_() {
         return this.a;
      }

      @Override
      public List<? extends fla> b() {
         return this.a;
      }
   }

   protected static class b extends fid.a {
      final Map<ffk<?>, fhe> a;

      private b(Map<ffk<?>, fhe> $$0, fmx $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fid.b a(ffl $$0, ffk<?> $$1, fmx $$2) {
         return new fid.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fid.b a(ffl $$0, ffk<?> $$1, @Nullable ffk<?> $$2, fmx $$3) {
         fhe $$4 = $$1.a($$0);
         return $$2 == null ? new fid.b(ImmutableMap.of($$1, $$4), $$3) : new fid.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
