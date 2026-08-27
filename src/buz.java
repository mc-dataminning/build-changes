import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class buz {
   private static final buz a = new buz();
   private final List<blv> b;
   private final Predicate<blv> c;

   private buz() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public buz(blv $$0, List<blv> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<blv> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<blv> $$3 = $$1x -> bwc.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static buz a() {
      return a;
   }

   public Optional<blv> a(Predicate<blv> $$0) {
      for (blv $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<blv> b(Predicate<blv> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<blv> c(Predicate<blv> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(blv $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<blv> $$0) {
      for (blv $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
