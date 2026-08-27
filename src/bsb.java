import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bsb {
   private static final bsb a = new bsb();
   private final List<biy> b;
   private final Predicate<biy> c;

   private bsb() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public bsb(biy $$0, List<biy> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<biy> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<biy> $$3 = $$1x -> btd.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static bsb a() {
      return a;
   }

   public Optional<biy> a(Predicate<biy> $$0) {
      for (biy $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<biy> b(Predicate<biy> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<biy> c(Predicate<biy> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(biy $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<biy> $$0) {
      for (biy $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
