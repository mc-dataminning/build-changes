import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bko {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bkg> a(Supplier<bja> $$0) {
      Set<bkg> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bkf)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bkg $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bkg a(Supplier<bja> $$0, String $$1, bkf $$2) {
      return bkg.a($$1, $$2, () -> {
         biv.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)axl.b;
      });
   }
}
