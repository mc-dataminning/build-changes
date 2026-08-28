import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fbz {
   private final Reference2ObjectOpenHashMap<fbx, fcc> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public fcc a(fbx $$0) {
      return (fcc)this.a.get($$0);
   }

   public fcc a(fbx $$0, Consumer<fcc> $$1) {
      return (fcc)this.a.computeIfAbsent($$0, $$1x -> {
         fcc $$2 = new fcc();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(fbx $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<fbx> b() {
      Object2IntMap<fbx> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(fbx $$0, fcc $$1) {
      this.a.put($$0, $$1);
   }

   Map<fbx, fcc> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
