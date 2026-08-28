import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class exy {
   private final Reference2ObjectOpenHashMap<exw, eyb> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public eyb a(exw $$0) {
      return (eyb)this.a.get($$0);
   }

   public eyb a(exw $$0, Consumer<eyb> $$1) {
      return (eyb)this.a.computeIfAbsent($$0, $$1x -> {
         eyb $$2 = new eyb();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(exw $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<exw> b() {
      Object2IntMap<exw> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(exw $$0, eyb $$1) {
      this.a.put($$0, $$1);
   }

   Map<exw, eyb> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
