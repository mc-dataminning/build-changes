import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bod {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bnv> a(Supplier<bmm> $$0) {
      Set<bnv> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bnu)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bnv $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bnv a(Supplier<bmm> $$0, String $$1, bnu $$2) {
      return bnv.a($$1, $$2, () -> {
         bmh.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)azl.b;
      });
   }
}
