import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bok {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<boc> a(Supplier<bmt> $$0) {
      Set<boc> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bob)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (boc $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static boc a(Supplier<bmt> $$0, String $$1, bob $$2) {
      return boc.a($$1, $$2, () -> {
         bmo.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)azh.b;
      });
   }
}
