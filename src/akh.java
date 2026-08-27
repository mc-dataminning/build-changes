import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class akh {
   private final Object2BooleanMap<ako> a = new Object2BooleanOpenHashMap();

   public Set<ako> a() {
      return this.a.keySet();
   }

   public void a(ako $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(ako $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(ako $$0) {
      this.a.replace($$0, true);
   }

   public void c(ako $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(ako $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(ako $$0) {
      return this.a.getBoolean($$0);
   }
}
