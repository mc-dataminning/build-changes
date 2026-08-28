import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fam {
   private final Reference2ObjectOpenHashMap<fak, fap> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public fap a(fak $$0) {
      return (fap)this.a.get($$0);
   }

   public fap a(fak $$0, Consumer<fap> $$1) {
      return (fap)this.a.computeIfAbsent($$0, $$1x -> {
         fap $$2 = new fap();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(fak $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<fak> b() {
      Object2IntMap<fak> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(fak $$0, fap $$1) {
      this.a.put($$0, $$1);
   }

   Map<fak, fap> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
