import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class arg {
   private final Object2BooleanMap<aro> a = new Object2BooleanOpenHashMap();

   public Set<aro> a() {
      return this.a.keySet();
   }

   public void a(aro $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(aro $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(aro $$0) {
      this.a.replace($$0, true);
   }

   public void c(aro $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(aro $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(aro $$0) {
      return this.a.getBoolean($$0);
   }
}
