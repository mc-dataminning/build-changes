import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bca {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bbs> a(Supplier<bal> $$0) {
      Set<bbs> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bbr)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bbs $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bbs a(Supplier<bal> $$0, String $$1, bbr $$2) {
      return bbs.a($$1, $$2, () -> {
         bag.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)apw.b;
      });
   }
}
