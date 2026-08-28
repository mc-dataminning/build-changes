import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class aqe {
   private final Object2BooleanMap<aql> a = new Object2BooleanOpenHashMap();

   public Set<aql> a() {
      return this.a.keySet();
   }

   public void a(aql $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(aql $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(aql $$0) {
      this.a.replace($$0, true);
   }

   public void c(aql $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(aql $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(aql $$0) {
      return this.a.getBoolean($$0);
   }
}
