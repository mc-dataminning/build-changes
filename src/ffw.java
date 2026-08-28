import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ffw {
   private final Reference2ObjectOpenHashMap<ffu, ffz> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public ffz a(ffu $$0) {
      return (ffz)this.a.get($$0);
   }

   public ffz a(ffu $$0, Consumer<ffz> $$1) {
      return (ffz)this.a.computeIfAbsent($$0, $$1x -> {
         ffz $$2 = new ffz();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(ffu $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<ffu> b() {
      Object2IntMap<ffu> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(ffu $$0, ffz $$1) {
      this.a.put($$0, $$1);
   }

   Map<ffu, ffz> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
