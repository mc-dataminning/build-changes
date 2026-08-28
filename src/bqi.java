import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bqi {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bqa> a(Supplier<boo> $$0) {
      Set<bqa> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bpz)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bqa $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bqa a(Supplier<boo> $$0, String $$1, bpz $$2) {
      return bqa.a($$1, $$2, () -> {
         boj.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)bap.b;
      });
   }
}
