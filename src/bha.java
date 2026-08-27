import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bha {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bgs> a(Supplier<bfm> $$0) {
      Set<bgs> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bgr)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bgs $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bgs a(Supplier<bfm> $$0, String $$1, bgr $$2) {
      return bgs.a($$1, $$2, () -> {
         bfh.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)aul.b;
      });
   }
}
