import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class evk {
   private final Reference2ObjectOpenHashMap<evi, evn> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public evn a(evi $$0) {
      return (evn)this.a.get($$0);
   }

   public evn a(evi $$0, Consumer<evn> $$1) {
      return (evn)this.a.computeIfAbsent($$0, $$1x -> {
         evn $$2 = new evn();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(evi $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<evi> b() {
      Object2IntMap<evi> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(evi $$0, evn $$1) {
      this.a.put($$0, $$1);
   }

   Map<evi, evn> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
