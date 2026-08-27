import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ept {
   private final Reference2ObjectOpenHashMap<epr, epw> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public epw a(epr $$0) {
      return (epw)this.a.get($$0);
   }

   public epw a(epr $$0, Consumer<epw> $$1) {
      return (epw)this.a.computeIfAbsent($$0, $$1x -> {
         epw $$2 = new epw();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(epr $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<epr> b() {
      Object2IntMap<epr> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(epr $$0, epw $$1) {
      this.a.put($$0, $$1);
   }

   Map<epr, epw> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
