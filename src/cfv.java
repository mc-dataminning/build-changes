import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cfv {
   private static final cfv a = new cfv();
   private final List<bwr> b;
   private final Predicate<bwr> c;

   private cfv() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cfv(arn $$0, bwr $$1, List<bwr> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bwr> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bwr> $$4 = $$2x -> cgz.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cfv a() {
      return a;
   }

   public Optional<bwr> a(Predicate<bwr> $$0) {
      for (bwr $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bwr> b(Predicate<bwr> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bwr> c(Predicate<bwr> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bwr $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bwr> $$0) {
      for (bwr $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
