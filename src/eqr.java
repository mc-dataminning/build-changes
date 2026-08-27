import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class eqr {
   private final Reference2ObjectOpenHashMap<eqp, equ> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public equ a(eqp $$0) {
      return (equ)this.a.get($$0);
   }

   public equ a(eqp $$0, Consumer<equ> $$1) {
      return (equ)this.a.computeIfAbsent($$0, $$1x -> {
         equ $$2 = new equ();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(eqp $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<eqp> b() {
      Object2IntMap<eqp> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(eqp $$0, equ $$1) {
      this.a.put($$0, $$1);
   }

   Map<eqp, equ> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
