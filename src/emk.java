import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class emk {
   private final Map<emi, emn> a = new HashMap<>();

   @Nullable
   public emn a(emi $$0) {
      return this.a.get($$0);
   }

   public emn a(emi $$0, Consumer<emn> $$1) {
      return this.a.computeIfAbsent($$0, $$1x -> {
         emn $$2 = new emn();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(emi $$0) {
      return this.a.get($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<emi> b() {
      Object2IntMap<emi> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(emi $$0, emn $$1) {
      this.a.put($$0, $$1);
   }

   Map<emi, emn> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
