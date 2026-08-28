import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cdp {
   private static final cdp a = new cdp();
   private final List<buk> b;
   private final Predicate<buk> c;

   private cdp() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cdp(buk $$0, List<buk> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<buk> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<buk> $$3 = $$1x -> cet.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static cdp a() {
      return a;
   }

   public Optional<buk> a(Predicate<buk> $$0) {
      for (buk $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<buk> b(Predicate<buk> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<buk> c(Predicate<buk> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(buk $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<buk> $$0) {
      for (buk $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
