import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class aqh {
   private final Object2BooleanMap<aqo> a = new Object2BooleanOpenHashMap();

   public Set<aqo> a() {
      return this.a.keySet();
   }

   public void a(aqo $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(aqo $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(aqo $$0) {
      this.a.replace($$0, true);
   }

   public void c(aqo $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(aqo $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(aqo $$0) {
      return this.a.getBoolean($$0);
   }
}
