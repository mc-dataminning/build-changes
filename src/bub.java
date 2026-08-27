import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bub {
   private static final bub a = new bub();
   private final List<bky> b;
   private final Predicate<bky> c;

   private bub() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public bub(bky $$0, List<bky> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bky> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bky> $$3 = $$1x -> bvd.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static bub a() {
      return a;
   }

   public Optional<bky> a(Predicate<bky> $$0) {
      for (bky $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bky> b(Predicate<bky> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bky> c(Predicate<bky> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bky $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bky> $$0) {
      for (bky $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
