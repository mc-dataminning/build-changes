import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class exs {
   private final Reference2ObjectOpenHashMap<exq, exv> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public exv a(exq $$0) {
      return (exv)this.a.get($$0);
   }

   public exv a(exq $$0, Consumer<exv> $$1) {
      return (exv)this.a.computeIfAbsent($$0, $$1x -> {
         exv $$2 = new exv();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(exq $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<exq> b() {
      Object2IntMap<exq> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(exq $$0, exv $$1) {
      this.a.put($$0, $$1);
   }

   Map<exq, exv> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
