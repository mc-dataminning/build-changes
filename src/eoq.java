import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class eoq {
   private final Reference2ObjectOpenHashMap<eoo, eot> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public eot a(eoo $$0) {
      return (eot)this.a.get($$0);
   }

   public eot a(eoo $$0, Consumer<eot> $$1) {
      return (eot)this.a.computeIfAbsent($$0, $$1x -> {
         eot $$2 = new eot();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(eoo $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<eoo> b() {
      Object2IntMap<eoo> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(eoo $$0, eot $$1) {
      this.a.put($$0, $$1);
   }

   Map<eoo, eot> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
