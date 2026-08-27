import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fcf extends fbo<fcf.a> {
   public fcf(ezi $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.e = false;
   }

   public int a(ezl<?> $$0) {
      return this.b(fcf.a.a(this.c.m, this.g, $$0));
   }

   public void a(ezl<?> $$0, @Nullable ezl<?> $$1) {
      this.b(fcf.a.a(this.c.m, this.g, $$0, $$1));
   }

   public void a(ezl<?>[] $$0) {
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
   public fbg b(ezl<?> $$0) {
      for (fcf.a $$1 : this.l()) {
         fbg $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<fbg> e(double $$0, double $$1) {
      for (fcf.a $$2 : this.l()) {
         for (fbg $$3 : $$2.b) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fbo.a<fcf.a> {
      final Map<ezl<?>, fbg> a;
      final List<fbg> b;

      private a(Map<ezl<?>, fbg> $$0) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
      }

      public static fcf.a a(ezm $$0, int $$1, ezl<?> $$2) {
         return new fcf.a(ImmutableMap.of($$2, $$2.a($$0, $$1 / 2 - 155, 0, 310)));
      }

      public static fcf.a a(ezm $$0, int $$1, ezl<?> $$2, @Nullable ezl<?> $$3) {
         fbg $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
         return $$3 == null ? new fcf.a(ImmutableMap.of($$2, $$4)) : new fcf.a(ImmutableMap.of($$2, $$4, $$3, $$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
      }

      @Override
      public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.b.forEach($$5x -> {
            $$5x.n($$2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public List<? extends fde> l() {
         return this.b;
      }

      @Override
      public List<? extends ffc> a() {
         return this.b;
      }
   }
}
