import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cem {
   private static final cem a = new cem();
   private final List<bvg> b;
   private final Predicate<bvg> c;

   private cem() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cem(ard $$0, bvg $$1, List<bvg> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bvg> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bvg> $$4 = $$2x -> cfq.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cem a() {
      return a;
   }

   public Optional<bvg> a(Predicate<bvg> $$0) {
      for (bvg $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bvg> b(Predicate<bvg> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bvg> c(Predicate<bvg> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bvg $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bvg> $$0) {
      for (bvg $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
