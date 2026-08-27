import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cbt {
   private static final cbt a = new cbt();
   private final List<bso> b;
   private final Predicate<bso> c;

   private cbt() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cbt(bso $$0, List<bso> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bso> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bso> $$3 = $$1x -> ccx.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static cbt a() {
      return a;
   }

   public Optional<bso> a(Predicate<bso> $$0) {
      for (bso $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bso> b(Predicate<bso> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bso> c(Predicate<bso> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bso $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bso> $$0) {
      for (bso $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
