import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bvp {
   private static final bvp a = new bvp();
   private final List<bml> b;
   private final Predicate<bml> c;

   private bvp() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public bvp(bml $$0, List<bml> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bml> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bml> $$3 = $$1x -> bws.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static bvp a() {
      return a;
   }

   public Optional<bml> a(Predicate<bml> $$0) {
      for (bml $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bml> b(Predicate<bml> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bml> c(Predicate<bml> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bml $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bml> $$0) {
      for (bml $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
