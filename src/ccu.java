import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ccu {
   private static final ccu a = new ccu();
   private final List<bto> b;
   private final Predicate<bto> c;

   private ccu() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public ccu(bto $$0, List<bto> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bto> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bto> $$3 = $$1x -> cdy.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static ccu a() {
      return a;
   }

   public Optional<bto> a(Predicate<bto> $$0) {
      for (bto $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bto> b(Predicate<bto> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bto> c(Predicate<bto> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bto $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bto> $$0) {
      for (bto $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
