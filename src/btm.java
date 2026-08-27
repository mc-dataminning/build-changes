import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class btm {
   private static final btm a = new btm();
   private final List<bkj> b;
   private final Predicate<bkj> c;

   private btm() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public btm(bkj $$0, List<bkj> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bkj> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bkj> $$3 = $$1x -> buo.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static btm a() {
      return a;
   }

   public Optional<bkj> a(Predicate<bkj> $$0) {
      for (bkj $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bkj> b(Predicate<bkj> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bkj> c(Predicate<bkj> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bkj $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bkj> $$0) {
      for (bkj $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
