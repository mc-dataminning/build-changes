import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bql {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bqd> a(Supplier<boq> $$0) {
      Set<bqd> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bqc)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bqd $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bqd a(Supplier<boq> $$0, String $$1, bqc $$2) {
      return bqd.a($$1, $$2, () -> {
         bol.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)bab.b;
      });
   }
}
