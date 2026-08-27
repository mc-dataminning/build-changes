import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class caj {
   private static final caj a = new caj();
   private final List<bre> b;
   private final Predicate<bre> c;

   private caj() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public caj(bre $$0, List<bre> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bre> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bre> $$3 = $$1x -> cbn.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static caj a() {
      return a;
   }

   public Optional<bre> a(Predicate<bre> $$0) {
      for (bre $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bre> b(Predicate<bre> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bre> c(Predicate<bre> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bre $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bre> $$0) {
      for (bre $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
