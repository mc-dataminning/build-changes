import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bot {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bol> a(Supplier<bnc> $$0) {
      Set<bol> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bok)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bol $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bol a(Supplier<bnc> $$0, String $$1, bok $$2) {
      return bol.a($$1, $$2, () -> {
         bmx.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)azo.b;
      });
   }
}
