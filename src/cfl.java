import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cfl {
   private static final cfl a = new cfl();
   private final List<bwf> b;
   private final Predicate<bwf> c;

   private cfl() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cfl(ash $$0, bwf $$1, List<bwf> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bwf> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bwf> $$4 = $$2x -> cgp.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cfl a() {
      return a;
   }

   public Optional<bwf> a(Predicate<bwf> $$0) {
      for (bwf $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bwf> b(Predicate<bwf> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bwf> c(Predicate<bwf> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bwf $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bwf> $$0) {
      for (bwf $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
