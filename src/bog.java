import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bog {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bny> a(Supplier<bmp> $$0) {
      Set<bny> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bnx)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bny $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bny a(Supplier<bmp> $$0, String $$1, bnx $$2) {
      return bny.a($$1, $$2, () -> {
         bmk.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)aze.b;
      });
   }
}
