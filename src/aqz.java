import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class aqz {
   private final Object2BooleanMap<arg> a = new Object2BooleanOpenHashMap();

   public Set<arg> a() {
      return this.a.keySet();
   }

   public void a(arg $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(arg $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(arg $$0) {
      this.a.replace($$0, true);
   }

   public void c(arg $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(arg $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(arg $$0) {
      return this.a.getBoolean($$0);
   }
}
