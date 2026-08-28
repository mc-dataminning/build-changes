import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fgp {
   private final Reference2ObjectOpenHashMap<fgn, fgs> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public fgs a(fgn $$0) {
      return (fgs)this.a.get($$0);
   }

   public fgs a(fgn $$0, Consumer<fgs> $$1) {
      return (fgs)this.a.computeIfAbsent($$0, $$1x -> {
         fgs $$2 = new fgs();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(fgn $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<fgn> b() {
      Object2IntMap<fgn> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(fgn $$0, fgs $$1) {
      this.a.put($$0, $$1);
   }

   Map<fgn, fgs> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
