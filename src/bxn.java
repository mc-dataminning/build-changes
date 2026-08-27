import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bxn {
   private static final bxn a = new bxn();
   private final List<boi> b;
   private final Predicate<boi> c;

   private bxn() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public bxn(boi $$0, List<boi> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<boi> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<boi> $$3 = $$1x -> byr.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static bxn a() {
      return a;
   }

   public Optional<boi> a(Predicate<boi> $$0) {
      for (boi $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<boi> b(Predicate<boi> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<boi> c(Predicate<boi> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(boi $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<boi> $$0) {
      for (boi $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
