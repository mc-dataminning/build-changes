import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bou {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bom> a(Supplier<bnd> $$0) {
      Set<bom> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bol)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bom $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bom a(Supplier<bnd> $$0, String $$1, bol $$2) {
      return bom.a($$1, $$2, () -> {
         bmy.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)azp.b;
      });
   }
}
