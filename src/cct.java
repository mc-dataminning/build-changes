import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cct {
   private static final cct a = new cct();
   private final List<btn> b;
   private final Predicate<btn> c;

   private cct() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cct(btn $$0, List<btn> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<btn> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<btn> $$3 = $$1x -> cdx.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static cct a() {
      return a;
   }

   public Optional<btn> a(Predicate<btn> $$0) {
      for (btn $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<btn> b(Predicate<btn> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<btn> c(Predicate<btn> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(btn $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<btn> $$0) {
      for (btn $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
