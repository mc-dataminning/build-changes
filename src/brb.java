import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class brb {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bqt> a(Supplier<bpg> $$0) {
      Set<bqt> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bqs)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bqt $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bqt a(Supplier<bpg> $$0, String $$1, bqs $$2) {
      return bqt.a($$1, $$2, () -> {
         bpb.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)baw.b;
      });
   }
}
