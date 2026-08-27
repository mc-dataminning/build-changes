import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class byt {
   private static final byt a = new byt();
   private final List<bpo> b;
   private final Predicate<bpo> c;

   private byt() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public byt(bpo $$0, List<bpo> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bpo> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bpo> $$3 = $$1x -> bzx.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static byt a() {
      return a;
   }

   public Optional<bpo> a(Predicate<bpo> $$0) {
      for (bpo $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bpo> b(Predicate<bpo> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bpo> c(Predicate<bpo> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bpo $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bpo> $$0) {
      for (bpo $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
