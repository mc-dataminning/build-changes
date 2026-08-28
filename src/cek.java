import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cek {
   private static final cek a = new cek();
   private final List<bve> b;
   private final Predicate<bve> c;

   private cek() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cek(bve $$0, List<bve> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bve> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bve> $$3 = $$1x -> cfo.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static cek a() {
      return a;
   }

   public Optional<bve> a(Predicate<bve> $$0) {
      for (bve $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bve> b(Predicate<bve> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bve> c(Predicate<bve> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bve $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bve> $$0) {
      for (bve $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
