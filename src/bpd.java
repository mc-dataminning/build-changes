import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bpd {
   private static final bpd a = new bpd();
   private final List<bfz> b;
   private final Predicate<bfz> c;

   private bpd() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public bpd(bfz $$0, List<bfz> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bfz> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bfz> $$3 = $$1x -> bqf.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static bpd a() {
      return a;
   }

   public Optional<bfz> a(Predicate<bfz> $$0) {
      for (bfz $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bfz> b(Predicate<bfz> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bfz> c(Predicate<bfz> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bfz $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bfz> $$0) {
      for (bfz $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
