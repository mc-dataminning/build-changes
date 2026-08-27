import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ena {
   private final Reference2ObjectOpenHashMap<emy, end> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public end a(emy $$0) {
      return (end)this.a.get($$0);
   }

   public end a(emy $$0, Consumer<end> $$1) {
      return (end)this.a.computeIfAbsent($$0, $$1x -> {
         end $$2 = new end();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(emy $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<emy> b() {
      Object2IntMap<emy> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(emy $$0, end $$1) {
      this.a.put($$0, $$1);
   }

   Map<emy, end> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
