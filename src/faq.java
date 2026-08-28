import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class faq {
   private final Reference2ObjectOpenHashMap<fao, fat> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public fat a(fao $$0) {
      return (fat)this.a.get($$0);
   }

   public fat a(fao $$0, Consumer<fat> $$1) {
      return (fat)this.a.computeIfAbsent($$0, $$1x -> {
         fat $$2 = new fat();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(fao $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<fao> b() {
      Object2IntMap<fao> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(fao $$0, fat $$1) {
      this.a.put($$0, $$1);
   }

   Map<fao, fat> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
