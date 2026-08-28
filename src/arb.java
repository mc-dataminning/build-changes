import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class arb {
   private final Object2BooleanMap<ari> a = new Object2BooleanOpenHashMap();

   public Set<ari> a() {
      return this.a.keySet();
   }

   public void a(ari $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(ari $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(ari $$0) {
      this.a.replace($$0, true);
   }

   public void c(ari $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(ari $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(ari $$0) {
      return this.a.getBoolean($$0);
   }
}
