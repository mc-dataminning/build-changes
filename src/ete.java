import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ete extends esn<ete.a> {
   public ete(eqm $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.k = false;
   }

   public int a(eqp<?> $$0) {
      return this.b(ete.a.a(this.c.m, this.e, $$0));
   }

   public void a(eqp<?> $$0, @Nullable eqp<?> $$1) {
      this.b(ete.a.a(this.c.m, this.e, $$0, $$1));
   }

   public void a(eqp<?>[] $$0) {
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
   public esf b(eqp<?> $$0) {
      for (ete.a $$1 : this.i()) {
         esf $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<esf> c(double $$0, double $$1) {
      for (ete.a $$2 : this.i()) {
         for (esf $$3 : $$2.b) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends esn.a<ete.a> {
      final Map<eqp<?>, esf> a;
      final List<esf> b;

      private a(Map<eqp<?>, esf> $$0) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
      }

      public static ete.a a(eqq $$0, int $$1, eqp<?> $$2) {
         return new ete.a(ImmutableMap.of($$2, $$2.a($$0, $$1 / 2 - 155, 0, 310)));
      }

      public static ete.a a(eqq $$0, int $$1, eqp<?> $$2, @Nullable eqp<?> $$3) {
         esf $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
         return $$3 == null ? new ete.a(ImmutableMap.of($$2, $$4)) : new ete.a(ImmutableMap.of($$2, $$4, $$3, $$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.b.forEach($$5x -> {
            $$5x.f($$2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public List<? extends eua> i() {
         return this.b;
      }

      @Override
      public List<? extends evv> b() {
         return this.b;
      }
   }
}
