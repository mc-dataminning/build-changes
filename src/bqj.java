import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bqj {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bqb> a(Supplier<boo> $$0) {
      Set<bqb> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bqa)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bqb $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bqb a(Supplier<boo> $$0, String $$1, bqa $$2) {
      return bqb.a($$1, $$2, () -> {
         boj.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)baa.b;
      });
   }
}
