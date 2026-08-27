import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bif {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bhx> a(Supplier<bgr> $$0) {
      Set<bhx> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bhw)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bhx $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bhx a(Supplier<bgr> $$0, String $$1, bhw $$2) {
      return bhx.a($$1, $$2, () -> {
         bgm.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)avq.b;
      });
   }
}
