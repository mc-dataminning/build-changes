import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bsi {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bsa> a(Supplier<bqn> $$0) {
      Set<bsa> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (brz)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bsa $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bsa a(Supplier<bqn> $$0, String $$1, brz $$2) {
      return bsa.a($$1, $$2, () -> {
         bqi.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)baq.b;
      });
   }
}
