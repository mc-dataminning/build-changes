import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class buj {
   private static final buj a = new buj();
   private final List<blg> b;
   private final Predicate<blg> c;

   private buj() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public buj(blg $$0, List<blg> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<blg> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<blg> $$3 = $$1x -> bvl.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static buj a() {
      return a;
   }

   public Optional<blg> a(Predicate<blg> $$0) {
      for (blg $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<blg> b(Predicate<blg> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<blg> c(Predicate<blg> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(blg $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<blg> $$0) {
      for (blg $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
