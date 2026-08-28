import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ewr {
   private final Reference2ObjectOpenHashMap<ewp, ewu> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public ewu a(ewp $$0) {
      return (ewu)this.a.get($$0);
   }

   public ewu a(ewp $$0, Consumer<ewu> $$1) {
      return (ewu)this.a.computeIfAbsent($$0, $$1x -> {
         ewu $$2 = new ewu();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(ewp $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<ewp> b() {
      Object2IntMap<ewp> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(ewp $$0, ewu $$1) {
      this.a.put($$0, $$1);
   }

   Map<ewp, ewu> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
