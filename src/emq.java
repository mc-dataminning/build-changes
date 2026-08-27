import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class emq {
   private final Reference2ObjectOpenHashMap<emo, emt> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public emt a(emo $$0) {
      return (emt)this.a.get($$0);
   }

   public emt a(emo $$0, Consumer<emt> $$1) {
      return (emt)this.a.computeIfAbsent($$0, $$1x -> {
         emt $$2 = new emt();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(emo $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<emo> b() {
      Object2IntMap<emo> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(emo $$0, emt $$1) {
      this.a.put($$0, $$1);
   }

   Map<emo, emt> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
