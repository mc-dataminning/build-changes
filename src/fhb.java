import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fhb {
   private final Reference2ObjectOpenHashMap<fgz, fhe> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public fhe a(fgz $$0) {
      return (fhe)this.a.get($$0);
   }

   public fhe a(fgz $$0, Consumer<fhe> $$1) {
      return (fhe)this.a.computeIfAbsent($$0, $$1x -> {
         fhe $$2 = new fhe();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(fgz $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<fgz> b() {
      Object2IntMap<fgz> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(fgz $$0, fhe $$1) {
      this.a.put($$0, $$1);
   }

   Map<fgz, fhe> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
