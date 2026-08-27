import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bse {
   private static final bse a = new bse();
   private final List<bjb> b;
   private final Predicate<bjb> c;

   private bse() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public bse(bjb $$0, List<bjb> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bjb> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bjb> $$3 = $$1x -> btg.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static bse a() {
      return a;
   }

   public Optional<bjb> a(Predicate<bjb> $$0) {
      for (bjb $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bjb> b(Predicate<bjb> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bjb> c(Predicate<bjb> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bjb $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bjb> $$0) {
      for (bjb $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
