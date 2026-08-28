import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cel {
   private static final cel a = new cel();
   private final List<bvf> b;
   private final Predicate<bvf> c;

   private cel() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cel(arc $$0, bvf $$1, List<bvf> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bvf> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bvf> $$4 = $$2x -> cfp.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cel a() {
      return a;
   }

   public Optional<bvf> a(Predicate<bvf> $$0) {
      for (bvf $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bvf> b(Predicate<bvf> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bvf> c(Predicate<bvf> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bvf $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bvf> $$0) {
      for (bvf $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
