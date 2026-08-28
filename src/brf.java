import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class brf {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bqx> a(Supplier<bpl> $$0) {
      Set<bqx> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bqw)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bqx $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bqx a(Supplier<bpl> $$0, String $$1, bqw $$2) {
      return bqx.a($$1, $$2, () -> {
         bpg.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)bbg.b;
      });
   }
}
