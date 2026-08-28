import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class exu {
   private final Reference2ObjectOpenHashMap<exs, exx> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public exx a(exs $$0) {
      return (exx)this.a.get($$0);
   }

   public exx a(exs $$0, Consumer<exx> $$1) {
      return (exx)this.a.computeIfAbsent($$0, $$1x -> {
         exx $$2 = new exx();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(exs $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<exs> b() {
      Object2IntMap<exs> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(exs $$0, exx $$1) {
      this.a.put($$0, $$1);
   }

   Map<exs, exx> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
