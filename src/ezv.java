import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ezv {
   private final Reference2ObjectOpenHashMap<ezt, ezy> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public ezy a(ezt $$0) {
      return (ezy)this.a.get($$0);
   }

   public ezy a(ezt $$0, Consumer<ezy> $$1) {
      return (ezy)this.a.computeIfAbsent($$0, $$1x -> {
         ezy $$2 = new ezy();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(ezt $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<ezt> b() {
      Object2IntMap<ezt> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(ezt $$0, ezy $$1) {
      this.a.put($$0, $$1);
   }

   Map<ezt, ezy> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
