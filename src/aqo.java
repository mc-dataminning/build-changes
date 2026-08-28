import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class aqo {
   private final Object2BooleanMap<aqv> a = new Object2BooleanOpenHashMap();

   public Set<aqv> a() {
      return this.a.keySet();
   }

   public void a(aqv $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(aqv $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(aqv $$0) {
      this.a.replace($$0, true);
   }

   public void c(aqv $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(aqv $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(aqv $$0) {
      return this.a.getBoolean($$0);
   }
}
