import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fgb {
   private final Reference2ObjectOpenHashMap<ffz, fge> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public fge a(ffz $$0) {
      return (fge)this.a.get($$0);
   }

   public fge a(ffz $$0, Consumer<fge> $$1) {
      return (fge)this.a.computeIfAbsent($$0, $$1x -> {
         fge $$2 = new fge();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(ffz $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<ffz> b() {
      Object2IntMap<ffz> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(ffz $$0, fge $$1) {
      this.a.put($$0, $$1);
   }

   Map<ffz, fge> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
