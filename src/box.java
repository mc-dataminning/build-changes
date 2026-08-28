import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class box {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bop> a(Supplier<bng> $$0) {
      Set<bop> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (boo)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bop $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bop a(Supplier<bng> $$0, String $$1, boo $$2) {
      return bop.a($$1, $$2, () -> {
         bnb.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)azz.b;
      });
   }
}
