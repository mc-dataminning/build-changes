import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bnp {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bnh> a(Supplier<bly> $$0) {
      Set<bnh> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bng)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bnh $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bnh a(Supplier<bly> $$0, String $$1, bng $$2) {
      return bnh.a($$1, $$2, () -> {
         blt.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)ayy.b;
      });
   }
}
