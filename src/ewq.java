import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ewq {
   private final Reference2ObjectOpenHashMap<ewo, ewt> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public ewt a(ewo $$0) {
      return (ewt)this.a.get($$0);
   }

   public ewt a(ewo $$0, Consumer<ewt> $$1) {
      return (ewt)this.a.computeIfAbsent($$0, $$1x -> {
         ewt $$2 = new ewt();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(ewo $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<ewo> b() {
      Object2IntMap<ewo> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(ewo $$0, ewt $$1) {
      this.a.put($$0, $$1);
   }

   Map<ewo, ewt> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
