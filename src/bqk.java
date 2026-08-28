import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bqk {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bqc> a(Supplier<bop> $$0) {
      Set<bqc> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bqb)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bqc $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bqc a(Supplier<bop> $$0, String $$1, bqb $$2) {
      return bqc.a($$1, $$2, () -> {
         bok.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)bab.b;
      });
   }
}
