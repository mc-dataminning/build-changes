import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class ard {
   private final Object2BooleanMap<ark> a = new Object2BooleanOpenHashMap();

   public Set<ark> a() {
      return this.a.keySet();
   }

   public void a(ark $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(ark $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(ark $$0) {
      this.a.replace($$0, true);
   }

   public void c(ark $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(ark $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(ark $$0) {
      return this.a.getBoolean($$0);
   }
}
