import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cbf {
   private static final cbf a = new cbf();
   private final List<bsa> b;
   private final Predicate<bsa> c;

   private cbf() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cbf(bsa $$0, List<bsa> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bsa> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bsa> $$3 = $$1x -> ccj.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static cbf a() {
      return a;
   }

   public Optional<bsa> a(Predicate<bsa> $$0) {
      for (bsa $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bsa> b(Predicate<bsa> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bsa> c(Predicate<bsa> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bsa $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bsa> $$0) {
      for (bsa $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
