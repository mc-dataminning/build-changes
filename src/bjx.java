import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bjx {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bjp> a(Supplier<bij> $$0) {
      Set<bjp> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bjo)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bjp $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bjp a(Supplier<bij> $$0, String $$1, bjo $$2) {
      return bjp.a($$1, $$2, () -> {
         bie.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)axh.b;
      });
   }
}
