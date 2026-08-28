import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cgg {
   private static final cgg a = new cgg();
   private final List<bxc> b;
   private final Predicate<bxc> c;

   private cgg() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cgg(arq $$0, bxc $$1, List<bxc> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bxc> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bxc> $$4 = $$2x -> chk.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cgg a() {
      return a;
   }

   public Optional<bxc> a(Predicate<bxc> $$0) {
      for (bxc $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bxc> b(Predicate<bxc> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bxc> c(Predicate<bxc> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bxc $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bxc> $$0) {
      for (bxc $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
