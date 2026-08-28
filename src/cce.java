import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cce {
   private static final cce a = new cce();
   private final List<bsy> b;
   private final Predicate<bsy> c;

   private cce() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cce(bsy $$0, List<bsy> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bsy> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bsy> $$3 = $$1x -> cdi.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static cce a() {
      return a;
   }

   public Optional<bsy> a(Predicate<bsy> $$0) {
      for (bsy $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bsy> b(Predicate<bsy> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bsy> c(Predicate<bsy> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bsy $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bsy> $$0) {
      for (bsy $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
