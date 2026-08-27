import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bew {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<beo> a(Supplier<bdi> $$0) {
      Set<beo> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (ben)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (beo $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static beo a(Supplier<bdi> $$0, String $$1, ben $$2) {
      return beo.a($$1, $$2, () -> {
         bdd.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)asp.b;
      });
   }
}
