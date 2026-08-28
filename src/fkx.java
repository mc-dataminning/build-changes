import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fkx extends fkg<fkx.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fsw n;

   public fkx(fib $$0, int $$1, fsw $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fie<?> $$0) {
      this.b(fkx.b.a(this.c.n, $$0, this.n));
   }

   public void a(fie<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fie<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fkx.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fjy> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fjy $$0, @Nullable fjy $$1) {
      this.b(fkx.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fjy b(fie<?> $$0) {
      for (fkx.a $$1 : this.aK_()) {
         if ($$1 instanceof fkx.b $$2) {
            fjy $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (fkx.a $$0 : this.aK_()) {
         if ($$0 instanceof fkx.b) {
            fkx.b $$1 = (fkx.b)$$0;

            for (fjy $$2 : $$1.a.values()) {
               if ($$2 instanceof fie.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<flx> e(double $$0, double $$1) {
      for (fkx.a $$2 : this.aK_()) {
         for (flx $$3 : $$2.aK_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fkg.a<fkx.a> {
      private final List<fjy> a;
      private final fpt b;
      private static final int c = 160;

      a(List<fjy> $$0, fpt $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fkx.a a(List<fjy> $$0, fpt $$1) {
         return new fkx.a($$0, $$1);
      }

      public static fkx.a a(fjy $$0, @Nullable fjy $$1, fpt $$2) {
         return $$1 == null ? new fkx.a(ImmutableList.of($$0), $$2) : new fkx.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fjy $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends flx> aK_() {
         return this.a;
      }

      @Override
      public List<? extends fnv> b() {
         return this.a;
      }
   }

   protected static class b extends fkx.a {
      final Map<fie<?>, fjy> a;

      private b(Map<fie<?>, fjy> $$0, fsw $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fkx.b a(fif $$0, fie<?> $$1, fsw $$2) {
         return new fkx.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fkx.b a(fif $$0, fie<?> $$1, @Nullable fie<?> $$2, fsw $$3) {
         fjy $$4 = $$1.a($$0);
         return $$2 == null ? new fkx.b(ImmutableMap.of($$1, $$4), $$3) : new fkx.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
