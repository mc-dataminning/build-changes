import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cfd {
   private static final cfd a = new cfd();
   private final List<bvx> b;
   private final Predicate<bvx> c;

   private cfd() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cfd(arx $$0, bvx $$1, List<bvx> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bvx> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bvx> $$4 = $$2x -> cgh.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cfd a() {
      return a;
   }

   public Optional<bvx> a(Predicate<bvx> $$0) {
      for (bvx $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bvx> b(Predicate<bvx> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bvx> c(Predicate<bvx> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bvx $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bvx> $$0) {
      for (bvx $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
