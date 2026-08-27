import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ccq<T extends bsq> extends cda<T> {
   private final BiPredicate<T, bsq> a;
   private final Predicate<T> c;
   private final cbu<Boolean> d;
   private final int e;

   public ccq(int $$0, BiPredicate<T, bsq> $$1, Predicate<T> $$2, cbu<Boolean> $$3, int $$4) {
      super($$0);
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   protected void a(aqn $$0, T $$1) {
      if (!this.c.test($$1)) {
         this.c($$1);
      } else {
         this.a($$1);
      }
   }

   @Override
   public Set<cbu<?>> a() {
      return Set.of(cbu.g);
   }

   public void a(T $$0) {
      Optional<List<bsq>> $$1 = $$0.dS().c(cbu.g);
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
