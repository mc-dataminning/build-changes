import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ccs {
   private static final ccs a = new ccs();
   private final List<btl> b;
   private final Predicate<btl> c;

   private ccs() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public ccs(btl $$0, List<btl> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<btl> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<btl> $$3 = $$1x -> cdw.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static ccs a() {
      return a;
   }

   public Optional<btl> a(Predicate<btl> $$0) {
      for (btl $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<btl> b(Predicate<btl> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<btl> c(Predicate<btl> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(btl $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<btl> $$0) {
      for (btl $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
