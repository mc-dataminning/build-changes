import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class etf extends eso<etf.a> {
   public etf(eqn $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public int a(eqq<?> $$0) {
      return this.b(etf.a.a(this.b.m, this.d, $$0));
   }

   public void a(eqq<?> $$0, @Nullable eqq<?> $$1) {
      this.b(etf.a.a(this.b.m, this.d, $$0, $$1));
   }

   public void a(eqq<?>[] $$0) {
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
   public esg b(eqq<?> $$0) {
      for (etf.a $$1 : this.i()) {
         esg $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<esg> c(double $$0, double $$1) {
      for (etf.a $$2 : this.i()) {
         for (esg $$3 : $$2.b) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends eso.a<etf.a> {
      final Map<eqq<?>, esg> a;
      final List<esg> b;

      private a(Map<eqq<?>, esg> $$0) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
      }

      public static etf.a a(eqr $$0, int $$1, eqq<?> $$2) {
         return new etf.a(ImmutableMap.of($$2, $$2.a($$0, $$1 / 2 - 155, 0, 310)));
      }

      public static etf.a a(eqr $$0, int $$1, eqq<?> $$2, @Nullable eqq<?> $$3) {
         esg $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
         return $$3 == null ? new etf.a(ImmutableMap.of($$2, $$4)) : new etf.a(ImmutableMap.of($$2, $$4, $$3, $$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.b.forEach($$5x -> {
            $$5x.f($$2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public List<? extends etw> i() {
         return this.b;
      }

      @Override
      public List<? extends evr> b() {
         return this.b;
      }
   }
}
