import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class evi {
   private final Reference2ObjectOpenHashMap<evg, evl> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public evl a(evg $$0) {
      return (evl)this.a.get($$0);
   }

   public evl a(evg $$0, Consumer<evl> $$1) {
      return (evl)this.a.computeIfAbsent($$0, $$1x -> {
         evl $$2 = new evl();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(evg $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<evg> b() {
      Object2IntMap<evg> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(evg $$0, evl $$1) {
      this.a.put($$0, $$1);
   }

   Map<evg, evl> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
