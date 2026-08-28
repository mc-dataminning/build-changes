import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class cgf<T extends bwf> extends cgp<T> {
   private final BiPredicate<T, bwf> a;
   private final Predicate<T> b;
   private final cfj<Boolean> c;
   private final int d;

   public cgf(int $$0, BiPredicate<T, bwf> $$1, Predicate<T> $$2, cfj<Boolean> $$3, int $$4) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   @Override
   protected void a(ash $$0, T $$1) {
      if (!this.b.test($$1)) {
         this.c($$1);
      } else {
         this.a($$1);
      }
   }

   @Override
   public Set<cfj<?>> a() {
      return Set.of(cfj.g);
   }

   @Override
   public void a(T $$0) {
      Optional<List<bwf>> $$1 = $$0.ec().c(cfj.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$1x -> this.a.test($$0, $$1x));
         if ($$2) {
            this.b($$0);
         }
      }
   }

   public void b(T $$0) {
      $$0.ec().a(this.c, true, (long)this.d);
   }

   public void c(T $$0) {
      $$0.ec().b(this.c);
   }
}
