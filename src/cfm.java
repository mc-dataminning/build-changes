import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cfm {
   private static final cfm a = new cfm();
   private final List<bwg> b;
   private final Predicate<bwg> c;

   private cfm() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cfm(ash $$0, bwg $$1, List<bwg> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bwg> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bwg> $$4 = $$2x -> cgq.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cfm a() {
      return a;
   }

   public Optional<bwg> a(Predicate<bwg> $$0) {
      for (bwg $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bwg> b(Predicate<bwg> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bwg> c(Predicate<bwg> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bwg $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bwg> $$0) {
      for (bwg $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
