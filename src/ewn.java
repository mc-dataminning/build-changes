import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ewn {
   private final Reference2ObjectOpenHashMap<ewl, ewq> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public ewq a(ewl $$0) {
      return (ewq)this.a.get($$0);
   }

   public ewq a(ewl $$0, Consumer<ewq> $$1) {
      return (ewq)this.a.computeIfAbsent($$0, $$1x -> {
         ewq $$2 = new ewq();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(ewl $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<ewl> b() {
      Object2IntMap<ewl> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(ewl $$0, ewq $$1) {
      this.a.put($$0, $$1);
   }

   Map<ewl, ewq> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
