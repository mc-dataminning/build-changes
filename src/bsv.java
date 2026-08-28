import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bsv {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bsn> a(Supplier<bra> $$0) {
      Set<bsn> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bsm)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bsn $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bsn a(Supplier<bra> $$0, String $$1, bsm $$2) {
      return bsn.a($$1, $$2, () -> {
         bqv.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)bau.b;
      });
   }
}
