import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ccx {
   private static final ccx a = new ccx();
   private final List<btr> b;
   private final Predicate<btr> c;

   private ccx() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public ccx(btr $$0, List<btr> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<btr> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<btr> $$3 = $$1x -> ceb.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static ccx a() {
      return a;
   }

   public Optional<btr> a(Predicate<btr> $$0) {
      for (btr $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<btr> b(Predicate<btr> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<btr> c(Predicate<btr> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(btr $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<btr> $$0) {
      for (btr $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
