import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bie {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bhw> a(Supplier<bgq> $$0) {
      Set<bhw> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bhv)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bhw $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bhw a(Supplier<bgq> $$0, String $$1, bhv $$2) {
      return bhw.a($$1, $$2, () -> {
         bgl.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)avp.b;
      });
   }
}
