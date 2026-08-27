import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bvj {
   private static final bvj a = new bvj();
   private final List<bmf> b;
   private final Predicate<bmf> c;

   private bvj() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public bvj(bmf $$0, List<bmf> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bmf> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bmf> $$3 = $$1x -> bwm.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static bvj a() {
      return a;
   }

   public Optional<bmf> a(Predicate<bmf> $$0) {
      for (bmf $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bmf> b(Predicate<bmf> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bmf> c(Predicate<bmf> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bmf $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bmf> $$0) {
      for (bmf $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
