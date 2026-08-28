import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fow extends foe<fow.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fwv n;

   public fow(flz $$0, int $$1, fwv $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fmc<?> $$0) {
      this.b(fow.b.a(this.c.n, $$0, this.n));
   }

   public void a(fmc<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fmc<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fow.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fnw> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fnw $$0, @Nullable fnw $$1) {
      this.b(fow.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public fnw b(fmc<?> $$0) {
      for (fow.a $$1 : this.aI_()) {
         if ($$1 instanceof fow.b $$2) {
            fnw $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fow.a $$0 : this.aI_()) {
         if ($$0 instanceof fow.b) {
            fow.b $$1 = (fow.b)$$0;

            for (fnw $$2 : $$1.a.values()) {
               if ($$2 instanceof fmc.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fpw> e(double $$0, double $$1) {
      for (fow.a $$2 : this.aI_()) {
         for (fpw $$3 : $$2.aI_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends foe.a<fow.a> {
      private final List<fnw> a;
      private final ftr b;
      private static final int c = 160;

      a(List<fnw> $$0, ftr $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fow.a a(List<fnw> $$0, ftr $$1) {
         return new fow.a($$0, $$1);
      }

      public static fow.a a(fnw $$0, @Nullable fnw $$1, ftr $$2) {
         return $$1 == null ? new fow.a(ImmutableList.of($$0), $$2) : new fow.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fnw $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fpw> aI_() {
         return this.a;
      }

      @Override
      public List<? extends fru> b() {
         return this.a;
      }
   }

   protected static class b extends fow.a {
      final Map<fmc<?>, fnw> a;

      private b(Map<fmc<?>, fnw> $$0, fwv $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fow.b a(fmd $$0, fmc<?> $$1, fwv $$2) {
         return new fow.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fow.b a(fmd $$0, fmc<?> $$1, @Nullable fmc<?> $$2, fwv $$3) {
         fnw $$4 = $$1.a($$0);
         return $$2 == null ? new fow.b(ImmutableMap.of($$1, $$4), $$3) : new fow.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
