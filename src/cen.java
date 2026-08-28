import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cen {
   private static final cen a = new cen();
   private final List<bvh> b;
   private final Predicate<bvh> c;

   private cen() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cen(ard $$0, bvh $$1, List<bvh> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bvh> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bvh> $$4 = $$2x -> cfr.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cen a() {
      return a;
   }

   public Optional<bvh> a(Predicate<bvh> $$0) {
      for (bvh $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bvh> b(Predicate<bvh> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bvh> c(Predicate<bvh> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bvh $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bvh> $$0) {
      for (bvh $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
