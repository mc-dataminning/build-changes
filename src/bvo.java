import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bvo {
   private static final bvo a = new bvo();
   private final List<bmk> b;
   private final Predicate<bmk> c;

   private bvo() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public bvo(bmk $$0, List<bmk> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bmk> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bmk> $$3 = $$1x -> bwr.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static bvo a() {
      return a;
   }

   public Optional<bmk> a(Predicate<bmk> $$0) {
      for (bmk $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bmk> b(Predicate<bmk> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bmk> c(Predicate<bmk> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bmk $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bmk> $$0) {
      for (bmk $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
