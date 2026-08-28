import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ccw {
   private static final ccw a = new ccw();
   private final List<btq> b;
   private final Predicate<btq> c;

   private ccw() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public ccw(btq $$0, List<btq> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<btq> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<btq> $$3 = $$1x -> cea.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static ccw a() {
      return a;
   }

   public Optional<btq> a(Predicate<btq> $$0) {
      for (btq $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<btq> b(Predicate<btq> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<btq> c(Predicate<btq> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(btq $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<btq> $$0) {
      for (btq $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
