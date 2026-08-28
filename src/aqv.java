import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class aqv {
   private final Object2BooleanMap<ard> a = new Object2BooleanOpenHashMap();

   public Set<ard> a() {
      return this.a.keySet();
   }

   public void a(ard $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(ard $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(ard $$0) {
      this.a.replace($$0, true);
   }

   public void c(ard $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(ard $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(ard $$0) {
      return this.a.getBoolean($$0);
   }
}
