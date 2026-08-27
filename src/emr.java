import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class emr {
   private final Reference2ObjectOpenHashMap<emp, emu> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public emu a(emp $$0) {
      return (emu)this.a.get($$0);
   }

   public emu a(emp $$0, Consumer<emu> $$1) {
      return (emu)this.a.computeIfAbsent($$0, $$1x -> {
         emu $$2 = new emu();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(emp $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<emp> b() {
      Object2IntMap<emp> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(emp $$0, emu $$1) {
      this.a.put($$0, $$1);
   }

   Map<emp, emu> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
