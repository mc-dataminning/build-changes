import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class byu {
   private static final byu a = new byu();
   private final List<bpp> b;
   private final Predicate<bpp> c;

   private byu() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public byu(bpp $$0, List<bpp> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bpp> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bpp> $$3 = $$1x -> bzy.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static byu a() {
      return a;
   }

   public Optional<bpp> a(Predicate<bpp> $$0) {
      for (bpp $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bpp> b(Predicate<bpp> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bpp> c(Predicate<bpp> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bpp $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bpp> $$0) {
      for (bpp $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
