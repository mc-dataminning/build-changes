import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cgy {
   private static final cgy a = new cgy();
   private final List<bxu> b;
   private final Predicate<bxu> c;

   private cgy() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cgy(ars $$0, bxu $$1, List<bxu> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bxu> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bxu> $$4 = $$2x -> cic.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cgy a() {
      return a;
   }

   public Optional<bxu> a(Predicate<bxu> $$0) {
      for (bxu $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bxu> b(Predicate<bxu> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bxu> c(Predicate<bxu> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bxu $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bxu> $$0) {
      for (bxu $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
