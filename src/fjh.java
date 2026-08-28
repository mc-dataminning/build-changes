import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fjh extends fiq<fjh.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final frf n;

   public fjh(fgm $$0, int $$1, frf $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fgp<?> $$0) {
      this.b(fjh.b.a(this.c.m, $$0, this.n));
   }

   public void a(fgp<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fgp<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fjh.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fii> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fii $$0, @Nullable fii $$1) {
      this.b(fjh.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fii b(fgp<?> $$0) {
      for (fjh.a $$1 : this.aK_()) {
         if ($$1 instanceof fjh.b $$2) {
            fii $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (fjh.a $$0 : this.aK_()) {
         if ($$0 instanceof fjh.b) {
            fjh.b $$1 = (fjh.b)$$0;

            for (fii $$2 : $$1.a.values()) {
               if ($$2 instanceof fgp.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fkg> e(double $$0, double $$1) {
      for (fjh.a $$2 : this.aK_()) {
         for (fkg $$3 : $$2.aK_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fiq.a<fjh.a> {
      private final List<fii> a;
      private final fob b;
      private static final int c = 160;

      a(List<fii> $$0, fob $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fjh.a a(List<fii> $$0, fob $$1) {
         return new fjh.a($$0, $$1);
      }

      public static fjh.a a(fii $$0, @Nullable fii $$1, fob $$2) {
         return $$1 == null ? new fjh.a(ImmutableList.of($$0), $$2) : new fjh.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.m / 2 - 155;

         for (fii $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fkg> aK_() {
         return this.a;
      }

      @Override
      public List<? extends fme> b() {
         return this.a;
      }
   }

   protected static class b extends fjh.a {
      final Map<fgp<?>, fii> a;

      private b(Map<fgp<?>, fii> $$0, frf $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fjh.b a(fgq $$0, fgp<?> $$1, frf $$2) {
         return new fjh.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fjh.b a(fgq $$0, fgp<?> $$1, @Nullable fgp<?> $$2, frf $$3) {
         fii $$4 = $$1.a($$0);
         return $$2 == null ? new fjh.b(ImmutableMap.of($$1, $$4), $$3) : new fjh.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
