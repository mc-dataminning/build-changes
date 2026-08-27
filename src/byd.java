import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class byd<T extends bog> extends byn<T> {
   private final BiPredicate<T, bog> a;
   private final Predicate<T> c;
   private final bxh<Boolean> d;
   private final int e;

   public byd(int $$0, BiPredicate<T, bog> $$1, Predicate<T> $$2, bxh<Boolean> $$3, int $$4) {
      super($$0);
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   protected void a(aov $$0, T $$1) {
      if (!this.c.test($$1)) {
         this.c($$1);
      } else {
         this.a($$1);
      }
   }

   @Override
   public Set<bxh<?>> a() {
      return Set.of(bxh.g);
   }

   public void a(T $$0) {
      Optional<List<bog>> $$1 = $$0.dO().c(bxh.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$1x -> this.a.test($$0, $$1x));
         if ($$2) {
            this.b($$0);
         }
      }
   }

   public void b(T $$0) {
      $$0.dO().a(this.d, true, (long)this.e);
   }

   public void c(T $$0) {
      $$0.dO().b(this.d);
   }
}
