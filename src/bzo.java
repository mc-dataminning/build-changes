import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class bzo<T extends bpp> extends bzy<T> {
   private final BiPredicate<T, bpp> a;
   private final Predicate<T> c;
   private final bys<Boolean> d;
   private final int e;

   public bzo(int $$0, BiPredicate<T, bpp> $$1, Predicate<T> $$2, bys<Boolean> $$3, int $$4) {
      super($$0);
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   protected void a(apf $$0, T $$1) {
      if (!this.c.test($$1)) {
         this.c($$1);
      } else {
         this.a($$1);
      }
   }

   @Override
   public Set<bys<?>> a() {
      return Set.of(bys.g);
   }

   public void a(T $$0) {
      Optional<List<bpp>> $$1 = $$0.dP().c(bys.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$1x -> this.a.test($$0, $$1x));
         if ($$2) {
            this.b($$0);
         }
      }
   }

   public void b(T $$0) {
      $$0.dP().a(this.d, true, (long)this.e);
   }

   public void c(T $$0) {
      $$0.dP().b(this.d);
   }
}
