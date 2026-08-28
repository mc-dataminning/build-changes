import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ewo {
   private final Reference2ObjectOpenHashMap<ewm, ewr> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public ewr a(ewm $$0) {
      return (ewr)this.a.get($$0);
   }

   public ewr a(ewm $$0, Consumer<ewr> $$1) {
      return (ewr)this.a.computeIfAbsent($$0, $$1x -> {
         ewr $$2 = new ewr();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(ewm $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<ewm> b() {
      Object2IntMap<ewm> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(ewm $$0, ewr $$1) {
      this.a.put($$0, $$1);
   }

   Map<ewm, ewr> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
