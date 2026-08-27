import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class blg {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bky> a(Supplier<bjp> $$0) {
      Set<bky> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bkx)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bky $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bky a(Supplier<bjp> $$0, String $$1, bkx $$2) {
      return bky.a($$1, $$2, () -> {
         bjk.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)axv.b;
      });
   }
}
