import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ffh {
   private final Reference2ObjectOpenHashMap<fff, ffk> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public ffk a(fff $$0) {
      return (ffk)this.a.get($$0);
   }

   public ffk a(fff $$0, Consumer<ffk> $$1) {
      return (ffk)this.a.computeIfAbsent($$0, $$1x -> {
         ffk $$2 = new ffk();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(fff $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<fff> b() {
      Object2IntMap<fff> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(fff $$0, ffk $$1) {
      this.a.put($$0, $$1);
   }

   Map<fff, ffk> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
