import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bow {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<boo> a(Supplier<bnf> $$0) {
      Set<boo> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bon)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (boo $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static boo a(Supplier<bnf> $$0, String $$1, bon $$2) {
      return boo.a($$1, $$2, () -> {
         bna.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)azy.b;
      });
   }
}
