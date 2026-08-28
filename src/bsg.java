import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bsg {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bry> a(Supplier<bql> $$0) {
      Set<bry> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (brx)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bry $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bry a(Supplier<bql> $$0, String $$1, brx $$2) {
      return bry.a($$1, $$2, () -> {
         bqg.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)baq.b;
      });
   }
}
