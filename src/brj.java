import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class brj {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<brb> a(Supplier<bpp> $$0) {
      Set<brb> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bra)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (brb $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static brb a(Supplier<bpp> $$0, String $$1, bra $$2) {
      return brb.a($$1, $$2, () -> {
         bpk.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)bbg.b;
      });
   }
}
