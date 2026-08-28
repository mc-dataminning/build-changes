import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fcr {
   private final Reference2ObjectOpenHashMap<fcp, fcu> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public fcu a(fcp $$0) {
      return (fcu)this.a.get($$0);
   }

   public fcu a(fcp $$0, Consumer<fcu> $$1) {
      return (fcu)this.a.computeIfAbsent($$0, $$1x -> {
         fcu $$2 = new fcu();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(fcp $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<fcp> b() {
      Object2IntMap<fcp> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(fcp $$0, fcu $$1) {
      this.a.put($$0, $$1);
   }

   Map<fcp, fcu> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
