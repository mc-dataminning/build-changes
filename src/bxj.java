import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bxj {
   private static final bxj a = new bxj();
   private final List<bog> b;
   private final Predicate<bog> c;

   private bxj() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public bxj(bog $$0, List<bog> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bog> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bog> $$3 = $$1x -> byn.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static bxj a() {
      return a;
   }

   public Optional<bog> a(Predicate<bog> $$0) {
      for (bog $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bog> b(Predicate<bog> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bog> c(Predicate<bog> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bog $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bog> $$0) {
      for (bog $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
