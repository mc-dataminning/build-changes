import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bsp {
   private static final bsp a = new bsp();
   private final List<bjm> b;
   private final Predicate<bjm> c;

   private bsp() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public bsp(bjm $$0, List<bjm> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bjm> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bjm> $$3 = $$1x -> btr.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static bsp a() {
      return a;
   }

   public Optional<bjm> a(Predicate<bjm> $$0) {
      for (bjm $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bjm> b(Predicate<bjm> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bjm> c(Predicate<bjm> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bjm $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bjm> $$0) {
      for (bjm $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
