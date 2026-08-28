import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class chj {
   private static final chj a = new chj();
   private final List<byf> b;
   private final Predicate<byf> c;

   private chj() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public chj(asb $$0, byf $$1, List<byf> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<byf> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<byf> $$4 = $$2x -> cin.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static chj a() {
      return a;
   }

   public Optional<byf> a(Predicate<byf> $$0) {
      for (byf $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<byf> b(Predicate<byf> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<byf> c(Predicate<byf> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(byf $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<byf> $$0) {
      for (byf $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
