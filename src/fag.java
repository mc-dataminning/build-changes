import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fag {
   private final Reference2ObjectOpenHashMap<fae, faj> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public faj a(fae $$0) {
      return (faj)this.a.get($$0);
   }

   public faj a(fae $$0, Consumer<faj> $$1) {
      return (faj)this.a.computeIfAbsent($$0, $$1x -> {
         faj $$2 = new faj();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(fae $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<fae> b() {
      Object2IntMap<fae> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(fae $$0, faj $$1) {
      this.a.put($$0, $$1);
   }

   Map<fae, faj> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
