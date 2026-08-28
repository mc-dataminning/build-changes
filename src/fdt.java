import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fdt {
   private final Reference2ObjectOpenHashMap<fdr, fdw> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public fdw a(fdr $$0) {
      return (fdw)this.a.get($$0);
   }

   public fdw a(fdr $$0, Consumer<fdw> $$1) {
      return (fdw)this.a.computeIfAbsent($$0, $$1x -> {
         fdw $$2 = new fdw();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(fdr $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<fdr> b() {
      Object2IntMap<fdr> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(fdr $$0, fdw $$1) {
      this.a.put($$0, $$1);
   }

   Map<fdr, fdw> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
