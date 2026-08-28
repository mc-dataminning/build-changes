import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bqm {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bqe> a(Supplier<bor> $$0) {
      Set<bqe> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bqd)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bqe $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bqe a(Supplier<bor> $$0, String $$1, bqd $$2) {
      return bqe.a($$1, $$2, () -> {
         bom.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)bab.b;
      });
   }
}
