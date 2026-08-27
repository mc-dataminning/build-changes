import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class amc {
   private final Object2BooleanMap<amj> a = new Object2BooleanOpenHashMap();

   public Set<amj> a() {
      return this.a.keySet();
   }

   public void a(amj $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(amj $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(amj $$0) {
      this.a.replace($$0, true);
   }

   public void c(amj $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(amj $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(amj $$0) {
      return this.a.getBoolean($$0);
   }
}
