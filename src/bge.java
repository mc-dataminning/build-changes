import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bge {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bfw> a(Supplier<beq> $$0) {
      Set<bfw> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bfv)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bfw $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bfw a(Supplier<beq> $$0, String $$1, bfv $$2) {
      return bfw.a($$1, $$2, () -> {
         bel.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)atw.b;
      });
   }
}
