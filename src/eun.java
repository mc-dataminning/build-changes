import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class eun {
   private final Reference2ObjectOpenHashMap<eul, euq> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public euq a(eul $$0) {
      return (euq)this.a.get($$0);
   }

   public euq a(eul $$0, Consumer<euq> $$1) {
      return (euq)this.a.computeIfAbsent($$0, $$1x -> {
         euq $$2 = new euq();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(eul $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<eul> b() {
      Object2IntMap<eul> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(eul $$0, euq $$1) {
      this.a.put($$0, $$1);
   }

   Map<eul, euq> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
