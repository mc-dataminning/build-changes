import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bpz {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bpr> a(Supplier<boi> $$0) {
      Set<bpr> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bpq)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bpr $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bpr a(Supplier<boi> $$0, String $$1, bpq $$2) {
      return bpr.a($$1, $$2, () -> {
         bod.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)bak.b;
      });
   }
}
