import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ewx {
   private final Reference2ObjectOpenHashMap<ewv, exa> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public exa a(ewv $$0) {
      return (exa)this.a.get($$0);
   }

   public exa a(ewv $$0, Consumer<exa> $$1) {
      return (exa)this.a.computeIfAbsent($$0, $$1x -> {
         exa $$2 = new exa();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(ewv $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<ewv> b() {
      Object2IntMap<ewv> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(ewv $$0, exa $$1) {
      this.a.put($$0, $$1);
   }

   Map<ewv, exa> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
