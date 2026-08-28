import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class exd {
   private final Reference2ObjectOpenHashMap<exb, exg> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public exg a(exb $$0) {
      return (exg)this.a.get($$0);
   }

   public exg a(exb $$0, Consumer<exg> $$1) {
      return (exg)this.a.computeIfAbsent($$0, $$1x -> {
         exg $$2 = new exg();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(exb $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<exb> b() {
      Object2IntMap<exb> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(exb $$0, exg $$1) {
      this.a.put($$0, $$1);
   }

   Map<exb, exg> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
