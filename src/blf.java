import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class blf {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bkx> a(Supplier<bjo> $$0) {
      Set<bkx> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bkw)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bkx $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bkx a(Supplier<bjo> $$0, String $$1, bkw $$2) {
      return bkx.a($$1, $$2, () -> {
         bjj.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)axv.b;
      });
   }
}
