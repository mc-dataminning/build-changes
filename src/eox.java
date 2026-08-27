import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class eox {
   private final Reference2ObjectOpenHashMap<eov, epa> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public epa a(eov $$0) {
      return (epa)this.a.get($$0);
   }

   public epa a(eov $$0, Consumer<epa> $$1) {
      return (epa)this.a.computeIfAbsent($$0, $$1x -> {
         epa $$2 = new epa();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(eov $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<eov> b() {
      Object2IntMap<eov> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(eov $$0, epa $$1) {
      this.a.put($$0, $$1);
   }

   Map<eov, epa> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
