import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ezc {
   private final Reference2ObjectOpenHashMap<eza, ezf> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public ezf a(eza $$0) {
      return (ezf)this.a.get($$0);
   }

   public ezf a(eza $$0, Consumer<ezf> $$1) {
      return (ezf)this.a.computeIfAbsent($$0, $$1x -> {
         ezf $$2 = new ezf();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(eza $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<eza> b() {
      Object2IntMap<eza> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(eza $$0, ezf $$1) {
      this.a.put($$0, $$1);
   }

   Map<eza, ezf> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
