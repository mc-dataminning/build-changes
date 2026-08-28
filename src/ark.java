import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class ark {
   private final Object2BooleanMap<arr> a = new Object2BooleanOpenHashMap();

   public Set<arr> a() {
      return this.a.keySet();
   }

   public void a(arr $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(arr $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(arr $$0) {
      this.a.replace($$0, true);
   }

   public void c(arr $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(arr $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(arr $$0) {
      return this.a.getBoolean($$0);
   }
}
