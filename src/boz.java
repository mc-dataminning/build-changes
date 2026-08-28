import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class boz {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bor> a(Supplier<bni> $$0) {
      Set<bor> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (boq)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bor $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bor a(Supplier<bni> $$0, String $$1, boq $$2) {
      return bor.a($$1, $$2, () -> {
         bnd.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)azz.b;
      });
   }
}
