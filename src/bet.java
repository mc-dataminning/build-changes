import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bet {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bel> a(Supplier<bdf> $$0) {
      Set<bel> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bek)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bel $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bel a(Supplier<bdf> $$0, String $$1, bek $$2) {
      return bel.a($$1, $$2, () -> {
         bda.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)asm.b;
      });
   }
}
