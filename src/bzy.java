import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bzy {
   private static final bzy a = new bzy();
   private final List<bqt> b;
   private final Predicate<bqt> c;

   private bzy() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public bzy(bqt $$0, List<bqt> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bqt> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bqt> $$3 = $$1x -> cbc.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static bzy a() {
      return a;
   }

   public Optional<bqt> a(Predicate<bqt> $$0) {
      for (bqt $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bqt> b(Predicate<bqt> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bqt> c(Predicate<bqt> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bqt $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bqt> $$0) {
      for (bqt $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
