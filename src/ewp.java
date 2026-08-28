import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ewp {
   private final Reference2ObjectOpenHashMap<ewn, ews> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public ews a(ewn $$0) {
      return (ews)this.a.get($$0);
   }

   public ews a(ewn $$0, Consumer<ews> $$1) {
      return (ews)this.a.computeIfAbsent($$0, $$1x -> {
         ews $$2 = new ews();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(ewn $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<ewn> b() {
      Object2IntMap<ewn> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(ewn $$0, ews $$1) {
      this.a.put($$0, $$1);
   }

   Map<ewn, ews> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
