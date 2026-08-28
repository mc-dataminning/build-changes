import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cci {
   private static final cci a = new cci();
   private final List<btc> b;
   private final Predicate<btc> c;

   private cci() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cci(btc $$0, List<btc> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<btc> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<btc> $$3 = $$1x -> cdm.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static cci a() {
      return a;
   }

   public Optional<btc> a(Predicate<btc> $$0) {
      for (btc $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<btc> b(Predicate<btc> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<btc> c(Predicate<btc> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(btc $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<btc> $$0) {
      for (btc $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
