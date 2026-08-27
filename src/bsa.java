import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bsa {
   private static final bsa a = new bsa();
   private final List<biw> b;
   private final Predicate<biw> c;

   private bsa() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public bsa(biw $$0, List<biw> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<biw> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<biw> $$3 = $$1x -> btc.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static bsa a() {
      return a;
   }

   public Optional<biw> a(Predicate<biw> $$0) {
      for (biw $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<biw> b(Predicate<biw> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<biw> c(Predicate<biw> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(biw $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<biw> $$0) {
      for (biw $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
