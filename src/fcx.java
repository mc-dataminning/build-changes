import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fcx {
   private final Reference2ObjectOpenHashMap<fcv, fda> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public fda a(fcv $$0) {
      return (fda)this.a.get($$0);
   }

   public fda a(fcv $$0, Consumer<fda> $$1) {
      return (fda)this.a.computeIfAbsent($$0, $$1x -> {
         fda $$2 = new fda();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(fcv $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<fcv> b() {
      Object2IntMap<fcv> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(fcv $$0, fda $$1) {
      this.a.put($$0, $$1);
   }

   Map<fcv, fda> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
