import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bps {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bpk> a(Supplier<bob> $$0) {
      Set<bpk> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bpj)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bpk $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bpk a(Supplier<bob> $$0, String $$1, bpj $$2) {
      return bpk.a($$1, $$2, () -> {
         bnw.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)bae.b;
      });
   }
}
