import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class cdq<T extends btq> extends cea<T> {
   private final BiPredicate<T, btq> a;
   private final Predicate<T> c;
   private final ccu<Boolean> d;
   private final int e;

   public cdq(int $$0, BiPredicate<T, btq> $$1, Predicate<T> $$2, ccu<Boolean> $$3, int $$4) {
      super($$0);
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   protected void a(arf $$0, T $$1) {
      if (!this.c.test($$1)) {
         this.c($$1);
      } else {
         this.a($$1);
      }
   }

   @Override
   public Set<ccu<?>> a() {
      return Set.of(ccu.g);
   }

   public void a(T $$0) {
      Optional<List<btq>> $$1 = $$0.dS().c(ccu.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$1x -> this.a.test($$0, $$1x));
         if ($$2) {
            this.b($$0);
         }
      }
   }

   public void b(T $$0) {
      $$0.dS().a(this.d, true, (long)this.e);
   }

   public void c(T $$0) {
      $$0.dS().b(this.d);
   }
}
