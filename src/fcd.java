import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fcd extends fbm<fcd.a> {
   public fcd(ezg $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.e = false;
   }

   public int a(ezj<?> $$0) {
      return this.b(fcd.a.a(this.c.m, this.g, $$0));
   }

   public void a(ezj<?> $$0, @Nullable ezj<?> $$1) {
      this.b(fcd.a.a(this.c.m, this.g, $$0, $$1));
   }

   public void a(ezj<?>[] $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         this.a($$0[$$1], $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null);
      }
   }

   @Override
   public int b() {
      return 400;
   }

   @Override
   protected int c() {
      return super.c() + 32;
   }

   @Nullable
   public fbe b(ezj<?> $$0) {
      for (fcd.a $$1 : this.l()) {
         fbe $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<fbe> e(double $$0, double $$1) {
      for (fcd.a $$2 : this.l()) {
         for (fbe $$3 : $$2.b) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fbm.a<fcd.a> {
      final Map<ezj<?>, fbe> a;
      final List<fbe> b;

      private a(Map<ezj<?>, fbe> $$0) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
      }

      public static fcd.a a(ezk $$0, int $$1, ezj<?> $$2) {
         return new fcd.a(ImmutableMap.of($$2, $$2.a($$0, $$1 / 2 - 155, 0, 310)));
      }

      public static fcd.a a(ezk $$0, int $$1, ezj<?> $$2, @Nullable ezj<?> $$3) {
         fbe $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
         return $$3 == null ? new fcd.a(ImmutableMap.of($$2, $$4)) : new fcd.a(ImmutableMap.of($$2, $$4, $$3, $$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
      }

      @Override
      public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.b.forEach($$5x -> {
            $$5x.n($$2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public List<? extends fdc> l() {
         return this.b;
      }

      @Override
      public List<? extends ffa> a() {
         return this.b;
      }
   }
}
