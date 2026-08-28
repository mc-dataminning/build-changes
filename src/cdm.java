import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class cdm<T extends btl> extends cdw<T> {
   private final BiPredicate<T, btl> a;
   private final Predicate<T> c;
   private final ccq<Boolean> d;
   private final int e;

   public cdm(int $$0, BiPredicate<T, btl> $$1, Predicate<T> $$2, ccq<Boolean> $$3, int $$4) {
      super($$0);
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   protected void a(aqt $$0, T $$1) {
      if (!this.c.test($$1)) {
         this.c($$1);
      } else {
         this.a($$1);
      }
   }

   @Override
   public Set<ccq<?>> a() {
      return Set.of(ccq.g);
   }

   public void a(T $$0) {
      Optional<List<btl>> $$1 = $$0.dU().c(ccq.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$1x -> this.a.test($$0, $$1x));
         if ($$2) {
            this.b($$0);
         }
      }
   }

   public void b(T $$0) {
      $$0.dU().a(this.d, true, (long)this.e);
   }

   public void c(T $$0) {
      $$0.dU().b(this.d);
   }
}
