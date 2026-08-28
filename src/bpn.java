import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bpn {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bpf> a(Supplier<bnw> $$0) {
      Set<bpf> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bpe)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bpf $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bpf a(Supplier<bnw> $$0, String $$1, bpe $$2) {
      return bpf.a($$1, $$2, () -> {
         bnr.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)bad.b;
      });
   }
}
