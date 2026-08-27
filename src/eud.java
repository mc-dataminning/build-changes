import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class eud {
   private final Reference2ObjectOpenHashMap<eub, eug> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public eug a(eub $$0) {
      return (eug)this.a.get($$0);
   }

   public eug a(eub $$0, Consumer<eug> $$1) {
      return (eug)this.a.computeIfAbsent($$0, $$1x -> {
         eug $$2 = new eug();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(eub $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<eub> b() {
      Object2IntMap<eub> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(eub $$0, eug $$1) {
      this.a.put($$0, $$1);
   }

   Map<eub, eug> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
