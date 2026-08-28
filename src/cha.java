import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cha {
   private static final cha a = new cha();
   private final List<bxw> b;
   private final Predicate<bxw> c;

   private cha() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cha(aru $$0, bxw $$1, List<bxw> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bxw> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bxw> $$4 = $$2x -> cie.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cha a() {
      return a;
   }

   public Optional<bxw> a(Predicate<bxw> $$0) {
      for (bxw $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bxw> b(Predicate<bxw> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bxw> c(Predicate<bxw> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bxw $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bxw> $$0) {
      for (bxw $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
