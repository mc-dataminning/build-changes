import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ceo {
   private static final ceo a = new ceo();
   private final List<bvi> b;
   private final Predicate<bvi> c;

   private ceo() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public ceo(ard $$0, bvi $$1, List<bvi> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bvi> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bvi> $$4 = $$2x -> cfs.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static ceo a() {
      return a;
   }

   public Optional<bvi> a(Predicate<bvi> $$0) {
      for (bvi $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bvi> b(Predicate<bvi> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bvi> c(Predicate<bvi> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bvi $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bvi> $$0) {
      for (bvi $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
