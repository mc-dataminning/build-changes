import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cdk {
   private static final cdk a = new cdk();
   private final List<buf> b;
   private final Predicate<buf> c;

   private cdk() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cdk(buf $$0, List<buf> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<buf> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<buf> $$3 = $$1x -> ceo.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static cdk a() {
      return a;
   }

   public Optional<buf> a(Predicate<buf> $$0) {
      for (buf $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<buf> b(Predicate<buf> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<buf> c(Predicate<buf> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(buf $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<buf> $$0) {
      for (buf $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
