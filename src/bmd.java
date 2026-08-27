import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bmd {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<blv> a(Supplier<bkm> $$0) {
      Set<blv> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (blu)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (blv $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static blv a(Supplier<bkm> $$0, String $$1, blu $$2) {
      return blv.a($$1, $$2, () -> {
         bkh.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)ayj.b;
      });
   }
}
