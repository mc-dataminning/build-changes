import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ccq {
   private static final ccq a = new ccq();
   private final List<btk> b;
   private final Predicate<btk> c;

   private ccq() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public ccq(btk $$0, List<btk> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<btk> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<btk> $$3 = $$1x -> cdu.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static ccq a() {
      return a;
   }

   public Optional<btk> a(Predicate<btk> $$0) {
      for (btk $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<btk> b(Predicate<btk> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<btk> c(Predicate<btk> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(btk $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<btk> $$0) {
      for (btk $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
