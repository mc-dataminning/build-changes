import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bte {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bsw> a(Supplier<brj> $$0) {
      Set<bsw> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bsv)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bsw $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bsw a(Supplier<brj> $$0, String $$1, bsv $$2) {
      return bsw.a($$1, $$2, () -> {
         bre.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)bbd.b;
      });
   }
}
