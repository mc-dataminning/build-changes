import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class buo {
   private static final buo a = new buo();
   private final List<bll> b;
   private final Predicate<bll> c;

   private buo() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public buo(bll $$0, List<bll> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bll> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bll> $$3 = $$1x -> bvq.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static buo a() {
      return a;
   }

   public Optional<bll> a(Predicate<bll> $$0) {
      for (bll $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bll> b(Predicate<bll> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bll> c(Predicate<bll> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bll $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bll> $$0) {
      for (bll $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
