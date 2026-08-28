import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class cdb<T extends btb> extends cdl<T> {
   private final BiPredicate<T, btb> a;
   private final Predicate<T> c;
   private final ccf<Boolean> d;
   private final int e;

   public cdb(int $$0, BiPredicate<T, btb> $$1, Predicate<T> $$2, ccf<Boolean> $$3, int $$4) {
      super($$0);
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   protected void a(aqm $$0, T $$1) {
      if (!this.c.test($$1)) {
         this.c($$1);
      } else {
         this.a($$1);
      }
   }

   @Override
   public Set<ccf<?>> a() {
      return Set.of(ccf.g);
   }

   public void a(T $$0) {
      Optional<List<btb>> $$1 = $$0.dU().c(ccf.g);
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
