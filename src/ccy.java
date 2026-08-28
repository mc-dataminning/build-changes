import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ccy<T extends bsy> extends cdi<T> {
   private final BiPredicate<T, bsy> a;
   private final Predicate<T> c;
   private final ccc<Boolean> d;
   private final int e;

   public ccy(int $$0, BiPredicate<T, bsy> $$1, Predicate<T> $$2, ccc<Boolean> $$3, int $$4) {
      super($$0);
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   protected void a(aqk $$0, T $$1) {
      if (!this.c.test($$1)) {
         this.c($$1);
      } else {
         this.a($$1);
      }
   }

   @Override
   public Set<ccc<?>> a() {
      return Set.of(ccc.g);
   }

   public void a(T $$0) {
      Optional<List<bsy>> $$1 = $$0.dT().c(ccc.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$1x -> this.a.test($$0, $$1x));
         if ($$2) {
            this.b($$0);
         }
      }
   }

   public void b(T $$0) {
      $$0.dT().a(this.d, true, (long)this.e);
   }

   public void c(T $$0) {
      $$0.dT().b(this.d);
   }
}
