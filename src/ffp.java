import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ffp {
   private final Reference2ObjectOpenHashMap<ffn, ffs> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public ffs a(ffn $$0) {
      return (ffs)this.a.get($$0);
   }

   public ffs a(ffn $$0, Consumer<ffs> $$1) {
      return (ffs)this.a.computeIfAbsent($$0, $$1x -> {
         ffs $$2 = new ffs();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(ffn $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<ffn> b() {
      Object2IntMap<ffn> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(ffn $$0, ffs $$1) {
      this.a.put($$0, $$1);
   }

   Map<ffn, ffs> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
