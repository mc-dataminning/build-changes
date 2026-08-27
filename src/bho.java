import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bho {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bhg> a(Supplier<bga> $$0) {
      Set<bhg> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bhf)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bhg $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bhg a(Supplier<bga> $$0, String $$1, bhf $$2) {
      return bhg.a($$1, $$2, () -> {
         bfv.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)auz.b;
      });
   }
}
