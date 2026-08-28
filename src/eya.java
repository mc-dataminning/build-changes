import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class eya {
   private final Reference2ObjectOpenHashMap<exy, eyd> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public eyd a(exy $$0) {
      return (eyd)this.a.get($$0);
   }

   public eyd a(exy $$0, Consumer<eyd> $$1) {
      return (eyd)this.a.computeIfAbsent($$0, $$1x -> {
         eyd $$2 = new eyd();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(exy $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<exy> b() {
      Object2IntMap<exy> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(exy $$0, eyd $$1) {
      this.a.put($$0, $$1);
   }

   Map<exy, eyd> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
