import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class brt {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<brl> a(Supplier<bpy> $$0) {
      Set<brl> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (brk)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (brl $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static brl a(Supplier<bpy> $$0, String $$1, brk $$2) {
      return brl.a($$1, $$2, () -> {
         bpt.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)bam.b;
      });
   }
}
