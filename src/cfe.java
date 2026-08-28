import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cfe {
   private static final cfe a = new cfe();
   private final List<bvy> b;
   private final Predicate<bvy> c;

   private cfe() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cfe(ard $$0, bvy $$1, List<bvy> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bvy> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bvy> $$4 = $$2x -> cgi.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cfe a() {
      return a;
   }

   public Optional<bvy> a(Predicate<bvy> $$0) {
      for (bvy $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bvy> b(Predicate<bvy> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bvy> c(Predicate<bvy> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bvy $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bvy> $$0) {
      for (bvy $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
