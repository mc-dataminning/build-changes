import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cgn {
   private static final cgn a = new cgn();
   private final List<bxj> b;
   private final Predicate<bxj> c;

   private cgn() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cgn(arq $$0, bxj $$1, List<bxj> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bxj> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bxj> $$4 = $$2x -> chr.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cgn a() {
      return a;
   }

   public Optional<bxj> a(Predicate<bxj> $$0) {
      for (bxj $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bxj> b(Predicate<bxj> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bxj> c(Predicate<bxj> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bxj $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bxj> $$0) {
      for (bxj $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
