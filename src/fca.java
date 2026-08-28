import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fca {
   private final Reference2ObjectOpenHashMap<fby, fcd> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public fcd a(fby $$0) {
      return (fcd)this.a.get($$0);
   }

   public fcd a(fby $$0, Consumer<fcd> $$1) {
      return (fcd)this.a.computeIfAbsent($$0, $$1x -> {
         fcd $$2 = new fcd();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(fby $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<fby> b() {
      Object2IntMap<fby> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(fby $$0, fcd $$1) {
      this.a.put($$0, $$1);
   }

   Map<fby, fcd> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
