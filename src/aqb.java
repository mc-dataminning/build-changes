import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class aqb {
   private final Object2BooleanMap<aqi> a = new Object2BooleanOpenHashMap();

   public Set<aqi> a() {
      return this.a.keySet();
   }

   public void a(aqi $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(aqi $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(aqi $$0) {
      this.a.replace($$0, true);
   }

   public void c(aqi $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(aqi $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(aqi $$0) {
      return this.a.getBoolean($$0);
   }
}
