import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bid {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bhv> a(Supplier<bgp> $$0) {
      Set<bhv> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bhu)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bhv $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bhv a(Supplier<bgp> $$0, String $$1, bhu $$2) {
      return bhv.a($$1, $$2, () -> {
         bgk.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)avo.b;
      });
   }
}
