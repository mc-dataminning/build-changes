import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bfd {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bev> a(Supplier<bdp> $$0) {
      Set<bev> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (beu)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bev $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bev a(Supplier<bdp> $$0, String $$1, beu $$2) {
      return bev.a($$1, $$2, () -> {
         bdk.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)asw.b;
      });
   }
}
