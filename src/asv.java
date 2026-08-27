import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class asv<K, V extends asv.a<K>> {
   private final Map<K, V> a = new HashMap<>();

   public asv<K, V> a(K $$0, V $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   private void a(Multimap<K, K> $$0, Set<K> $$1, K $$2, BiConsumer<K, V> $$3) {
      if ($$1.add($$2)) {
         $$0.get($$2).forEach($$3x -> this.a($$0, $$1, (K)$$3x, $$3));
         V $$4 = this.a.get($$2);
         if ($$4 != null) {
            $$3.accept($$2, $$4);
         }
      }
   }

   private static <K> boolean a(Multimap<K, K> $$0, K $$1, K $$2) {
      Collection<K> $$3 = $$0.get($$2);
      return $$3.contains($$1) ? true : $$3.stream().anyMatch($$2x -> a($$0, $$1, $$2x));
   }

   private static <K> void b(Multimap<K, K> $$0, K $$1, K $$2) {
      if (!a($$0, $$1, $$2)) {
         $$0.put($$1, $$2);
      }
   }

   public void a(BiConsumer<K, V> $$0) {
      Multimap<K, K> $$1 = HashMultimap.create();
      this.a.forEach(($$1x, $$2x) -> $$2x.a($$2xx -> b($$1, $$1x, $$2xx)));
      this.a.forEach(($$1x, $$2x) -> $$2x.b($$2xx -> b($$1, $$1x, $$2xx)));
      Set<K> $$2 = new HashSet<>();
      this.a.keySet().forEach($$3 -> this.a($$1, $$2, (K)$$3, $$0));
   }

   public interface a<K> {
      void a(Consumer<K> var1);

      void b(Consumer<K> var1);
   }
}
