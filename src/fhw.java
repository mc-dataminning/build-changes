import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fhw extends fhf<fhw.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fmq n;

   public fhw(ffa $$0, int $$1, int $$2, fmq $$3) {
      super($$0, $$1, $$3.d.d(), $$3.d.c(), 25);
      this.e = false;
      this.n = $$3;
   }

   public void a(ffd<?> $$0) {
      this.b(fhw.b.a(this.c.m, $$0, this.n));
   }

   public void a(ffd<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         ffd<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fhw.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fgx> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fgx $$0, @Nullable fgx $$1) {
      this.b(fhw.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fgx b(ffd<?> $$0) {
      for (fhw.a $$1 : this.aF_()) {
         if ($$1 instanceof fhw.b $$2) {
            fgx $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public Optional<fiv> e(double $$0, double $$1) {
      for (fhw.a $$2 : this.aF_()) {
         for (fiv $$3 : $$2.aF_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fhf.a<fhw.a> {
      private final List<fgx> a;
      private final fmy b;
      private static final int c = 160;

      a(List<fgx> $$0, fmy $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fhw.a a(List<fgx> $$0, fmy $$1) {
         return new fhw.a($$0, $$1);
      }

      public static fhw.a a(fgx $$0, @Nullable fgx $$1, fmy $$2) {
         return $$1 == null ? new fhw.a(ImmutableList.of($$0), $$2) : new fhw.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fgx $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fiv> aF_() {
         return this.a;
      }

      @Override
      public List<? extends fkt> b() {
         return this.a;
      }
   }

   protected static class b extends fhw.a {
      final Map<ffd<?>, fgx> a;

      private b(Map<ffd<?>, fgx> $$0, fmq $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fhw.b a(ffe $$0, ffd<?> $$1, fmq $$2) {
         return new fhw.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fhw.b a(ffe $$0, ffd<?> $$1, @Nullable ffd<?> $$2, fmq $$3) {
         fgx $$4 = $$1.a($$0);
         return $$2 == null ? new fhw.b(ImmutableMap.of($$1, $$4), $$3) : new fhw.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
