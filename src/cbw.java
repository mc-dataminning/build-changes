import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cbw {
   private static final cbw a = new cbw();
   private final List<bsq> b;
   private final Predicate<bsq> c;

   private cbw() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cbw(bsq $$0, List<bsq> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bsq> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bsq> $$3 = $$1x -> cda.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static cbw a() {
      return a;
   }

   public Optional<bsq> a(Predicate<bsq> $$0) {
      for (bsq $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bsq> b(Predicate<bsq> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bsq> c(Predicate<bsq> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bsq $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bsq> $$0) {
      for (bsq $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
