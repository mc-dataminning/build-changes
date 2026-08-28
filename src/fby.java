import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fby {
   private final Reference2ObjectOpenHashMap<fbw, fcb> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public fcb a(fbw $$0) {
      return (fcb)this.a.get($$0);
   }

   public fcb a(fbw $$0, Consumer<fcb> $$1) {
      return (fcb)this.a.computeIfAbsent($$0, $$1x -> {
         fcb $$2 = new fcb();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(fbw $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<fbw> b() {
      Object2IntMap<fbw> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(fbw $$0, fcb $$1) {
      this.a.put($$0, $$1);
   }

   Map<fbw, fcb> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
