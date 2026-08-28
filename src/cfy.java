import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class cfy<T extends bvy> extends cgi<T> {
   private final BiPredicate<T, bvy> a;
   private final Predicate<T> b;
   private final cfc<Boolean> c;
   private final int d;

   public cfy(int $$0, BiPredicate<T, bvy> $$1, Predicate<T> $$2, cfc<Boolean> $$3, int $$4) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   @Override
   protected void a(ard $$0, T $$1) {
      if (!this.b.test($$1)) {
         this.c($$1);
      } else {
         this.a($$1);
      }
   }

   @Override
   public Set<cfc<?>> a() {
      return Set.of(cfc.g);
   }

   @Override
   public void a(T $$0) {
      Optional<List<bvy>> $$1 = $$0.ea().c(cfc.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$1x -> this.a.test($$0, $$1x));
         if ($$2) {
            this.b($$0);
         }
      }
   }

   public void b(T $$0) {
      $$0.ea().a(this.c, true, (long)this.d);
   }

   public void c(T $$0) {
      $$0.ea().b(this.c);
   }
}
