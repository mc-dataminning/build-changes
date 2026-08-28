import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ceg {
   private static final ceg a = new ceg();
   private final List<bva> b;
   private final Predicate<bva> c;

   private ceg() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public ceg(bva $$0, List<bva> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bva> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bva> $$3 = $$1x -> cfk.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static ceg a() {
      return a;
   }

   public Optional<bva> a(Predicate<bva> $$0) {
      for (bva $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bva> b(Predicate<bva> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bva> c(Predicate<bva> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bva $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bva> $$0) {
      for (bva $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
