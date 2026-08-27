import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bfb {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bet> a(Supplier<bdn> $$0) {
      Set<bet> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bes)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bet $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bet a(Supplier<bdn> $$0, String $$1, bes $$2) {
      return bet.a($$1, $$2, () -> {
         bdi.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)asu.b;
      });
   }
}
