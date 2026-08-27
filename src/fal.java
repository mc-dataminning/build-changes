import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fal extends ezu<fal.a> {
   public fal(exo $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.e = false;
   }

   public int a(exr<?> $$0) {
      return this.b(fal.a.a(this.c.m, this.g, $$0));
   }

   public void a(exr<?> $$0, @Nullable exr<?> $$1) {
      this.b(fal.a.a(this.c.m, this.g, $$0, $$1));
   }

   public void a(exr<?>[] $$0) {
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
   public ezm b(exr<?> $$0) {
      for (fal.a $$1 : this.l()) {
         ezm $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<ezm> e(double $$0, double $$1) {
      for (fal.a $$2 : this.l()) {
         for (ezm $$3 : $$2.b) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends ezu.a<fal.a> {
      final Map<exr<?>, ezm> a;
      final List<ezm> b;

      private a(Map<exr<?>, ezm> $$0) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
      }

      public static fal.a a(exs $$0, int $$1, exr<?> $$2) {
         return new fal.a(ImmutableMap.of($$2, $$2.a($$0, $$1 / 2 - 155, 0, 310)));
      }

      public static fal.a a(exs $$0, int $$1, exr<?> $$2, @Nullable exr<?> $$3) {
         ezm $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
         return $$3 == null ? new fal.a(ImmutableMap.of($$2, $$4)) : new fal.a(ImmutableMap.of($$2, $$4, $$3, $$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
      }

      @Override
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.b.forEach($$5x -> {
            $$5x.n($$2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public List<? extends fbk> l() {
         return this.b;
      }

      @Override
      public List<? extends fdh> a() {
         return this.b;
      }
   }
}
