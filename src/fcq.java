import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fcq {
   private final Reference2ObjectOpenHashMap<fco, fct> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public fct a(fco $$0) {
      return (fct)this.a.get($$0);
   }

   public fct a(fco $$0, Consumer<fct> $$1) {
      return (fct)this.a.computeIfAbsent($$0, $$1x -> {
         fct $$2 = new fct();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(fco $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<fco> b() {
      Object2IntMap<fco> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(fco $$0, fct $$1) {
      this.a.put($$0, $$1);
   }

   Map<fco, fct> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
