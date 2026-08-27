import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bjz {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bjr> a(Supplier<bil> $$0) {
      Set<bjr> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bjq)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bjr $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bjr a(Supplier<bil> $$0, String $$1, bjq $$2) {
      return bjr.a($$1, $$2, () -> {
         big.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)axh.b;
      });
   }
}
