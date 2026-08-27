import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bhe {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bgw> a(Supplier<bfq> $$0) {
      Set<bgw> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bgv)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bgw $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bgw a(Supplier<bfq> $$0, String $$1, bgv $$2) {
      return bgw.a($$1, $$2, () -> {
         bfl.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)aup.b;
      });
   }
}
