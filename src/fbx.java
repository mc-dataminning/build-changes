import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fbx {
   private final Reference2ObjectOpenHashMap<fbv, fca> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public fca a(fbv $$0) {
      return (fca)this.a.get($$0);
   }

   public fca a(fbv $$0, Consumer<fca> $$1) {
      return (fca)this.a.computeIfAbsent($$0, $$1x -> {
         fca $$2 = new fca();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(fbv $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<fbv> b() {
      Object2IntMap<fbv> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(fbv $$0, fca $$1) {
      this.a.put($$0, $$1);
   }

   Map<fbv, fca> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
