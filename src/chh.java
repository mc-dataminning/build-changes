import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class chh<T extends bxj> extends chr<T> {
   private final BiPredicate<T, bxj> a;
   private final Predicate<T> b;
   private final cgl<Boolean> c;
   private final int d;

   public chh(int $$0, BiPredicate<T, bxj> $$1, Predicate<T> $$2, cgl<Boolean> $$3, int $$4) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   @Override
   protected void a(arq $$0, T $$1) {
      if (!this.b.test($$1)) {
         this.c($$1);
      } else {
         this.a($$1);
      }
   }

   @Override
   public Set<cgl<?>> a() {
      return Set.of(cgl.g);
   }

   @Override
   public void a(T $$0) {
      Optional<List<bxj>> $$1 = $$0.eb().c(cgl.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$1x -> this.a.test($$0, $$1x));
         if ($$2) {
            this.b($$0);
         }
      }
   }

   public void b(T $$0) {
      $$0.eb().a(this.c, true, (long)this.d);
   }

   public void c(T $$0) {
      $$0.eb().b(this.c);
   }
}
