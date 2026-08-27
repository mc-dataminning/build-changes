import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bvs {
   private static final bvs a = new bvs();
   private final List<bmo> b;
   private final Predicate<bmo> c;

   private bvs() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public bvs(bmo $$0, List<bmo> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bmo> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bmo> $$3 = $$1x -> bww.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static bvs a() {
      return a;
   }

   public Optional<bmo> a(Predicate<bmo> $$0) {
      for (bmo $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bmo> b(Predicate<bmo> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bmo> c(Predicate<bmo> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bmo $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bmo> $$0) {
      for (bmo $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
