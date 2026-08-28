import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class exf {
   private final Reference2ObjectOpenHashMap<exd, exi> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public exi a(exd $$0) {
      return (exi)this.a.get($$0);
   }

   public exi a(exd $$0, Consumer<exi> $$1) {
      return (exi)this.a.computeIfAbsent($$0, $$1x -> {
         exi $$2 = new exi();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(exd $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<exd> b() {
      Object2IntMap<exd> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(exd $$0, exi $$1) {
      this.a.put($$0, $$1);
   }

   Map<exd, exi> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
