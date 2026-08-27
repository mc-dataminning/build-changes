import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class esy {
   private final Reference2ObjectOpenHashMap<esw, etb> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public etb a(esw $$0) {
      return (etb)this.a.get($$0);
   }

   public etb a(esw $$0, Consumer<etb> $$1) {
      return (etb)this.a.computeIfAbsent($$0, $$1x -> {
         etb $$2 = new etb();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(esw $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<esw> b() {
      Object2IntMap<esw> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(esw $$0, etb $$1) {
      this.a.put($$0, $$1);
   }

   Map<esw, etb> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
