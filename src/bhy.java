import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bhy {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bhq> a(Supplier<bgk> $$0) {
      Set<bhq> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bhp)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bhq $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bhq a(Supplier<bgk> $$0, String $$1, bhp $$2) {
      return bhq.a($$1, $$2, () -> {
         bgf.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)avj.b;
      });
   }
}
