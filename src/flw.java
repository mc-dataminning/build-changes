import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class flw extends flf<flw.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final ftv n;

   public flw(fja $$0, int $$1, ftv $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fjd<?> $$0) {
      this.b(flw.b.a(this.c.n, $$0, this.n));
   }

   public void a(fjd<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fjd<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(flw.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fkx> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fkx $$0, @Nullable fkx $$1) {
      this.b(flw.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fkx b(fjd<?> $$0) {
      for (flw.a $$1 : this.aJ_()) {
         if ($$1 instanceof flw.b $$2) {
            fkx $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (flw.a $$0 : this.aJ_()) {
         if ($$0 instanceof flw.b) {
            flw.b $$1 = (flw.b)$$0;

            for (fkx $$2 : $$1.a.values()) {
               if ($$2 instanceof fjd.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fmw> e(double $$0, double $$1) {
      for (flw.a $$2 : this.aJ_()) {
         for (fmw $$3 : $$2.aJ_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends flf.a<flw.a> {
      private final List<fkx> a;
      private final fqs b;
      private static final int c = 160;

      a(List<fkx> $$0, fqs $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static flw.a a(List<fkx> $$0, fqs $$1) {
         return new flw.a($$0, $$1);
      }

      public static flw.a a(fkx $$0, @Nullable fkx $$1, fqs $$2) {
         return $$1 == null ? new flw.a(ImmutableList.of($$0), $$2) : new flw.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fkx $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fmw> aJ_() {
         return this.a;
      }

      @Override
      public List<? extends fov> b() {
         return this.a;
      }
   }

   protected static class b extends flw.a {
      final Map<fjd<?>, fkx> a;

      private b(Map<fjd<?>, fkx> $$0, ftv $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static flw.b a(fje $$0, fjd<?> $$1, ftv $$2) {
         return new flw.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static flw.b a(fje $$0, fjd<?> $$1, @Nullable fjd<?> $$2, ftv $$3) {
         fkx $$4 = $$1.a($$0);
         return $$2 == null ? new flw.b(ImmutableMap.of($$1, $$4), $$3) : new flw.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
