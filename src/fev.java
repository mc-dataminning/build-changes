import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fev extends fee<fev.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fjp n;

   public fev(fby $$0, int $$1, int $$2, fjp $$3) {
      super($$0, $$1, $$3.d.d(), $$3.d.c(), 25);
      this.e = false;
      this.n = $$3;
   }

   public void a(fcb<?> $$0) {
      this.b(fev.a.a(this.c.m, $$0, this.n));
   }

   public void a(fcb<?> $$0, @Nullable fcb<?> $$1) {
      this.b(fev.a.a(this.c.m, $$0, $$1, this.n));
   }

   public void a(fcb<?>[] $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         this.a($$0[$$1], $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null);
      }
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fdw b(fcb<?> $$0) {
      for (fev.a $$1 : this.aE_()) {
         fdw $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<fdw> e(double $$0, double $$1) {
      for (fev.a $$2 : this.aE_()) {
         for (fdw $$3 : $$2.b) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fee.a<fev.a> {
      final Map<fcb<?>, fdw> a;
      final List<fdw> b;
      private static final int c = 160;
      private final fjp d;

      private a(Map<fcb<?>, fdw> $$0, fjp $$1) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
         this.d = $$1;
      }

      public static fev.a a(fcc $$0, fcb<?> $$1, fjp $$2) {
         return new fev.a(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fev.a a(fcc $$0, fcb<?> $$1, @Nullable fcb<?> $$2, fjp $$3) {
         fdw $$4 = $$1.a($$0);
         return $$2 == null ? new fev.a(ImmutableMap.of($$1, $$4), $$3) : new fev.a(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.d.k / 2 - 155;

         for (fdw $$12 : this.b) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends ffu> aE_() {
         return this.b;
      }

      @Override
      public List<? extends fhs> b() {
         return this.b;
      }
   }
}
