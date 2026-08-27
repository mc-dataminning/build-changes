import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ber {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bej> a(Supplier<bdc> $$0) {
      Set<bej> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bei)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bej $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bej a(Supplier<bdc> $$0, String $$1, bei $$2) {
      return bej.a($$1, $$2, () -> {
         bcx.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)ask.b;
      });
   }
}
