import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cgd {
   private static final cgd a = new cgd();
   private final List<bwz> b;
   private final Predicate<bwz> c;

   private cgd() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cgd(aro $$0, bwz $$1, List<bwz> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bwz> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bwz> $$4 = $$2x -> chh.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cgd a() {
      return a;
   }

   public Optional<bwz> a(Predicate<bwz> $$0) {
      for (bwz $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bwz> b(Predicate<bwz> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bwz> c(Predicate<bwz> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bwz $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bwz> $$0) {
      for (bwz $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
