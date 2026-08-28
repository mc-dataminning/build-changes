import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bos {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bok> a(Supplier<bnb> $$0) {
      Set<bok> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (boj)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bok $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bok a(Supplier<bnb> $$0, String $$1, boj $$2) {
      return bok.a($$1, $$2, () -> {
         bmw.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)azu.b;
      });
   }
}
