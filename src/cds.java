import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cds {
   private static final cds a = new cds();
   private final List<bun> b;
   private final Predicate<bun> c;

   private cds() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cds(bun $$0, List<bun> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bun> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bun> $$3 = $$1x -> cew.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static cds a() {
      return a;
   }

   public Optional<bun> a(Predicate<bun> $$0) {
      for (bun $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bun> b(Predicate<bun> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bun> c(Predicate<bun> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bun $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bun> $$0) {
      for (bun $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
