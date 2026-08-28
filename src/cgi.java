import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cgi {
   private static final cgi a = new cgi();
   private final List<bxe> b;
   private final Predicate<bxe> c;

   private cgi() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cgi(arq $$0, bxe $$1, List<bxe> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<bxe> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<bxe> $$4 = $$2x -> chm.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cgi a() {
      return a;
   }

   public Optional<bxe> a(Predicate<bxe> $$0) {
      for (bxe $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bxe> b(Predicate<bxe> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bxe> c(Predicate<bxe> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bxe $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bxe> $$0) {
      for (bxe $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
