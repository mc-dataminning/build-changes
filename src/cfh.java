import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cfh {
   private static final cfh a = new cfh();
   private final List<bwb> b;
   private final Predicate<bwb> c;

   private cfh() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cfh(ash $$0, bwb $$1, List<bwb> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bwb> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bwb> $$4 = $$2x -> cgl.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cfh a() {
      return a;
   }

   public Optional<bwb> a(Predicate<bwb> $$0) {
      for (bwb $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bwb> b(Predicate<bwb> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bwb> c(Predicate<bwb> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bwb $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bwb> $$0) {
      for (bwb $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
