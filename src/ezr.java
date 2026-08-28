import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ezr {
   private final Reference2ObjectOpenHashMap<ezp, ezu> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public ezu a(ezp $$0) {
      return (ezu)this.a.get($$0);
   }

   public ezu a(ezp $$0, Consumer<ezu> $$1) {
      return (ezu)this.a.computeIfAbsent($$0, $$1x -> {
         ezu $$2 = new ezu();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(ezp $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<ezp> b() {
      Object2IntMap<ezp> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(ezp $$0, ezu $$1) {
      this.a.put($$0, $$1);
   }

   Map<ezp, ezu> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
